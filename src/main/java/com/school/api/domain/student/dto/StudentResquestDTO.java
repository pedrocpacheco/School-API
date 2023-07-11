package com.school.api.domain.student.dto;

import com.school.api.domain.adress.dto.AdressDTO;
import com.school.api.domain.student.Interest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record StudentResquestDTO(
    
    @NotBlank
    String name, 
    
    @NotBlank
    @Email
    String email, 
    
    @NotBlank
    String phone, 
    
    @NotBlank
    @Pattern(regexp = "RM\\d{5}")
    String rm, 
    
    @NotNull
    Interest interest, 
    
    @NotNull
    @Valid
    AdressDTO adress) {
    
}
