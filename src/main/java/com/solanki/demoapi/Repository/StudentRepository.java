package com.solanki.demoapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solanki.demoapi.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
