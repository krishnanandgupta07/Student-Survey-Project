package com.king.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.king.entity.StudentSurvey;
import com.king.repository.StudentSurveyRepository;

@Service
public class StudentSurveyService {
	
	@Autowired
    private StudentSurveyRepository repository;

    public StudentSurvey saveSurvey(StudentSurvey survey) {
        return repository.save(survey);
    }

}
