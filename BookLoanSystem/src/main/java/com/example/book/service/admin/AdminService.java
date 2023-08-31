package com.example.book.service.admin;

import com.example.book.controller.admin.domain.AdminLoginForm;
import com.example.book.repository.admin.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class AdminService {

    private final AdminRepository adminRepository;

    public String login(AdminLoginForm form) {
//        return adminRepository.login(form.getId(), form.getPw());
        return null;
    }
}
