package com.toyboard.boardtoyproject.domain;

import java.util.Date;

public class ArticleComment {
    private long id;
    private String article; //게시글
    private String content; //본문

    private Date createdAt; // LocalDateTime 대체 , 생성일시
    private String createdBy; //생성자
    private Date modifedAt; //수정일시
    private String modiredBy; //수정자


}
