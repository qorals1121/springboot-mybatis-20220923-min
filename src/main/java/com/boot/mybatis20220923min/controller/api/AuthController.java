package com.boot.mybatis20220923min.controller.api;


import com.boot.mybatis20220923min.domain.Signup;
import com.boot.mybatis20220923min.dto.CMRespDto;
import com.boot.mybatis20220923min.dto.SignupReqDto;
import com.boot.mybatis20220923min.dto.SignupRespDto;
import com.boot.mybatis20220923min.repository.SignupRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/auth")
@Slf4j
@RequiredArgsConstructor
@RestController
public class AuthController {
    // /api/auth/signup 요청주소

    public final SignupRepository signupRepository;

    @PostMapping("/signup")
    public ResponseEntity<?> signup(SignupReqDto signupReqDto) {

        log.info("{}", signupReqDto);

        Signup signup = signupReqDto.toEntity();

        log.info("마이바티스 가기전 Entity: {}", signup);
        int result = signupRepository.save(signup);
        log.info("마이바티스 다녀온 후 Entity: {}", signup);

        SignupRespDto signupRespDto = signup.toDto();

        if(result == 0) {
            return ResponseEntity.internalServerError().body(new CMRespDto<>(-1, "회원가입 실패", signupRespDto));
        }

        return ResponseEntity.ok(new CMRespDto<>(1, "회원가입 완료", signupRespDto));
    }
}
