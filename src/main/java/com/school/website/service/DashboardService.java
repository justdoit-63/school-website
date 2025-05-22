// DashboardService.java
package com.school.website.service;

public interface DashboardService {
    Object getClassDashboard(Long classId);
    Object getStudentDashboard(Long studentId);
    Object getSubjectDashboard(Long subjectId);
    Object getOverallDashboard();
}
