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
//        return studentRepo.findAll().stream().filter(student -> !student.isDeleted()).toList();
        return studentRepo.findAllByDeletedFalse();
    }

    public Student getStudent(int id) {
        Optional<Student> studentOptional = studentRepo.findByIdAndDeletedFalse(id);
        return studentOptional.orElse(null);
    }

    public Student createStudent(Student student) {
        student.setDeleted(false);
        return studentRepo.save(student);
    }

    public List<Student> createAllStudents(List<Student> studentList) {
        studentList.forEach(student -> student.setDeleted(false));
        return studentRepo.saveAll(studentList);
    }

    public Student updateStudent(int id, Student student) {

        Optional<Student> checkStudent = studentRepo.findByIdAndDeletedFalse(id);

        if (checkStudent.isEmpty()) {
            return null;
        }
        student.setId(id);
        student.setDeleted(false);

        return studentRepo.save(student);
    }

    public boolean deleteStudent(int id) {

        Optional<Student> student = studentRepo.findById(id);
        if (student.isEmpty()) {
            return false;
        }

        studentRepo.deleteById(id);
        return true;
    }
    public boolean deleteStudentSoftly(int id) {

        Optional<Student> optionalStudent = studentRepo.findByIdAndDeletedFalse(id);

        if (optionalStudent.isEmpty()) {
            return false;
        }

        Student student = optionalStudent.get();
        student.setDeleted(true);
        studentRepo.save(student);

        return true;
    }
}
