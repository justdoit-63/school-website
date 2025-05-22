package com.school.website.service;

import org.springframework.security.core.userdetails.UserDetails;

import com.school.website.dto.AuthRequest;
import com.school.website.dto.AuthResponse;
import com.school.website.dto.RegisterRequest;
import com.school.website.dto.UserDTO;

public interface AuthService {
    AuthResponse authenticateUser(AuthRequest request);
    void registerUser(RegisterRequest request);
    UserDTO getCurrentUser(UserDetails userDetails);
    void changePassword(String oldPassword, String newPassword);
}
