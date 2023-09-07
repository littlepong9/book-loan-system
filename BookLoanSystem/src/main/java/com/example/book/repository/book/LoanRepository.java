package com.example.book.repository.book;

import com.example.book.domain.vo.LoanVO;
import com.example.book.mapper.book.BookMapper;
import com.example.book.mapper.book.LoanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// 대출 저장소
// 등록, 수정, 삭제, 조회(단건, 회원별 리스트, 도서별 리스트)
@Repository
public class LoanRepository {
    @Autowired
    LoanMapper loanMapper;

    public void save(LoanVO loan) {
        loanMapper.save(loan);
    }
}
