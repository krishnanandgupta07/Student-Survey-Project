package com.king.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.king.dto.SurveyResponseDTO;
import com.king.entity.StudentSurvey;
import com.king.entity.SurveyResponse;
import com.king.repository.SurveyResponseRepository;

@Service
public class SurveyResponseService {

	@Autowired
	private SurveyResponseRepository respRepository;
		
	public SurveyResponse saveSurveyResponse(SurveyResponseDTO dto, StudentSurvey student) {
        SurveyResponse response = new SurveyResponse();
        
        BeanUtils.copyProperties(dto, response);
        response.setStudent(student);

        return respRepository.save(response);
    }
}


