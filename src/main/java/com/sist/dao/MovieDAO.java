package com.sist.dao;
import java.sql.*;
import java.util.*;

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
public class MovieDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@192.168.219.100:1521:XE";
	
	public MovieDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch (Exception e) {e.printStackTrace();}
	}
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {ex.printStackTrace();}
	}
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {ex.printStackTrace();}
	}
	// 기능
	public ArrayList<MovieVO> movieListData(){
		ArrayList<MovieVO> list=new ArrayList<MovieVO>();
		try {
			getConnection();
			String sql="SELECT mno,title,genre,grade,score,poster FROM daum_movie ORDER BY Mno";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				MovieVO vo=new MovieVO();
				vo.setMno(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setGenre(rs.getString(3));
				vo.setGrade(rs.getString(4));
				vo.setScore(rs.getDouble(5));
				vo.setPoster(rs.getString(6));
				list.add(vo);
			}rs.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally{
			disConnection();
		}
		return list;
	}
}
