package com.example.book.controller.admin.domain;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

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
    @NotBlank(message = "필수 입력 정보입니다.")
    private String target;
    @NotBlank(message = "필수 입력 정보입니다.")
    private String type;
    @NotBlank(message = "필수 입력 정보입니다.")
    private MultipartFile attachFile;
}