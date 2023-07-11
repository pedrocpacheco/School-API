package com.school.api.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.school.api.domain.student.Student;
import com.school.api.domain.student.StudentRepository;
import com.school.api.domain.student.dto.StudentDetailsDTO;
import com.school.api.domain.student.dto.StudentResquestDTO;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {
    
    @Autowired
    private StudentRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<StudentDetailsDTO> register(@RequestBody @Valid StudentResquestDTO data, UriComponentsBuilder uriBuilder){
        Student student = new Student(data);
        repository.save(student);

        URI uri = uriBuilder.path("/students/{id}").buildAndExpand(student.getId()).toUri();
        
        return ResponseEntity.created(uri).body(new StudentDetailsDTO(student));
    }

}
