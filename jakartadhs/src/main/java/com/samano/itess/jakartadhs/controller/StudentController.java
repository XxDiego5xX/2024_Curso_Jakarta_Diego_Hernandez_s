package com.samano.itess.jakartadhs.controller;

import com.samano.itess.jakartadhs.beans.StudentBean;
import com.samano.itess.jakartadhs.entity.Student;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class StudentController implements Serializable {
    @Inject
    private Student student;
    
    @EJB
    private StudentBean studentBean;
     
    private
    List<Student> studentList;
    
    public Student getStudent() {
        return student;
    }
   
    public List<Student> getStudentList() {
        return this.studentList;
    }
    
    public String  saveStudent() {
        try {
            System.out.println("saveStudent()---------------------------------------");
            System.out.println("id:" + student.getStudentId());
            System.out.println("fn:" + student.getFirstName());
            System.out.println("ln:" + student.getLastName());
            System.out.println("em:" + student.getEmail());
            
            
            studentBean.saveStudent(student);
        } catch (Exception e){
            return "error";
        }
        return getStudents();
    }
            
   
    public String getStudents() {
        studentList = studentBean.getStudents();
        
        return "information";
    }

}