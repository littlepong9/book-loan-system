package com.example.book.mapper.book;

import com.example.book.controller.admin.domain.BookUpdateForm;
import com.example.book.domain.vo.BookVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {
    void save(BookVO bookVO);

    // 도서 정보 수정
    void update(int no, BookUpdateForm form);

    // 도서 정보 삭제
    void delete(int no);

}