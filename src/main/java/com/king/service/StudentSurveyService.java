package com.king.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.king.dto.StudentSurveyDTO;
import com.king.entity.StudentSurvey;
import com.king.repository.StudentSurveyRepository;

@Service
public class StudentSurveyService {

    @Autowired
    private StudentSurveyRepository studentRepository;
    
    public StudentSurvey saveSurvey(StudentSurveyDTO dto) {
        StudentSurvey student = new StudentSurvey();
        BeanUtils.copyProperties(dto, student);
        	//logic for others option along with text box details
	       student.setUgStreams(resolveOtherValue(dto.getUgStreams(), dto.getOtherStream()));
	       student.setProgram(resolveOtherValue(dto.getProgram(), dto.getOtherProgram()));
	       student.setEmployment(resolveOtherValue(dto.getEmployment(), dto.getOtherEmployment()));
	       student.setYearLevel(resolveOtherValue(dto.getYearLevel(), dto.getOtherYearLevel()));
        		
        		return studentRepository.save(student);
    }
    
    // Utility method at class level
		    private String resolveOtherValue(String selectedValue, String otherValue) {
		        if ("Others".equalsIgnoreCase(selectedValue)) {
		            if (otherValue != null && !otherValue.trim().isEmpty()) {
		                return "Others (" + otherValue.trim() + ")";
		            } else {
		                return "Others";
		            }
		        }
		        return selectedValue;
		    }


}

