package com.school.website.service.impl;

import com.school.website.dto.TeacherDTO;
import com.school.website.service.TeacherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class TeacherServiceImpl implements TeacherService {

    @Override
    public TeacherDTO getTeacherProfile(String username) {
        log.info("Fetching teacher profile for: {}", username);
        // Dummy data – replace with actual DB fetch logic
        return TeacherDTO.builder()
                .id(1L)
                .name("John Doe")
                .email(username)
                .build();
    }

    @Override
    public void enterScore(Long studentId, Object scoreDto) {
        log.info("Entering score for student ID {}: {}", studentId, scoreDto);
    }

    @Override
    public void markAttendance(Long studentId, Object attendanceDto) {
        log.info("Marking attendance for student ID {}: {}", studentId, attendanceDto);
    }

    @Override
    public void uploadAnswerScripts(Object uploadDto) {
        log.info("Uploading answer scripts: {}", uploadDto);
    }

    @Override
    public void createPoll(Object pollDto) {
        log.info("Creating poll: {}", pollDto);
    }

    @Override
    public Object getPollResults(Long pollId) {
        log.info("Fetching poll results for poll ID: {}", pollId);
        return "mock-poll-results";
    }
}
