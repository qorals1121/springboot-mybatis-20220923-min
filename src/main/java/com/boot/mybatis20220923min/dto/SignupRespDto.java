package com.boot.mybatis20220923min.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SignupRespDto {

    private int userCode;
    private String userId;
    private String userPassword;
    private String userName;
    private String userEmail;
}
