package com.example.assignment.VendorManagementSystem.controller;

import com.example.assignment.VendorManagementSystem.entity.Vendor;
import com.example.assignment.VendorManagementSystem.service.VendorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/vendor")

public class VendorController {

    private VendorService vendorService;

    @PostMapping("create")
    public ResponseEntity<Vendor> createVendor(@RequestBody Vendor vendor){
        Vendor savedVendor = vendorService.createVendor(vendor);
        return new ResponseEntity<>(savedVendor, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Vendor> getVendorById(@PathVariable("id") long id){
        Vendor vendor = vendorService.getVendorById(id);
        return ResponseEntity.ok(vendor);
    }

    @GetMapping
    public ResponseEntity<List<Vendor>> getAllVendor(){
        List<Vendor> vendors = vendorService.getAllVendor();
        return ResponseEntity.ok(vendors);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Vendor> updateVendor(@RequestBody Vendor vendor,@PathVariable("id") long vendorId){
        vendor.setVendorId(vendorId);
        return ResponseEntity.ok(vendorService.updateVendor(vendor));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteVendor(@PathVariable("id") long vendorId){
        vendorService.deleteVendor(vendorId);
        return ResponseEntity.ok("Vendor deleted successfully");
    }

}
