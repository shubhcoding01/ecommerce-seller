package com.ecomproject.service.impl;

import com.ecomproject.model.User;
import com.ecomproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public User findUserByJwtToken(String jwt) {
        return null;
    }

    @Override
    public User findUserByUsername(String username) {
        return null;
    }
}
