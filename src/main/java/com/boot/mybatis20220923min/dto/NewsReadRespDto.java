package com.boot.mybatis20220923min.dto;

import com.boot.mybatis20220923min.domain.NewsFile;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class NewsReadRespDto {

    private int id;
    private String title;
    private String writer;
    private String broadcastingName;
    private String content;
    private List<NewsFile> fileList;

    private String createDate;
    private String updateDate;

}
