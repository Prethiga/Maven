package com.example.S1.Contoller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.S1.Model.StudentModel;
import com.example.S1.Service.StudentService;


@RestController
@SpringBootApplication
@RequestMapping("/student")
public class StudentController {
//Api Url
//Methods
     @Autowired
    StudentService studentService;

    @PostMapping("/addStudent")
     public StudentModel addStudentDetails(@RequestBody StudentModel studentModel){
         return studentService.addStudent(studentModel);
     }

     @PostMapping("/addAllStudent")
     public List<StudentModel> addAllStudent(@RequestBody List<StudentModel> studentModels){
        return studentService.createAllStudent(studentModels);
     }
     @PostMapping("/getStudentdetails/{id}")
     public StudentModel getStudentDettails(@PathVariable int id){
            return studentService.getStudent(id);
     }

     @DeleteMapping("/deleteStudentDetails/{id}")
     public String deleteStudentDetails(@PathVariable int id){
        return studentService.deleteStudent(id);
     }

}

