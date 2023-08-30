package com.example.book.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class BookVO {
    private int no;
    private String title;
    private String author;
    private String publisher;
    private String lib;
    private int state;
    private String target;
    private String type;
}
