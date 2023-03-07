package com.example.assignment.VendorManagementSystem.service;

import com.example.assignment.VendorManagementSystem.entity.Vendor;

import java.util.List;

public interface VendorService {

    Vendor createVendor(Vendor vendor);
    Vendor getVendorById(long id);
    List<Vendor> getAllVendor();
    Vendor updateVendor(Vendor vendor);
    void deleteVendor(long id);

}
