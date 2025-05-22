package com.school.website.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDTO {
    private Long id;
    private String name;
    private String email;
    private String grade;
}
