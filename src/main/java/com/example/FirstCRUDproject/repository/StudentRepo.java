package com.example.FirstCRUDproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<com.example.FirstCRUDproject.entity.Student,Integer> {
}