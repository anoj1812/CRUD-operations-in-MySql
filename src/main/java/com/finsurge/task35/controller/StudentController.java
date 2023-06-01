package com.finsurge.task35.controller;

import com.finsurge.task35.entity.Student;
import com.finsurge.task35.service.StudentService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class StudentController {
    @Autowired private StudentService studentService;

    // Save operation
    @PostMapping("/students")
    public Student saveStudent(
            @RequestBody Student student)
    {
        return studentService.saveStudent(student);
    }

    // Read operation
    @GetMapping("/students")
    public List<Student> fetchStudentList()
    {
        return studentService.fetchStudentList();
    }

    // Update operation
    @PutMapping("/students/{id}")
    public Student
    updateStudent(@RequestBody Student student,
                     @PathVariable("id") Long studentId)
    {
        return studentService.updateStudent(
                student, studentId);
    }

    // Delete operation
    @DeleteMapping("/students/{id}")
    public String deleteStudentById(@PathVariable("id")
                                       Long studentId)
    {
        studentService.deleteStudentById(
                studentId);
        return "Deleted Successfully";
    }
}
