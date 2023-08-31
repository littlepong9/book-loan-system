package com.example.book.controller.book;

import com.example.book.controller.book.domain.BookRegForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/book/")
public class BookController {

    // 책 등록
    @GetMapping("reg-book")
    public String regBook(@ModelAttribute("form")BookRegForm form){

        return "book/reg";
    }
}
