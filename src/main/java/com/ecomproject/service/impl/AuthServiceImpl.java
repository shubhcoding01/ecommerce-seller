package com.ecomproject.service.impl;

import com.ecomproject.response.SignupRequest;
import com.ecomproject.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    @Override
    public String createUser(SignupRequest req) {
        return "";
    }
}
