package com.ecomproject.service.impl;

import com.ecomproject.repository.UserRepository;
import com.ecomproject.response.SignupRequest;
import com.ecomproject.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public String createUser(SignupRequest req) {
        return "";
    }
}
