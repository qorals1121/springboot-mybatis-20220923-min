package com.boot.mybatis20220923min.domain;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class News {
    private int news_id;

    private String news_title;
    private String news_writer;
    private String news_broadcasting;
    private String news_content;

    private LocalDateTime create_date;
    private LocalDateTime update_date;
}
