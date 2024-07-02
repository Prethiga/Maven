package com.example.S1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Student")
public class StudentModel {
    
//Student properties

@Id //primary key
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int Id;
private String name;
private String email;
private String age;

}
