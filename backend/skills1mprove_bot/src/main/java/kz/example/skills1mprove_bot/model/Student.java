package kz.example.skills1mprove_bot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
public class Student extends User {
    private String studentId;


    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
