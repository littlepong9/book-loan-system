package com.example.book.service.user;

import com.example.book.controller.user.domain.UserJoinForm;
import com.example.book.controller.user.domain.UserLoginForm;
import com.example.book.controller.user.domain.UserUpdateForm;
import com.example.book.domain.vo.UserVO;
import com.example.book.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void join(UserJoinForm form) {
        UserVO user = new UserVO();
        user.setId(form.getId());
        user.setPw(form.getPw1());
        user.setName(form.getName());
        user.setTel(form.getTel());
        user.setAddr(form.getAddr());
//        userRepository.save(user);
    }

    public UserVO login(UserLoginForm user) {
//        return userRepository.findByIdAndPw(user.getId(),user.getPw());
        return null;
    }

    public UserVO userInfo(String userId) {
        return null;
    }

    public void update(String userId, UserUpdateForm form) {
//        userRepository.update(userId, form);
    }

    public void delete(String userId) {
//        userRepository.delete(userId);
    }
}
