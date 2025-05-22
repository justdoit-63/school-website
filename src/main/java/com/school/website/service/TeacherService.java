package com.school.website.service;

import com.school.website.dto.TeacherDTO;

public interface TeacherService {
    TeacherDTO getTeacherProfile(String username);
    void enterScore(Long studentId, Object scoreDto);
    void markAttendance(Long studentId, Object attendanceDto);
    void uploadAnswerScripts(Object uploadDto);
    void createPoll(Object pollDto);
    Object getPollResults(Long pollId);
}
