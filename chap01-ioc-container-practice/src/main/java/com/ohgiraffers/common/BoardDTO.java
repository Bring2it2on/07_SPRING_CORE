package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
@AllArgsConstructor
public class BoardDTO {

    private long id;
    private String title;
    private String content;
    private String writer;

}
