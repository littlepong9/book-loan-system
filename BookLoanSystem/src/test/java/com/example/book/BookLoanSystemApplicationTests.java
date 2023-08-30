package com.example.book;

import com.example.book.mapper.SampleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookLoanSystemApplicationTests {
    @Autowired
    SampleMapper sampleMapper;

    @Test
    void contextLoads() {
        System.out.println(sampleMapper.select_all());
    }
}
