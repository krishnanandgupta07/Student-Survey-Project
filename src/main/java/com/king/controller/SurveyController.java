package com.king.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.king.dto.StudentSurveyDTO;
import com.king.dto.SurveyResponseDTO;
import com.king.entity.StudentSurvey;
import com.king.service.StudentSurveyService;
import com.king.service.SurveyResponseService;

import jakarta.validation.Valid;

@Controller
public class SurveyController {

    @Autowired
    private StudentSurveyService studentService;
    @Autowired
    private SurveyResponseService respService;

    @GetMapping("/")
    public String showSurveyForm(Model model) {
        model.addAttribute("surveyStudent", new StudentSurveyDTO());
        model.addAttribute("surveyResponse", new SurveyResponseDTO());
        return "student-form";
    }

    @PostMapping("/submit")
    public String submitSurveyForm(
            @ModelAttribute("surveyStudent") @Valid StudentSurveyDTO studentDTO,
            BindingResult studentResult,
            @ModelAttribute("surveyResponse") @Valid SurveyResponseDTO responseDTO,
            BindingResult responseResult,
            Model model) {

			        if (studentResult.hasErrors() || responseResult.hasErrors()) {
			            return "student-form";
			        }

			        StudentSurvey savedStudent = studentService.saveSurvey(studentDTO);
			        respService.saveSurveyResponse(responseDTO, savedStudent);
			        model.addAttribute("message", "Survey submitted successfully!");
			        return "thank-you"; 
    }
}
