package com.school.website.controller;

import com.school.website.dto.TeacherDTO;
import com.school.website.service.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/me")
    public ResponseEntity<TeacherDTO> getTeacherProfile(@AuthenticationPrincipal UserDetails userDetails) {
        TeacherDTO teacher = teacherService.getTeacherProfile(userDetails.getUsername());
        return ResponseEntity.ok(teacher);
    }

    @PostMapping("/students/{studentId}/scores")
    public ResponseEntity<String> enterScore(@PathVariable Long studentId, @RequestBody Object scoreDto) {
        teacherService.enterScore(studentId, scoreDto);
        return ResponseEntity.ok("Score entered successfully");
    }

    @PostMapping("/students/{studentId}/attendance")
    public ResponseEntity<String> markAttendance(@PathVariable Long studentId, @RequestBody Object attendanceDto) {
        teacherService.markAttendance(studentId, attendanceDto);
        return ResponseEntity.ok("Attendance marked successfully");
    }

    @PostMapping("/upload-answers")
    public ResponseEntity<String> uploadAnswerScripts(@RequestBody Object uploadDto) {
        teacherService.uploadAnswerScripts(uploadDto);
        return ResponseEntity.ok("Answer scripts uploaded successfully");
    }

    @PostMapping("/polls")
    public ResponseEntity<String> createPoll(@RequestBody Object pollDto) {
        teacherService.createPoll(pollDto);
        return ResponseEntity.ok("Poll created successfully");
    }

    @GetMapping("/polls/{pollId}/results")
    public ResponseEntity<?> getPollResults(@PathVariable Long pollId) {
        return ResponseEntity.ok(teacherService.getPollResults(pollId));
    }

    // Add other teacher-specific endpoints as needed
}
