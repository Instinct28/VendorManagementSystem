package com.example.assignment.VendorManagementSystem.serviceImpl;

import com.example.assignment.VendorManagementSystem.entity.Vendor;
import com.example.assignment.VendorManagementSystem.exception.VendorNotFoundException;
import com.example.assignment.VendorManagementSystem.repository.VendorRepository;
import com.example.assignment.VendorManagementSystem.service.VendorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class VendorServiceImpl implements VendorService {

    private VendorRepository vendorRepository;

    @Override
    public Vendor createVendor(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    @Override
    public Vendor getVendorById(long id) {
        return vendorRepository.findById(id).orElseThrow(
                () -> new VendorNotFoundException("vendor", "id", id)
        );
    }

    @Override
    public List<Vendor> getAllVendor() {
        return vendorRepository.findAll();
    }

    @Override
    public Vendor updateVendor(Vendor vendor) {
        Vendor existingVendor = vendorRepository.findById(vendor.getVendorId()).orElseThrow(
                () -> new VendorNotFoundException("User", "id", vendor.getVendorId())
        );
        existingVendor.setName(vendor.getName());
        existingVendor.setCode(vendor.getCode());
        existingVendor.setAddress(vendor.getAddress());
        existingVendor.setCity(vendor.getCity());
        existingVendor.setState(vendor.getState());
        existingVendor.setPincode(vendor.getPincode());
        existingVendor.setPhone(vendor.getPhone());
        existingVendor.setEmail(vendor.getEmail());
        return vendorRepository.save(existingVendor);
    }

    @Override
    public void deleteVendor(long id) {
        Vendor existingUser = vendorRepository.findById(id).orElseThrow(
                () -> new VendorNotFoundException("Vendor", "id", id)
        );
        vendorRepository.deleteById(id);
    }

}
