package com.example.S1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.S1.Model.StudentModel;

@Repository

public interface StudentRepository extends JpaRepository<StudentModel,Integer>{
    
//Inherit with another repo
//That repo contains list of Pre-defined SQl method

}
