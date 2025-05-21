package com.king.entity;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentSurvey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String college;
    private String email;
    private String mobile;
    private List<String> ugStreams;
    private Integer age;
    private String gender;
    private String maritalStatus;
    private String program;
    private String employment;
    private String yearLevel;
    private String income;
    private String location;
    private String techAccess;

   
    
//    private Map<String, Integer> satisfaction; // IQ01 -> 4, etc.
//    private Map<String, Map<String, Integer>> improvementRanks; // IQ01 -> {option1: 1, option2: 2, ...}
    
    private Integer iq01Satisfaction;
    private Integer iq01Rank1;
    private Integer iq01Rank2;
    private Integer iq01Rank3;
    private Integer iq01Rank4;

    private Integer iq02Satisfaction;
    private Integer iq02Rank1;
    private Integer iq02Rank2;
    private Integer iq02Rank3;
    private Integer iq02Rank4;

    private Integer iq03Satisfaction;
    private Integer iq03Rank1;
    private Integer iq03Rank2;
    private Integer iq03Rank3;
    private Integer iq03Rank4;

    private Integer iq04Satisfaction;
    private Integer iq04Rank1;
    private Integer iq04Rank2;
    private Integer iq04Rank3;
    private Integer iq04Rank4;

    private Integer iq05Satisfaction;
    private Integer iq05Rank1;
    private Integer iq05Rank2;
    private Integer iq05Rank3;
    private Integer iq05Rank4;

    private Integer iq06Satisfaction;
    private Integer iq06Rank1;
    private Integer iq06Rank2;
    private Integer iq06Rank3;
    private Integer iq06Rank4;

    private Integer rlfb01Satisfaction;
    private Integer rlfb01Rank1;
    private Integer rlfb01Rank2;
    private Integer rlfb01Rank3;
    private Integer rlfb01Rank4;


    // Teaching Quality
    //private int iq01, iq02, iq03, iq04, iq05, iq06;

    // Self-Check Feedback
  //  private int rlfb01;
}
