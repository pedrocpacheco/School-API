package com.school.api.domain.adress;

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
    
    private String street;

    private String number;

    private String complement;

    private String cep;

    private String county;

    private String city;

    private String uf;

}
