package com.example.book.mapper.book;

import com.example.book.domain.vo.ReservationVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReservationMapper {
    void save(ReservationVO reservationVO);
}
