package com.example.assignment.VendorManagementSystem.repository;

import com.example.assignment.VendorManagementSystem.entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
