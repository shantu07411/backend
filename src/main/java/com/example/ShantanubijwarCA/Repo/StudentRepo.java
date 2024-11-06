package com.example.ShantanubijwarCA.Repo;

import com.example.ShantanubijwarCA.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student,String> {
}
