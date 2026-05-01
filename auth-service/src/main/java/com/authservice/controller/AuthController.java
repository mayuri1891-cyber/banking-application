package com.authservice.controller;

import com.authservice.dto.AuthRequest;
import com.authservice.dto.AuthResponse;
import com.authservice.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import java.util.List;
@lombok.extern.slf4j.Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;



    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {

        String token = authService.authenticate(
                request.getUsername(),
                request.getPassword()
        );

        // ✅ VERY IMPORTANT
        UsernamePasswordAuthenticationToken authentication =
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        null,
                        List.of() // roles if needed
                );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        return new AuthResponse(token);
    }
}