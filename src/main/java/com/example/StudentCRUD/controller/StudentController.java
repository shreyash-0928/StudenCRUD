package com.example.StudentCRUD.controller;

import com.example.StudentCRUD.model.Student;
import com.example.StudentCRUD.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public Student insertStudent( @RequestBody  Student student){
        return studentService.insertStudent(student);
    }

    @GetMapping("/student/{rollNumber}")
    public Student getStudent(@PathVariable int rollNumber){
      return   studentService.getStudent(rollNumber);
    }

    @GetMapping("/student")
    public List<Student> getStudentList(){
        return  studentService.getStudentList();
    }

    @PutMapping("/student/{studentId}")
    public Student updateStudent(@PathVariable int studentId,@RequestBody Student student) {
        return studentService.updateStudent(studentId, student);

    }
    @DeleteMapping("/student/{rollNumber}")
    public String deleteStudent(@PathVariable int rollNumber){
        return studentService.deleteStudent(rollNumber);
    }

    @GetMapping("/student/branch/{branch}")
    public List<Student> getStudentsByBranch(@PathVariable String branch) {
        return studentService.getStudentsByBranch(branch);
    }
}
