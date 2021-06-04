package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.*;

@WebServlet("/Ex16")
public class Ex16 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html; charset=utf-8");
	    PrintWriter out = response.getWriter();

	    //일처리가 많아지므로 담당 일처리를 할 자바 클래스를 만든다.
	    String cmd = request.getParameter("cmd");
	    String msg = "";
	    
	    System.out.println(cmd);
	    //Command01, Command02, Command03이 모두 같은 형태의 메소드를 사용하므로
	    //Command 라는 인터페이스를 만들어서 사용하자
	    Command comm = null;
	    switch (cmd) {
		case "1":	
			//오늘의 날짜와 운세
			comm = new Command01();
			break;
		case "2":	
			//계산기
			comm = new Command02();
			break;
		case "3":	
			//성적처리
			comm = new Command03();
			break;
		}
	   msg = comm.exec(request, response);
	   out.println("<h3>결과보기</h3>");
	   out.println("<p>" + msg + "</p3>");
	    
	  
	}
}
