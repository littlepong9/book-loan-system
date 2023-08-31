package com.example.book.controller;

import com.example.book.controller.domain.UserJoinForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
public class UserController {

    @GetMapping("join")
    public String join(@ModelAttribute("form") UserJoinForm form){
        return "user/join";
    }

    @PostMapping("join")
    public String join(@Validated @ModelAttribute("form") UserJoinForm form, BindingResult br){
        if(br.hasErrors()){
            return "user/join";
        }

        return "redirect:/";
    }
}
