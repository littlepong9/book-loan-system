package com.example.book;

import com.example.book.controller.user.domain.UserUpdateForm;
import com.example.book.domain.vo.LoanVO;
import com.example.book.mapper.admin.AdminMapper;
import com.example.book.mapper.book.BookMapper;
import com.example.book.mapper.book.LoanMapper;
import com.example.book.mapper.user.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@SpringBootTest
class BookLoanSystemApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    AdminMapper adminMapper;
    @Autowired
    LoanMapper loanMapper;
    @Autowired
    BookMapper bookMapper;

    @Test
    void contextLoads() {
//        LoanVO loanVO = new LoanVO();
//        loanVO.setBookNo(0);
//        loanVO.setLoanDate(LocalDateTime.now());
//        loanVO.setUserId("dummy");
//        loanVO.setReturnDate(LocalDateTime.now().plusDays(14));
//        loanMapper.save(loanVO);

    }
}