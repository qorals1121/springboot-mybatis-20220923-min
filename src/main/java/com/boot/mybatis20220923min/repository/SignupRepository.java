package com.boot.mybatis20220923min.repository;

import com.boot.mybatis20220923min.domain.Signup;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SignupRepository {

    public int save(Signup signup);
}
