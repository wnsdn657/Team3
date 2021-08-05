package com.sist.dao;
import java.util.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
/*
 * 
 * MNO      NOT NULL NUMBER        
TITLE    NOT NULL VARCHAR2(300) 
REGDATE           VARCHAR2(100) 
GENRE    NOT NULL VARCHAR2(200) 
GRADE    NOT NULL VARCHAR2(50)  
SCORE             NUMBER(2,1)   
SHOWUSER          VARCHAR2(100) 
POSTER   NOT NULL VARCHAR2(260) 
 */
public class MovieVO {
	private int mno;
	private double score;
	private Date regdate;
	private String title,genre,grade,showUser,poster;
}
