package com.ecomproject.controller;

import com.ecomproject.model.User;
import com.ecomproject.repository.UserRepository;
import com.ecomproject.response.AuthResponse;
import com.ecomproject.response.SignupRequest;
import com.ecomproject.role.UserRole;
import com.ecomproject.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> createUserHandler(@RequestBody SignupRequest req) throws Exception {

        String jwt=authService.createUser(req);

        AuthResponse resq=new AuthResponse();
        resq.setJwt(jwt);
        resq.setMessage("registered successfully");
        resq.setRole(UserRole.ROLE_CUSTOMER);


//        User user = new User();
//        user.setEmail(req.getEmail());
//        user.setFullName(req.getFullName());
//
//
//        User savedUser=userRepository.save(user);

        return ResponseEntity.ok(resq);
    }
}
