package com.ecomproject.service.impl;

import com.ecomproject.config.JwtProvider;
import com.ecomproject.model.User;
import com.ecomproject.repository.UserRepository;
import com.ecomproject.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;

    @Override
    public User findUserByJwtToken(String jwt) throws Exception {
        String email = jwtProvider.getEmailFromToken(jwt);

        User user = this.findUserByEmail(email);

        if(user == null){
            throw new Exception("User Not Found With this email : " + email);
        }

        return user;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }
}
