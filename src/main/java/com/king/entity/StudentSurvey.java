package com.king.entity;
import java.util.Map;

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
    private String ugStreams;
    private String age;
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
    
    
    private int iq01Satisfaction;
    private int iq01Rank1;
    private int iq01Rank2;
    private int iq01Rank3;
    private int iq01Rank4;

    private int iq02Satisfaction;
    private int iq02Rank1;
    private int iq02Rank2;
    private int iq02Rank3;
    private int iq02Rank4;

    private int iq03Satisfaction;
    private int iq03Rank1;
    private int iq03Rank2;
    private int iq03Rank3;
    private int iq03Rank4;

    private int iq04Satisfaction;
    private int iq04Rank1;
    private int iq04Rank2;
    private int iq04Rank3;
    private int iq04Rank4;

    private int iq05Satisfaction;
    private int iq05Rank1;
    private int iq05Rank2;
    private int iq05Rank3;
    private int iq05Rank4;

    private int iq06Satisfaction;
    private int iq06Rank1;
    private int iq06Rank2;
    private int iq06Rank3;
    private int iq06Rank4;

    private int rlfb01Satisfaction;
    private int rlfb01Rank1;
    private int rlfb01Rank2;
    private int rlfb01Rank3;
    private int rlfb01Rank4;


    // Teaching Quality
    //private int iq01, iq02, iq03, iq04, iq05, iq06;

    // Self-Check Feedback
  //  private int rlfb01;
}
