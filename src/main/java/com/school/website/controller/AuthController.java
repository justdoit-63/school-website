package com.school.controller;

import com.school.dto.AuthRequest;
import com.school.dto.AuthResponse;
import com.school.dto.RegisterRequest;
import com.school.dto.UserDTO;
import com.school.service.AuthService;
import com.school.util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    private final JwtUtil jwtUtil;

    @Autowired
    public AuthController(AuthService authService, JwtUtil jwtUtil) {
        this.authService = authService;
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        AuthResponse response = authService.authenticateUser(request);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        authService.registerUser(request);
        return ResponseEntity.ok("User registered successfully");
    }

    @GetMapping("/me")
    public ResponseEntity<UserDTO> getCurrentUser(@AuthenticationPrincipal UserDetails userDetails) {
        UserDTO userDto = authService.getCurrentUser(userDetails);
        return ResponseEntity.ok(userDto);
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        // For JWT, logout is client-side: remove token
        return ResponseEntity.ok("Logged out successfully");
    }

    @PostMapping("/change-password")
    public ResponseEntity<String> changePassword(@RequestParam String oldPassword, @RequestParam String newPassword) {
        authService.changePassword(oldPassword, newPassword);
        return ResponseEntity.ok("Password changed successfully");
    }
}
