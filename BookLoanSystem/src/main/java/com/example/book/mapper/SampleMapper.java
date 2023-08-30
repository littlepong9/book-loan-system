package com.example.book.mapper;

import com.example.book.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {
    UserVO select_all();
}
