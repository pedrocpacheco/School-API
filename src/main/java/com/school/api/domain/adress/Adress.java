package com.school.api.domain.adress;

import com.school.api.domain.adress.dto.AdressDTO;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Adress {
    
    public Adress(AdressDTO data){
        this.street = data.street();
        this.number = data.number();
        this.complement = data.complement();
        this.cep = data.cep();
        this.county = data.county();
        this.city = data.city();
        this.uf = data.uf();
    }   

    private String street;

    private String number;

    private String complement;

    private String cep;

    private String county;

    private String city;

    private String uf;

}
