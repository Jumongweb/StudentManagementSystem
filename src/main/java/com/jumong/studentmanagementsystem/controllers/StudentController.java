package com.jumong.studentmanagementsystem.controllers;

import com.jumong.studentmanagementsystem.services.StudentService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudent());
        return "students";
    }

}
