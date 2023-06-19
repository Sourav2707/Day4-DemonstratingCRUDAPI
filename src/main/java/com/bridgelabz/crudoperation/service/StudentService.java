package com.bridgelabz.crudoperation.service;

import com.bridgelabz.crudoperation.entity.StudentEntity;
import com.bridgelabz.crudoperation.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addSubject(StudentEntity subject) {
        studentRepository.save(subject);

    }

    public List<StudentEntity> getAllSubjects() {
        List<StudentEntity> subjects = new ArrayList<>();
        studentRepository.findAll().forEach(subjects::add);
        return subjects;
    }
}
