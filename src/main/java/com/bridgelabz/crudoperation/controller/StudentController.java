package com.bridgelabz.crudoperation.controller;

import com.bridgelabz.crudoperation.entity.StudentEntity;
import com.bridgelabz.crudoperation.repository.StudentRepository;
import com.bridgelabz.crudoperation.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    /**
     * Demonstrating post method using @RequestMapping
     * @param subject
     */
    @RequestMapping(method = RequestMethod.PUT, value="/subjects")
    public void updateSubject( @RequestBody StudentEntity subject)
    {
        studentService.addSubject(subject);
    }

    /**
     * To demonstarte get method to find all from repository
     * @return list of all subjects
     */
    @RequestMapping("/subjects")
    public List<StudentEntity> getAllSubjects()
    {
        return studentService.getAllSubjects();
    }

    /**
     * demonstrating delete method
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE, value="/subjects/{id}")
    public void DeleteSubject(@PathVariable String id)
    {
        studentService.deleteSubject(id);
    }
}
