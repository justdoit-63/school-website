package com.school.website.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class AuthResponse {
    private final String accessToken;
    private final String tokenType = "Bearer";
}
