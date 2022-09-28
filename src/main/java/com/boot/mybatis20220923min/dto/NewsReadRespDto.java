package com.boot.mybatis20220923min.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class NewsReadRespDto {

    private int id;
    private String title;
    private String writer;
    private String broadcastingName;
    private String content;

    private String createDate;
    private String updateDate;

}
