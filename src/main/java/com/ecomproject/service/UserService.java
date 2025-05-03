package com.ecomproject.service;

import com.ecomproject.model.User;

public interface UserService {
    User findUserByJwtToken(String jwt);
    User findUserByUsername(String username);
}
