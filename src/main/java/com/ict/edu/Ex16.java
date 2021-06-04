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

	    //��ó���� �������Ƿ� ��� ��ó���� �� �ڹ� Ŭ������ �����.
	    String cmd = request.getParameter("cmd");
	    String msg = "";
	    
	    System.out.println(cmd);
	    //Command01, Command02, Command03�� ��� ���� ������ �޼ҵ带 ����ϹǷ�
	    //Command ��� �������̽��� ���� �������
	    Command comm = null;
	    switch (cmd) {
		case "1":	
			//������ ��¥�� �
			comm = new Command01();
			break;
		case "2":	
			//����
			comm = new Command02();
			break;
		case "3":	
			//����ó��
			comm = new Command03();
			break;
		}
	   msg = comm.exec(request, response);
	   out.println("<h3>�������</h3>");
	   out.println("<p>" + msg + "</p3>");
	    
	  
	}
}
