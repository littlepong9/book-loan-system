package com.example.book.mapper.book;

import com.example.book.controller.admin.domain.BookUpdateForm;
import com.example.book.domain.vo.BookVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

@Mapper
public interface BookMapper {
    void save(BookVO bookVO);
    List<BookVO> findAllBySearch(
            String field,
            String keyword,
            int page,
            int maxResult,
            int offset,
            String sortBy,
            String order
    );
    int findCountBySearch(String field, String keyword);
    void update(int no, BookVO form);
    void delete(int no);
}