package com.school.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;

import com.school.api.domain.student.StudentRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("/students")
public class StudentController {
    
    @Autowired
    private StudentRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<StudentDetailsDTO> register(@RequestBody @Valid StudentRequestDTO data, UriComponents uriBuilder){
        
    }

}
