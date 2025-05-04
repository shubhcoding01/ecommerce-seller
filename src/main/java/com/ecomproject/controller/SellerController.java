package com.ecomproject.controller;

import com.ecomproject.model.VerificationCode;
import com.ecomproject.repository.VerificationCodeRepository;
import com.ecomproject.request.LoginRequest;
import com.ecomproject.response.ApiResponse;
import com.ecomproject.response.AuthResponse;
import com.ecomproject.service.AuthService;
import com.ecomproject.service.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sellers")
public class SellerController {

    private final SellerService sellerService;
    private final VerificationCodeRepository verificationCodeRepository;
    private final AuthService authService;

//    @PostMapping("/sent/loginotp")
//    public ResponseEntity<ApiResponse> sentOtpHandler(
//            @RequestBody VerificationCode req) throws Exception {
//
//        authService.sentLoginOtp(req.getEmail());
//
//        ApiResponse res=new ApiResponse();
//
//        res.setMessage("Otp Sent successfully");
//
//
//        return ResponseEntity.ok(res);
//    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> loginSeller(
            @RequestBody LoginRequest req
    ) throws Exception {

        String otp = req.getOtp();
        String email = req.getEmail();

//        VerificationCode verificationCode = verificationCodeRepository.findByEmail(email);
//        if (verificationCode == null || !verificationCode.getOtp().equals(req.getOtp())) {
//            throw new Exception("Wrong Otp...!!!");
//        }

        req.setEmail("Seller"+email );
        AuthResponse authResponse = authService.signing(req);

        return ResponseEntity.ok(authResponse);
    }
}
