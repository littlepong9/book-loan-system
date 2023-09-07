package com.example.book.mapper.book;

import com.example.book.controller.admin.domain.BookRegForm;
import com.example.book.controller.admin.domain.BookUpdateForm;
import com.example.book.domain.vo.BookVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    void save(BookVO bookVO);
    List<BookVO> findAllBySearch(String field, String keyword, int page, int maxResult, String sortBy, String order);
    int findCountBySearch(String field, String keyword);
    void update(int no, BookUpdateForm form);
    void delete(int no);
}