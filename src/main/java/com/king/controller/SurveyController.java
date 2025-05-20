package com.king.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.king.dto.StudentSurveyDTO;
import com.king.entity.StudentSurvey;
import com.king.service.StudentSurveyService;

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
    public String submitSurvey(@ModelAttribute StudentSurvey survey, Model model) {
        service.saveSurvey(survey);
        model.addAttribute("message", "Survey submitted successfully!");
        return "thank-you";
    }
}
