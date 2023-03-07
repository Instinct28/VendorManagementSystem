package com.example.assignment.VendorManagementSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vendors")
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vendorId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private long code;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String state;
    @Column(nullable = false)
    private String pincode;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String email;

    public void setPincode(String pincode) {
        if(pincode.length() == 6){
            this.pincode = pincode;
        }
    }

    public void setPhone(String phone) {
        if(phone.length() == 10){
            this.phone = phone;
        }
    }

}
