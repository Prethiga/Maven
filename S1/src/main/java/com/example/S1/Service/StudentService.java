package com.example.S1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.S1.Model.StudentModel;
import com.example.S1.Repository.StudentRepository;

@SpringBootApplication
public class StudentService {
   
//Business logic

@Autowired
StudentRepository studentRepository;

public StudentModel addStudent(StudentModel studentModel){
        return studentRepository.save(studentModel);

    }
    
public List<StudentModel> createAllStudent(List<StudentModel> studentModels){
    return studentRepository.saveAll(studentModels);
}

public StudentModel getStudent(int id){
    return studentRepository.findById(id).orElse(null);
}

public String deleteStudent(int id){
    studentRepository.deleteById(id);
    return "Data has been erased";
}
}
