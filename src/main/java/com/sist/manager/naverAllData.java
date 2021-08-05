package com.sist.manager;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import com.sist.dao.*;

public class naverAllData {
public static void main(String[] args) {
	naverAllData a=new naverAllData();
	a.naverAllData();
}
	public void naverAllData()
	   {
		   /*
		    *  <div class="item_poster">
	           <a href="/moviedb/main?movieId=145371" class="thumb_item" data-tiara-layer="poster">
		    */
		   try
		   {
			   Document doc=Jsoup.connect("https://movie.naver.com/movie/running/current.naver").get(); // HTML소스를 읽어 온다 
		       Elements links=doc.select(".thumb a");
		       // 데이터베이스에 저장 
		       NaverDAO dao=new NaverDAO();
		       for(int i=0;i<links.size();i++)
		       {
		    	   NaverVO vo=new NaverVO();
		    	   String link=links.attr("href");
		    	   System.out.println("링크:"+link);
		    	     	   
		    	}

		       System.out.println("데이터베이스 저장 종료!!");
		   }catch(Exception ex){}
	   }
}
