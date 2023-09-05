package com.example.book.controller.admin.domain;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class BookRegForm {
    @NotBlank(message = "필수 입력 정보입니다.")
    private String title;
    @NotBlank(message = "필수 입력 정보입니다.")
    private String author;
    @NotBlank(message = "필수 입력 정보입니다.")
    private String publisher;
    @NotBlank(message = "필수 입력 정보입니다.")
    private String lib;
    private int state;
    @NotBlank(message = "필수 입력 정보입니다.")
    private String target;
    @NotBlank(message = "필수 입력 정보입니다.")
    private String type;
    @NotBlank(message = "필수 입력 정보입니다.")
    private String imagePath;
}
