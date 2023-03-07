package com.example.assignment.VendorManagementSystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VendorDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;

}
