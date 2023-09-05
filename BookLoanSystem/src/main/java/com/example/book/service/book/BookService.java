package com.example.book.service.book;

import com.example.book.domain.vo.BookVO;
import com.example.book.repository.book.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class BookService {
    private final BookRepository bookRepository;

    public List<BookVO> listSearch(String field, String keyword,int page,int maxResult,String sortBy, String order) {
        return bookRepository.findAllBySearch(field,keyword,page,maxResult,sortBy,order);
    }
}
