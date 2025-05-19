package com.school.website.controller;

import com.school.website.service.AdminService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/users")
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(adminService.getAllUsers());
    }

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@RequestBody Object userDto) {
        adminService.createUser(userDto);
        return ResponseEntity.ok("User created successfully");
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody Object userDto) {
        adminService.updateUser(id, userDto);
        return ResponseEntity.ok("User updated successfully");
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        adminService.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }

    @GetMapping("/reports/export")
    public ResponseEntity<?> exportReports() {
        return ResponseEntity.ok(adminService.exportReports());
    }

    @GetMapping("/dashboard")
    public ResponseEntity<?> getAdminDashboard() {
        return ResponseEntity.ok(adminService.getDashboardData());
    }

    // Add other admin-specific endpoints as needed
}
