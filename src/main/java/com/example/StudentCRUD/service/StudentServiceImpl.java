package com.example.StudentCRUD.service;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public Student insertStudent(Student student) {
        return studentRepo.insertStudent(student);
    }

    @Override
    public Student getStudent(int rollNumber) {
       return studentRepo.getStudent(rollNumber);
    }

    @Override
    public List<Student> getStudentList() {
        return studentRepo.getStudentList();
    }

    @Override
    public Student updateStudent(int studentId, Student student) {
        return studentRepo.updateStudent(studentId, student);
    }

    @Override
    public String deleteStudent(int rollNumber){
        return studentRepo.deleteStudent(rollNumber);
    }

    @Override
    public List<Student> getStudentsByBranch(String branch) {
        return studentRepo.getStudentsByBranch(branch);
    }
}
