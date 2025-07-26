package com.solanki.demoapi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int rollNo;
    private String name;
    private int classNumber;
    private String email;

    // Default constructor (required by JPA)
    public Student() {
    }

    // Parameterized constructor
    public Student(int rollNo, String name, int classNumber, String email) {
        this.rollNo = rollNo;
        this.name = name;
        this.classNumber = classNumber;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getters and Setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        if (classNumber > 99) {
            throw new IllegalArgumentException("classNumber must be 2 or less");
        }
        this.classNumber = classNumber;
    }

}
