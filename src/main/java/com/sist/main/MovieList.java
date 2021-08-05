package com.sist.main;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.*;
import com.sist.dao.*;
@WebServlet("/MovieList")
public class MovieList extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 전송 파일 지정 => HTML
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=stylesheet href=table.css>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>ㅎㅇㅎㅇ</h1>");
		MovieDAO dao=new MovieDAO();
		ArrayList<MovieVO> list=dao.movieListData();
		for(MovieVO vo:list)
		{
			out.println("<div>");
			out.println("<tr class=dataTr>");
			out.println("<td align=center><img src="+vo.getPoster()+" width=300 height=300></td>");
			out.println("<td>"+vo.getMno()+">"+vo.getTitle()+"</td>");
			out.println("</div>");
			// 값을 전송 => URL을 이용해서 전송 => ?변수=값  , ?변수=값&변수=값....
			// 메모리 할당=> 톰캣 (서블릿 메모리 할당 => ?뒤에 있는 값을 전송)
			// ?뒤에 값을 보내는 방법 : GET 
			// 다른 파일로 데이터를 전송 : GET/POST
			// GET => doGet   POST => doPost  ====> doGet+doPost => service
			out.println("</tr>");
		}
		out.println("</body>");
		out.println("</html>");
	}
}
