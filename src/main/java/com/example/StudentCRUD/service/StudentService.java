package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;

import java.util.List;

public interface StudentService {
    Student insertStudent(Student student);

    Student getStudent(int rollNumber);

    List<Student> getStudentList();

    Student updateStudent(int studentId,Student student);
    String deleteStudent(int studentId);

    List<Student> getStudentsByBranch(String branch);
}
