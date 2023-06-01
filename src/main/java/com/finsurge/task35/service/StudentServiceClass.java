package com.finsurge.task35.service;

import com.finsurge.task35.entity.Student;
import com.finsurge.task35.repository.StudentRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceClass implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    // Save operation
    @Override
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }

    // Read operation
    @Override public List<Student> fetchStudentList()
    {
        return studentRepository.findAll();
    }

    // Update operation
    @Override
    public Student
    updateStudent(Student student, Long studentId)
    {
        Student student1=studentRepository.findById(studentId).get();
        student1.setStudentName(student.getStudentName());
        student1.setStudentDept(student.getStudentDept());
        student1.setStudentClg(student.getStudentClg());
        return studentRepository.save(student1);
    }

    // Delete operation
    @Override
    public void deleteStudentById(Long studentId)
    {
        studentRepository.deleteById(studentId);
    }
}
