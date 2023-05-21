package com.toyboard.boardtoyproject.domain;

import java.util.Date;

public class Article {

    private long id;
    private String title; //제목
    private String hashtag; //해시태그

    private Date createdAt; // LocalDateTime 대체 , 생성일시
    private String createdBy; //생성자
    private Date modifedAt; //수정일시
    private String modiredBy; //수정자
}
