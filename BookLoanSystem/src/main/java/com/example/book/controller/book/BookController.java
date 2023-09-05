package com.example.book.controller.book;

import com.example.book.controller.admin.file.FileStore;
import com.example.book.domain.vo.BookVO;
import com.example.book.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/book/")
public class BookController {

    private final BookService bookService;
    private final FileStore fileStore;
    @Value("${file.dir}")
    private String fileDir;

    @GetMapping("list")
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
        return "book/list";
    }

    // 도서 이미지 불러오기
    @ResponseBody
    @GetMapping("images/{filename}")
    public Resource imageView(@PathVariable String filename) throws MalformedURLException {
        return new UrlResource("file:" + fileStore.getFullPath(filename));
    }

}
