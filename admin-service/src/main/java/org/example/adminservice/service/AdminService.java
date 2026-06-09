package org.example.adminservice.service;

import org.example.adminservice.entity.Admin;

import java.util.List;

public interface AdminService {
    Admin saveAdmin(Admin admin);
    List<Admin> getAllAdmins();
    Admin getAdminById(Long id);
    void deleteAdmin(Long id);
}