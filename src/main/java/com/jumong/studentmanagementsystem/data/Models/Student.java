package com.jumong.studentmanagementsystem.data.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first-name", nullable = false)
    private String firstName;
    @Column(name="last-name")
    private String lastName;
    @Column(name="email")
    private String email;

}
