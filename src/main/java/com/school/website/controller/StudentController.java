package com.school.website.controller;

import com.school.website.dto.StudentDTO;
import com.school.website.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/me")
    public ResponseEntity<StudentDTO> getStudentProfile(@AuthenticationPrincipal UserDetails userDetails) {
        StudentDTO student = studentService.getStudentProfile(userDetails.getUsername());
        return ResponseEntity.ok(student);
    }

    @GetMapping("/{id}/scores")
    public ResponseEntity<?> getStudentScores(@PathVariable Long id) {
        // Returns scores for the student with id
        return ResponseEntity.ok(studentService.getScoresByStudentId(id));
    }

    @GetMapping("/{id}/attendance")
    public ResponseEntity<?> getAttendance(@PathVariable Long id) {
        // Returns attendance records for the student
        return ResponseEntity.ok(studentService.getAttendanceByStudentId(id));
    }

    @GetMapping("/{id}/polls")
    public ResponseEntity<?> getPolls(@PathVariable Long id) {
        // Returns polls student can participate in
        return ResponseEntity.ok(studentService.getPollsForStudent(id));
    }

    // Add other student-specific endpoints as needed
}
