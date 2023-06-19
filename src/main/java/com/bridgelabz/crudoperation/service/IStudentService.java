package com.bridgelabz.crudoperation.service;

import com.bridgelabz.crudoperation.entity.StudentEntity;

import java.util.List;

public interface IStudentService {
    void addSubject(StudentEntity subject);
    List<StudentEntity> getAllSubjects();
}
