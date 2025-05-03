package com.ecomproject.service;

import com.ecomproject.request.LoginRequest;
import com.ecomproject.response.AuthResponse;
import com.ecomproject.response.SignupRequest;

public interface AuthService {

    void sentLoginOtp(String email) throws Exception;

    String createUser(SignupRequest req) throws Exception;

    AuthResponse signing(LoginRequest req);
}
