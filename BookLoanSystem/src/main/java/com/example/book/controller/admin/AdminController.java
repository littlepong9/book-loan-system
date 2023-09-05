package com.example.book.controller.admin;

import com.example.book.controller.admin.domain.AdminLoginForm;
import com.example.book.controller.admin.domain.BookRegForm;
import com.example.book.controller.admin.file.FileStore;
import com.example.book.controller.admin.file.UploadFile;
import com.example.book.domain.vo.BookVO;
import com.example.book.service.admin.AdminService;
import com.example.book.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

@Controller
@RequestMapping("/admin/")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    private final BookService bookService;
    private final FileStore fileStore;
    @Value("${file.dir}")
    private String fileDir;

    // 관리자 홈
    @GetMapping("home")
    public String home(Model model,
                       @RequestParam(defaultValue = "title") String field,
                       @RequestParam(defaultValue = "") String keyword,
                       @RequestParam(defaultValue = "1") int page,
                       @RequestParam(defaultValue = "10") int maxResult,
                       @RequestParam(defaultValue = "title") String sortBy,
                       @RequestParam(defaultValue = "") String order){
        // field : 검색 컬럼명, keyword : 검색키워드, page : 현재페이지, maxResult : 검색결과 갯수
        // sortBy : 정렬순(제목순,저자순,발행처순)
        // order : 오름차순, 내림차순
        List<BookVO> bookList = bookService.listSearch(field,keyword,page,maxResult,sortBy,order);
        model.addAttribute("bookList", bookList);
        return "admin/home";
    }

    // 관리자 로그인
    @GetMapping("login")
    public String login(@ModelAttribute("form")AdminLoginForm form){
        return "/admin/login";
    }

    @PostMapping("login")
    public String login(@Validated @ModelAttribute("form") AdminLoginForm form, BindingResult br, HttpSession session){
        if(br.hasErrors())
            return "/admin/login";

        String adminId = adminService.login(form);
        if(adminId!=null){
            session.setAttribute("adminId",adminId);
        }

        return "redirect:/admin/home";
    }

    // 책 등록
    @GetMapping("reg-book")
    public String regBook(@ModelAttribute("form") BookRegForm form){
        return "admin/book-reg";
    }

    @PostMapping("reg-book")
    public String regBook(@Validated @ModelAttribute("form")BookRegForm form, BindingResult br) throws IOException {
        UploadFile attachFile = fileStore.storeFile(form.getAttachFile());

        // 책 번호(no)는 시퀀스, 상태(state)는 대출가능으로 자동저장
        BookVO book = new BookVO();
        book.setAuthor(form.getAuthor());
        book.setLib(form.getLib());
        book.setTarget(form.getTarget());
        book.setType(form.getType());
        book.setPublisher(form.getPublisher());
        book.setTitle(form.getTitle());
        book.setImagePath(attachFile.getStoreFilename());
        adminService.regBook(book);
        return "redirect:/admin/home";
    }


}
