package com.solanki.demoapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.solanki.demoapi.Model.Student;
import com.solanki.demoapi.Repository.StudentRepository;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    // GET all students
    @GetMapping()
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // POST create a student
    @PostMapping()
    public Student addStudents(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // DELETE a student by roll number
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentRepository.deleteById(id);
    }

}
