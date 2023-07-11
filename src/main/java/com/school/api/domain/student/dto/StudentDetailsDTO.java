package com.school.api.domain.student.dto;

import com.school.api.domain.adress.Adress;
import com.school.api.domain.student.Interest;
import com.school.api.domain.student.Student;

public record StudentDetailsDTO(Long id, String name, String email, String phone, String rm, Interest interest, Adress adress) {

    public StudentDetailsDTO(Student student){
        this(student.getId(), student.getName(), student.getEmail(), student.getPhone(), student.getRm(), student.getInterest(), student.getAdress());
    }
    
}
