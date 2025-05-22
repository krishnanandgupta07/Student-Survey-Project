package com.king.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
public class SurveyResponseDTO {

	@NotNull(message = "Please select a satisfaction rating")
    private Integer iq01Satisfaction;
    private Integer iq01Rank1;
    private Integer iq01Rank2;
    private Integer iq01Rank3;
    private Integer iq01Rank4;
    @NotNull(message = "Please select a satisfaction rating")
    private Integer iq02Satisfaction;
    private Integer iq02Rank1;
    private Integer iq02Rank2;
    private Integer iq02Rank3;
    private Integer iq02Rank4;
    @NotNull(message = "Please select a satisfaction rating")
    private Integer iq03Satisfaction;
    private Integer iq03Rank1;
    private Integer iq03Rank2;
    private Integer iq03Rank3;
    private Integer iq03Rank4;
    @NotNull(message = "Please select a satisfaction rating")
    private Integer iq04Satisfaction;
    private Integer iq04Rank1;
    private Integer iq04Rank2;
    private Integer iq04Rank3;
    private Integer iq04Rank4;
    @NotNull(message = "Please select a satisfaction rating")
    private Integer iq05Satisfaction;
    private Integer iq05Rank1;
    private Integer iq05Rank2;
    private Integer iq05Rank3;
    private Integer iq05Rank4;
    @NotNull(message = "Please select a satisfaction rating")
    private Integer iq06Satisfaction;
    private Integer iq06Rank1;
    private Integer iq06Rank2;
    private Integer iq06Rank3;
    private Integer iq06Rank4;
    @NotNull(message = "Please select a satisfaction rating")
    private Integer rlfb01Satisfaction;
    private Integer rlfb01Rank1;
    private Integer rlfb01Rank2;
    private Integer rlfb01Rank3;
    private Integer rlfb01Rank4;
}
