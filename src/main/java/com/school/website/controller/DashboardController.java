package com.school.website.controller;

import com.school.website.service.DashboardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/class/{classId}")
    public ResponseEntity<?> getClassDashboard(@PathVariable Long classId) {
        return ResponseEntity.ok(dashboardService.getClassDashboard(classId));
    }

    @GetMapping("/student/{studentId}")
    public ResponseEntity<?> getStudentDashboard(@PathVariable Long studentId) {
        return ResponseEntity.ok(dashboardService.getStudentDashboard(studentId));
    }

    @GetMapping("/subject/{subjectId}")
    public ResponseEntity<?> getSubjectDashboard(@PathVariable Long subjectId) {
        return ResponseEntity.ok(dashboardService.getSubjectDashboard(subjectId));
    }

    @GetMapping("/overall")
    public ResponseEntity<?> getOverallDashboard() {
        return ResponseEntity.ok(dashboardService.getOverallDashboard());
    }
}
