package com.school.api.domain.student;

import com.school.api.domain.adress.Adress;
import com.school.api.domain.student.dto.StudentResquestDTO;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb")
public class Student {

    public Student(StudentResquestDTO data){
        this.active = true;
        this.name = data.name();
        this.email = data.email();
        this.phone = data.phone();
        this.rm = data.rm();
        this.interest = data.interest();
        this.adress = new Adress(data.adress());
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String rm;

    @Enumerated
    private Interest interest;

    @Embedded
    private Adress adress;

    private Boolean active;

}
