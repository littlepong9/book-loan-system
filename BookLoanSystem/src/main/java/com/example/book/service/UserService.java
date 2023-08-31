package com.example.book.service;

import com.example.book.controller.domain.UserLoginForm;
import com.example.book.domain.vo.UserVO;
import com.example.book.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void join(UserVO user) {
//        userRepository.save(user);
    }

    public UserVO login(UserLoginForm user) {
//        return userRepository.findByIdAndPw(user.getId(),user.getPw());
        return null;
    }
}
