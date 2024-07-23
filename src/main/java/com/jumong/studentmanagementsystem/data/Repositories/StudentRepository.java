package com.jumong.studentmanagementsystem.data.Repositories;

import com.jumong.studentmanagementsystem.data.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
