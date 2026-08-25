package com.example.FirstCRUDproject.repository;
import com.example.FirstCRUDproject.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface StudentRepo extends JpaRepository<com.example.FirstCRUDproject.entity.Student,Integer> {
    List<Student> findAllByDeletedFalse();

    Optional<Student> findByIdAndDeletedFalse(int id);
}