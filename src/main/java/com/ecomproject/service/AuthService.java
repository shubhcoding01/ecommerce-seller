package com.ecomproject.service;

import com.ecomproject.response.SignupRequest;

public interface AuthService {

    String createUser(SignupRequest req);
}
