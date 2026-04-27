package com.authservice.controller;

import com.authservice.dto.AuthRequest;
import com.authservice.dto.AuthResponse;
import com.authservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@lombok.extern.slf4j.Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;



    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
    log.info("Received login request for username 1: {}", request.getUsername());
        String token = authService.authenticate(
                request.getUsername(),
                request.getPassword()
        );

        return new AuthResponse(token);
    }
}