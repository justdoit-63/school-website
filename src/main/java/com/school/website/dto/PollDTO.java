package com.school.website.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class PollDTO {
    private Long id;
    private String question;
    private List<String> options;
    private LocalDate expiryDate;
}
