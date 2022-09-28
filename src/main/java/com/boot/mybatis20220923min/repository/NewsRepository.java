package com.boot.mybatis20220923min.repository;

import com.boot.mybatis20220923min.domain.News;
import com.boot.mybatis20220923min.domain.NewsFile;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper // 모든 implents 객체를 만들어줌, xml이 객체라고 생각하면 됨
public interface NewsRepository {

    public int save(News news);
    public int saveFiles(List<NewsFile>newsFileList);
    public News getNews(int news_id); //빨간줄 뜰 때 단축키 alt + enter
}
