package com.school.api.domain.adress.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AdressDTO(
    
    @NotBlank
    String street, 
    
    @NotBlank
    String number, 

    @NotBlank
    String complement,
    
    @NotBlank
    @Pattern(regexp = "\\d{8}")
    String cep, 

    @NotBlank
    String county,
    
    @NotBlank
    String city, 
    
    @NotBlank
    String uf) {
    
}
