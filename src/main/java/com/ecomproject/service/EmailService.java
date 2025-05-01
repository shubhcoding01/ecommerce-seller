package com.ecomproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmailService {

    private final JavaMailSender mailSender;

    public void sendVerificationOtpEmail(String userEmail, String otp, String subject,
                                         String text) {
        try {

        }
        catch (MailException e){
            throw new MailSendException("Error sending verification OTP email") ;

        }
    }
}
