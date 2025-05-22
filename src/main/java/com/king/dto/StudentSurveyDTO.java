package com.king.dto;

import java.util.List;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentSurveyDTO {
	
	private Long id;

	 @NotBlank(message = "Name is required")
	    private String name;

	    @NotBlank(message = "College name is required")
	    private String college;

	    @Email(message = "Please enter a valid email")
	    @NotBlank(message = "Email is required")
	    private String email;

	    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Enter a valid 10-digit mobile number")
	    private String mobile;

	    @NotBlank(message = "Please select your UG stream")
	    private String ugStreams;

	    @NotNull(message = "Please enter your age")
	    @Min(value = 15, message = "Age must be at least 15")
	    @Max(value = 100, message = "Age must be less than 100")
	    private Integer age;

	    @NotBlank(message = "Please select your gender")
	    private String gender;

	    @NotBlank(message = "Please select your marital status")
	    private String maritalStatus;

	    @NotBlank(message = "Please select your program")
	    private String program;

	    @NotBlank(message = "Please select your employment status")
	    private String employment;

	    @NotBlank(message = "Please select your year level")
	    private String yearLevel;

	    @NotBlank(message = "Please select your income range")
	    private String income;

	    @NotBlank(message = "Please select your geographical location")
	    private String location;

	    @NotBlank(message = "Please select your access to technology")
	    private String techAccess;
    
    private String otherStream;
    private String otherProgram;
    private String otherEmployment;
    private String otherYearLevel;
  
}
