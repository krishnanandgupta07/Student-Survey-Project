package com.king.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.king.entity.StudentSurvey;

public interface StudentSurveyRepository extends JpaRepository<StudentSurvey, Long> {

}
