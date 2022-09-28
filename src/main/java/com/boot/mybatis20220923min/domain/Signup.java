package com.boot.mybatis20220923min.domain;

import com.boot.mybatis20220923min.dto.SignupRespDto;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Signup {
    private int user_code;
    private String user_id;
    private String user_password;
    private String user_name;
    private String user_email;

    public SignupRespDto toDto() {
        return SignupRespDto.builder()
                .userCode(user_code)
                .userId(user_id)
                .userPassword(user_password)
                .userName(user_name)
                .userEmail(user_email)
                .build();
    }
}
