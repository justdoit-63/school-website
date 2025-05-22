package com.school.website.service.impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import com.school.website.dto.AuthRequest;
import com.school.website.dto.AuthResponse;
import com.school.website.dto.RegisterRequest;
import com.school.website.dto.UserDTO;
import com.school.website.service.AuthService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse authenticateUser(AuthRequest request) {
        log.info("Authenticating user: {}", request.getUsername());
        // Mock implementation — replace with real authentication logic
        return new AuthResponse("mock-jwt-token");
    }

    @Override
    public void registerUser(RegisterRequest request) {
        log.info("Registering user: {}", request.getEmail());
        // Mock implementation — replace with user creation logic
    }

    @Override
    public UserDTO getCurrentUser(UserDetails userDetails) {
        log.info("Fetching current user details for username: {}", userDetails.getUsername());
        
        return UserDTO.builder()
                .id(1L) // mock ID — replace with actual ID from DB
                .username(userDetails.getUsername())
                .fullName("User FullName") // You may fetch actual full name from user entity
                .role("ROLE_USER") // Replace with actual role
                .build();
    }

    @Override
    public void changePassword(String oldPassword, String newPassword) {
        log.info("Changing password for user");
        // Mock implementation — replace with password update logic
    }
}
