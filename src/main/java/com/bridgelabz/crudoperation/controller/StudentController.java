package com.bridgelabz.crudoperation.controller;

import com.bridgelabz.crudoperation.entity.StudentEntity;
import com.bridgelabz.crudoperation.repository.StudentRepository;
import com.bridgelabz.crudoperation.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    IStudentService studentService;

    /**
     * Demonstrating post method using @RequestMapping
     * @param subject
     */
    @RequestMapping(method = RequestMethod.POST, value="/subjects")
    public void addSubject(@RequestBody StudentEntity subject)
    {
        studentService.addSubject(subject);
    }
}
