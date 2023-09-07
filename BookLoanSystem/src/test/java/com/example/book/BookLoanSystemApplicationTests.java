package com.example.book;

import com.example.book.domain.vo.BookVO;
import com.example.book.mapper.admin.AdminMapper;
import com.example.book.mapper.book.BookMapper;
import com.example.book.mapper.user.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BookLoanSystemApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    BookMapper bookMapper;

    @Test
    void contextLoads() {

    }
}