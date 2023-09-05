package com.example.book.repository.book;

import com.example.book.domain.vo.BookVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookRepository {
    public void save(BookVO book) {

    }

    public List<BookVO> findAllBySearch(String field, String keyword,int page,int maxResult,String sortBy, String order) {
        return null;
    }
}
