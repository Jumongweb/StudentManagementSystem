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
    private String firstname;
    @Column(name="last-name")
    private String lastname;
    @Column(name="email")
    private int email;

}
