package com.ecomproject.service;

import com.ecomproject.response.SignupRequest;

public interface AuthService {

    void sentLoginOtp(String email);

    String createUser(SignupRequest req) throws Exception;
}
