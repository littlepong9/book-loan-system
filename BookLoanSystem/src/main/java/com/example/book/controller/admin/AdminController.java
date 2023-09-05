package com.example.book.controller.admin;

import com.example.book.controller.admin.domain.AdminLoginForm;
import com.example.book.controller.admin.domain.BookRegForm;
import com.example.book.domain.vo.BookVO;
import com.example.book.service.admin.AdminService;
import com.example.book.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin/")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    private final BookService bookservice;

    @GetMapping("home")
    public String home(Model model,
                       @RequestParam String field,
                       @RequestParam String keyword,
                       @RequestParam int page,
                       @RequestParam int maxResult,
                       @RequestParam String sortBy,
                       @RequestParam String order){
        // field : 검색 컬럼명, keyword : 검색키워드, page : 현재페이지, maxResult : 검색결과 갯수
        // sortBy : 정렬순(제목순,저자순,발행처순)
        // order : 오름차순, 내림차순
        List<BookVO> bookList = bookservice.listSearch(field,keyword,page,maxResult,sortBy,order);
        model.addAttribute("bookList", bookList);
        return "admin/home";
    }

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
    public String regBook(@Validated @ModelAttribute("form")BookRegForm form, BindingResult br){
        adminService.regBook(form);
        return "redirect:/admin/home";
    }
}
