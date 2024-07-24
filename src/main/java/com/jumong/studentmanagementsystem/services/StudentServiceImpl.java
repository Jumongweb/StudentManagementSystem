package com.jumong.studentmanagementsystem.services;

import com.jumong.studentmanagementsystem.data.Models.Student;
import com.jumong.studentmanagementsystem.data.Repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentRepository studentRepository;
    public StudentServiceImpl(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
