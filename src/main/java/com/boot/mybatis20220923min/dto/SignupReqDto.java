package com.boot.mybatis20220923min.dto;

import com.boot.mybatis20220923min.domain.Signup;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SignupReqDto {
    private String userId;
    private String userPassword;
    private String userName;
    private String userEmail;

    public Signup toEntity() {
        return Signup.builder()
                .user_id(userId)
                .user_password(userPassword)
                .user_name(userName)
                .user_email(userEmail)
                .build();
    }
}
