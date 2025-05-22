package com.school.website.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TeacherDTO {
    private Long id;
    private String name;
    private String email;
}
