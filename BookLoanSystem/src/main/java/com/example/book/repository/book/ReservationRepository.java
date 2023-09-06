package com.example.book.repository.book;

import com.example.book.domain.vo.ReservationVO;
import com.example.book.mapper.book.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// 예약 저장소
// 등록, 수정, 삭제, 조회(단 건, 회원별, 도서별)
@Repository
public class ReservationRepository {
    @Autowired
    ReservationMapper reservationMapper;

    public void save(ReservationVO reservation) {
        reservationMapper.save(reservation);
    }
}