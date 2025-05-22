package com.school.website.service.impl;

import com.school.website.service.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class AdminServiceImpl implements AdminService {

    @Override
    public List<Object> getAllUsers() {
        log.info("Fetching all users");
        return Collections.emptyList();
    }

    @Override
    public void createUser(Object userDto) {
        log.info("Creating user: {}", userDto);
    }

    @Override
    public void updateUser(Long id, Object userDto) {
        log.info("Updating user with ID {}: {}", id, userDto);
    }

    @Override
    public void deleteUser(Long id) {
        log.info("Deleting user with ID {}", id);
    }

    @Override
    public Object exportReports() {
        log.info("Exporting reports");
        return "mock-report.csv";
    }

    @Override
    public Object getDashboardData() {
        log.info("Fetching admin dashboard data");
        return "admin-dashboard-data";
    }
}
