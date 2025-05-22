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
	
//	public void saveResponses(List<SurveyResponseDTO> responseDTOs, StudentSurvey student) {
//        for (SurveyResponseDTO dto : responseDTOs) {
//            SurveyResponse response = new SurveyResponse();
//            BeanUtils.copyProperties(dto, response);
//            response.setStudent(student); // set FK relationship
//            respRepo.save(response);
//        }
   // }
	
	
	
	public SurveyResponse saveSurveyResponse(SurveyResponseDTO dto, StudentSurvey student) {
        SurveyResponse response = new SurveyResponse();
        
        BeanUtils.copyProperties(dto, response);
        response.setStudent(student);
       /* 
        response.setIq01Satisfaction(dto.getIq01Satisfaction());
        response.setIq01Rank1(dto.getIq01Rank1());
        response.setIq01Rank2(dto.getIq01Rank2());
        response.setIq01Rank3(dto.getIq01Rank3());
        response.setIq01Rank4(dto.getIq01Rank4());

        response.setIq02Satisfaction(dto.getIq02Satisfaction());
        response.setIq02Rank1(dto.getIq02Rank1());
        response.setIq02Rank2(dto.getIq02Rank2());
        response.setIq02Rank3(dto.getIq02Rank3());
        response.setIq02Rank4(dto.getIq02Rank4());

        response.setIq03Satisfaction(dto.getIq03Satisfaction());
        response.setIq03Rank1(dto.getIq03Rank1());
        response.setIq03Rank2(dto.getIq03Rank2());
        response.setIq03Rank3(dto.getIq03Rank3());
        response.setIq03Rank4(dto.getIq03Rank4());

        response.setIq04Satisfaction(dto.getIq04Satisfaction());
        response.setIq04Rank1(dto.getIq04Rank1());
        response.setIq04Rank2(dto.getIq04Rank2());
        response.setIq04Rank3(dto.getIq04Rank3());
        response.setIq04Rank4(dto.getIq04Rank4());

        response.setIq05Satisfaction(dto.getIq05Satisfaction());
        response.setIq05Rank1(dto.getIq05Rank1());
        response.setIq05Rank2(dto.getIq05Rank2());
        response.setIq05Rank3(dto.getIq05Rank3());
        response.setIq05Rank4(dto.getIq05Rank4());

        response.setIq06Satisfaction(dto.getIq06Satisfaction());
        response.setIq06Rank1(dto.getIq06Rank1());
        response.setIq06Rank2(dto.getIq06Rank2());
        response.setIq06Rank3(dto.getIq06Rank3());
        response.setIq06Rank4(dto.getIq06Rank4());

        response.setRlfb01Satisfaction(dto.getRlfb01Satisfaction());
        response.setRlfb01Rank1(dto.getRlfb01Rank1());
        response.setRlfb01Rank2(dto.getRlfb01Rank2());
        response.setRlfb01Rank3(dto.getRlfb01Rank3());
        response.setRlfb01Rank4(dto.getRlfb01Rank4());*/


        return respRepository.save(response);
    }
}


