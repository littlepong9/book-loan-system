package com.example.book.controller.admin.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AdminLoginForm {
    @NotBlank(message = "아이디를 입력해주세요.")
    private String id;
    @NotBlank(message = "비밀번호를 입력해주세요.")
    private String pw;
}