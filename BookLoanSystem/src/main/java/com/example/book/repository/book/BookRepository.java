package com.example.book.repository.book;

import com.example.book.controller.admin.domain.BookUpdateForm;
import com.example.book.domain.vo.BookVO;
import org.springframework.stereotype.Repository;

import java.util.List;

// 도서 저장소 등록, 수정, 삭제, 조회(단 건, 검색, 검색 결과로 나온 총 도서 수량)
@Repository
public class BookRepository {
    public void save(BookVO book) {

    }

    // 검색 결과 도서 리스트
    public List<BookVO> findAllBySearch(String field, String keyword,int page,int maxResult,String sortBy, String order) {
        return null;
    }

    // 검색 결과로 나온 총 도서 수량 (view 페이징 시 필요)
    public int findCountBySearch(String field, String keyword){
        return 0;
    }

    // 도서 정보 수정
    public void update(int no, BookUpdateForm form) {

    }

    // 도서 정보 삭제
    public void delete(int no) {

    }
}
