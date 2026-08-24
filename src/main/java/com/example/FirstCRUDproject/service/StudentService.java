package com.example.FirstCRUDproject.service;


import com.example.FirstCRUDproject.repository.StudentRepo;
import org.springframework.stereotype.Service;
import com.example.FirstCRUDproject.entity.Student;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudent(int id) {
        Optional<Student> studentOptional = studentRepo.findById(id);
        return studentOptional.orElse(null);
    }

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> createAllStudents(List<Student> studentList) {
        return studentRepo.saveAll(studentList);
    }

    public Student updateStudent(int id, Student student) {

        Optional<Student> checkStudent = studentRepo.findById(id);

        if (checkStudent.isEmpty()) {
            return null;
        }

        student.setId(id);

        return studentRepo.save(student);
    }

    public boolean deleteStudent(int id) {

        if (!studentRepo.existsById(id)) {
            return false;
        }

        studentRepo.deleteById(id);
        return true;
    }
}