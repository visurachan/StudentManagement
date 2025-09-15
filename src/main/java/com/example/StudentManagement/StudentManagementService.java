package com.example.StudentManagement;

import org.springframework.stereotype.Service;

@Service
public class StudentManagementService {
    private final StudentRepository studentRepository;

    public StudentManagementService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
