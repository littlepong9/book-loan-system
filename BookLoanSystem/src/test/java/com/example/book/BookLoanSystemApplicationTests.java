package com.example.book;

import com.example.book.controller.user.domain.UserUpdateForm;
import com.example.book.mapper.admin.AdminMapper;
import com.example.book.mapper.user.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookLoanSystemApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Autowired
    AdminMapper adminMapper;

    @Test
    void contextLoads() {
//        UserVO user = new UserVO();
//        user.setId("dummyId");
//        user.setPw("dummyPw");
//        user.setName("dummyName");
//        user.setTel("dummyTel");
//        user.setAddr("dummyAddr");

//        System.out.println(adminMapper.login("dummyId", "dummyPw2"));
    }
}
