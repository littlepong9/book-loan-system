package com.example.book.controller.admin;

import com.example.book.controller.admin.domain.AdminLoginForm;
import com.example.book.controller.book.domain.BookRegForm;
import com.example.book.service.admin.AdminService;
import com.example.book.service.book.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;
    private final BookService bookService;

    @GetMapping("home")
    public String home(){
        return "admin/home";
    }

    @GetMapping("login")
    public String login(@ModelAttribute("form")AdminLoginForm form){
        return "/admin/login";
    }

    @PostMapping("login")
    public String login(@Validated @ModelAttribute("form") AdminLoginForm form, BindingResult br){
        if(br.hasErrors())
            return "/admin/login";

        String adminId = adminService.login(form);

        return "redirect:/admin/home";
    }

    // 책 등록
    @GetMapping("reg-book")
    public String regBook(@ModelAttribute("form") BookRegForm form){
        return "book/reg";
    }

    @PostMapping("reg-book")
    public String regBook(@Validated @ModelAttribute("form")BookRegForm form, BindingResult br){
        return "redirect:/admin/home";
    }
}
