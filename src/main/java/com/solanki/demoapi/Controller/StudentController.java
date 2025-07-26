package com.solanki.demoapi.Controller;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    @DeleteMapping("/{rollNo}")
    public ResponseEntity<String> deleteStudent(@PathVariable int rollNo) {
        if (studentRepository.existsById(rollNo)) {
            studentRepository.deleteById(rollNo);
            return ResponseEntity.ok("Student with rollNo " + rollNo + " has been deleted.");
        } else {
            return ResponseEntity.status(404).body("Student with rollNo " + rollNo + " not found.");
        }
    }

    // Update Student by roll No
    @PutMapping("/{rollNo}")
    public Student update(@PathVariable int id, @RequestBody Student student) {
        return studentRepository.save(student);
    }

    // get student by id
    @GetMapping("/{rollNo}")
    public ResponseEntity<?> getStudentById(@PathVariable int rollNo) {
        Optional<Student> studentOptional = studentRepository.findById(rollNo);

        if (studentOptional.isPresent()) {
            return ResponseEntity.ok(studentOptional.get());
        } else {
            return ResponseEntity.status(404).body("Student not found with rollNo: " + rollNo);
        }
    }

}
