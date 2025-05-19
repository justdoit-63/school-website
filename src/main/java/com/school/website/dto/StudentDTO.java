package com.school.website.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StudentDTO {
    private final Long id;
    private final String username;
    private final String email;
    private final String fullName;
    private final String grade;
    private final String section;
    // Add more fields as needed
}
