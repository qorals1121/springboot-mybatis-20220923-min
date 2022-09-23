package com.boot.mybatis20220923min.repository;

import com.boot.mybatis20220923min.domain.News;
import org.apache.ibatis.annotations.Mapper;

@Mapper // 모든 implents 객체를 만들어줌, xml이 객체라고 생각하면 됨
public interface NewsRepository {

    public int save(News news);
}
