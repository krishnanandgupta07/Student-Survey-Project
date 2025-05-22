package com.king.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Student_Survey_Details")
public class StudentSurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String college;
    private String email;
    private String mobile;
    private String ugStreams; 
    private Integer age;
    private String gender;
    private String maritalStatus;
    private String program;
    private String employment;
    private String yearLevel;
    private String income;
    private String location;
    private String techAccess;
   
}
