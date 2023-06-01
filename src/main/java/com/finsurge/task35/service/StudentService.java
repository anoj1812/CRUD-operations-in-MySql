package com.finsurge.task35.service;

import com.finsurge.task35.entity.Student;
import java.util.List;

public interface StudentService {
        //create
        Student saveStudent(Student student);
        //read
        List<Student> fetchStudentList();
        //update
        Student updateStudent(Student student, Long studentId);
        // delete
        void deleteStudentById(Long studentId);
    }
