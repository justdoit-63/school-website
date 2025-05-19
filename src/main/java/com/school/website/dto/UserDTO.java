package com.school.website.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserDTO {
    private final Long id;
    private final String username;
    private final String email;
    private final String role;
}
