package com.jojoldu.lecture.fcspringboot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * Created by jojoldu@gmail.com on 2019-01-12
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@Data
public class Board {
    private Long id;
    private String title;
    private String name;
    private String content;
    private LocalDateTime createDate;
    private int readCount;

    @Builder
    public Board(String title, String name, String content) {
        this.title = title;
        this.name = name;
        this.content = content;
        this.id = 0L;
        createDate = LocalDateTime.now();
        readCount = 0;
    }
}
