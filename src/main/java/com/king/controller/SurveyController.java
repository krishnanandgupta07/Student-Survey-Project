package com.king.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.king.dto.StudentSurveyDTO;
import com.king.entity.StudentSurvey;
import com.king.service.StudentSurveyService;

import jakarta.validation.Valid;

@Controller
public class SurveyController {

    @Autowired
    private StudentSurveyService service;

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("survey", new StudentSurveyDTO());
        return "student-form";
    }

    @PostMapping("/submit")
    public String submitSurvey(@Valid @ModelAttribute("survey") StudentSurveyDTO dto,BindingResult result, Model model) {
    	
    	if (result.hasErrors()) {
            return "student-form";
        }
    	//converting dto to entity
    	StudentSurvey survey = service.convertToEntity(dto);
        service.saveSurvey(survey);
        model.addAttribute("message", "Survey submitted successfully!");
        return "thank-you";
    }
}
