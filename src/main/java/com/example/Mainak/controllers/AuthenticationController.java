package com.example.Mainak.controllers;

import com.example.Mainak.auth.AuthenticationRequest;
import com.example.Mainak.auth.AuthenticationResponse;
import com.example.Mainak.auth.RegisterRequest;
import com.example.Mainak.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService Service;

    // Register a new user
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
        try {
            return ResponseEntity.ok(Service.register(request));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);  // Handle registration errors
        }
    }

    // Authenticate user and generate token
    @PostMapping("/authentication")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(Service.authenticate(request));
    }



}
