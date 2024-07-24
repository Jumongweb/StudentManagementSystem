package com.jumong.studentmanagementsystem.services;

import com.jumong.studentmanagementsystem.data.Models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudent();

    Student saveStudent(Student student);
}
