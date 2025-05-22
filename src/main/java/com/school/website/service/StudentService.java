// StudentService.java
package com.school.website.service;

import com.school.website.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    StudentDTO getStudentProfile(String username);
    List<?> getScoresByStudentId(Long studentId);
    List<?> getAttendanceByStudentId(Long studentId);
    List<?> getPollsForStudent(Long studentId);
}
