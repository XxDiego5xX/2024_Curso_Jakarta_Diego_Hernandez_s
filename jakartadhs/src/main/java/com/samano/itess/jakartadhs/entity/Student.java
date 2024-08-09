package com.samano.itess.jakartadhs.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENTS")
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "STUDENT_ID")
    private Long studentId;
    
    @Column (name = "FIRST_NAME")
    private String firstName;
    
    @Column (name = "LAST_NAME")
    private String lastName;
    
    private String email;
    
    public Long getStudentId(){
        return studentId;
    }
    
     public Long setStudentId(Long studentId){
        return studentId;
    }
     
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
