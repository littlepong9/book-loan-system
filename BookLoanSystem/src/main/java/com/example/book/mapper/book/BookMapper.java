package com.example.book.mapper.book;

import com.example.book.controller.admin.domain.BookRegForm;
import com.example.book.controller.admin.domain.BookUpdateForm;
import com.example.book.domain.vo.BookVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {
    void save(BookVO bookVO);


    void update(int no, BookUpdateForm form);
    void delete(int no);
}