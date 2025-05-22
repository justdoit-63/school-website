package com.school.website.utils;

import com.school.website.dto.*;
import com.school.website.entity.*;

public class Mapper {

    // === Student ===
    public static StudentDTO toStudentDTO(Student student) {
        return StudentDTO.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .grade(student.getGrade())
                .build();
    }

    public static Student toStudent(StudentDTO dto) {
        return Student.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .grade(dto.getGrade())
                .build();
    }

    // === Teacher ===
    public static TeacherDTO toTeacherDTO(Teacher teacher) {
        return TeacherDTO.builder()
                .id(teacher.getId())
                .name(teacher.getName())
                .email(teacher.getEmail())
                .build();
    }

    public static Teacher toTeacher(TeacherDTO dto) {
        return Teacher.builder()
                .id(dto.getId())
                .name(dto.getName())
                .email(dto.getEmail())
                .build();
    }

    // === Admin ===
    public static AdminDTO toAdminDTO(Admin admin) {
        return AdminDTO.builder()
                .id(admin.getId())
                .username(admin.getUsername())
                .email(admin.getEmail())
                .build();
    }

    public static Admin toAdmin(AdminDTO dto) {
        return Admin.builder()
                .id(dto.getId())
                .username(dto.getUsername())
                .email(dto.getEmail())
                .build();
    }

    // === Poll ===
    public static PollDTO toPollDTO(Poll poll) {
        return PollDTO.builder()
                .id(poll.getId())
                .question(poll.getQuestion())
                .options(poll.getOptions())
                .expiryDate(poll.getExpiryDate())
                .build();
    }

    public static Poll toPoll(PollDTO dto) {
        return Poll.builder()
                .id(dto.getId())
                .question(dto.getQuestion())
                .options(dto.getOptions())
                .expiryDate(dto.getExpiryDate())
                .build();
    }
}
