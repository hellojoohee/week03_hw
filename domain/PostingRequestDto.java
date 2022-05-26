package com.sparta.week03hw.domain;

import lombok.Getter;

@Getter
public class PostingRequestDto {
    private String title;
    private String username;
    private Long pw;
    private String contents;
}
