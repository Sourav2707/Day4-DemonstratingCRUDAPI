package com.bridgelabz.crudoperation.service;

import com.bridgelabz.crudoperation.entity.StudentEntity;
import com.bridgelabz.crudoperation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addSubject(StudentEntity subject) {
        studentRepository.save(subject);

    }
}
