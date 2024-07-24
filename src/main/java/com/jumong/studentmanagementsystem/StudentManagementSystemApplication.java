package com.jumong.studentmanagementsystem;

import com.jumong.studentmanagementsystem.data.Models.Student;
import com.jumong.studentmanagementsystem.data.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student();
//        student1.setFirstname("General");
//        student1.setLastname("Jumong");
//        student1.setEmail("jumong@gmail.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student();
//        student2.setFirstname("Jungkook");
//        student2.setLastname("Han");
//        student2.setEmail("jungkook@gmail.com");
//        studentRepository.save(student2);
//
//        Student student3 = new Student();
//        student3.setFirstname("Minyoung");
//        student3.setLastname("Kim");
//        student3.setEmail("minyoung@gmail.com");
//        studentRepository.save(student3);
    }
}
