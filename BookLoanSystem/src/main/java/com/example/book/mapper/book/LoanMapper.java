package com.example.book.mapper.book;

import com.example.book.domain.vo.LoanVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoanMapper {
    void save(LoanVO loanVO);
}
