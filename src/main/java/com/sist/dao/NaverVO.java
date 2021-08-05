package com.sist.dao;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
/*
 * 
CODE        NOT NULL NUMBER         
TITLE                VARCHAR2(100)  
GENRE                VARCHAR2(200)  
NATION               VARCHAR2(100)  
RUNNINGTIME          VARCHAR2(100)  
REGDATE              VARCHAR2(300)  
FILMRATE             VARCHAR2(300)  
DIRECTOR             VARCHAR2(200)  
ACTOR                VARCHAR2(1000) 
STORY                VARCHAR2(3000) 
MOVIE                VARCHAR2(300)  
 */
public class NaverVO {
	private String code,title,genre,nation,runningTime,regDate,filmRate,director,actor,story,movie;
}
