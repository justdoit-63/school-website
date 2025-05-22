package com.school.website.service;

import java.util.List;

public interface AdminService {
    List<Object> getAllUsers();
    void createUser(Object userDto);
    void updateUser(Long id, Object userDto);
    void deleteUser(Long id);
    Object exportReports();
    Object getDashboardData();
}
