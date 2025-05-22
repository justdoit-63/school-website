// TeacherService.java
package com.school.website.service;

public interface TeacherService {
    Object getTeacherProfile(String username);
    void enterScore(Long studentId, Object scoreDto);
    void markAttendance(Long studentId, Object attendanceDto);
    void uploadAnswerScripts(Object uploadDto);
    void createPoll(Object pollDto);
    Object getPollResults(Long pollId);
}
