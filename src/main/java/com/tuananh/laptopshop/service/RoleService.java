package com.tuananh.laptopshop.service;

import org.springframework.stereotype.Service;
import com.tuananh.laptopshop.domain.Role;
import com.tuananh.laptopshop.repository.RoleRepository;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    // Tìm kiếm role theo tên
    public Role getRoleByName(String name) {
        return roleRepository.findByName(name);
    }

    // Tạo mới role
    public Role createRole(String name, String description) {
        Role role = new Role();
        role.setName(name);
        role.setDescription(description);
        return roleRepository.save(role);
    }

    // Kiểm tra xem role đã tồn tại hay chưa
    public boolean checkRoleExist(String name) {
        return roleRepository.findByName(name) != null;
    }

    // Khởi tạo các role mặc định
    public void initializeDefaultRoles() {
        if (!checkRoleExist("ADMIN")) {
            createRole("ADMIN", "Full quyền quản trị hệ thống");
        }
        if (!checkRoleExist("USER")) {
            createRole("USER", "Thông thường, chỉ có quyền cơ bản");
        }
    }
}
