package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex15")
public class Ex15 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		
		//�ϳ��� ������ ���� ���� ó���ϴ� ������ �����.
		//�̰��� �ذ��ϱ� ���ؼ� ������ ��ó���ϴ� �ڹ�Ŭ������ ���� ȣ���Ѵ�.
		
		
		String cmd = request.getParameter("cmd");
		
		
		
		switch(cmd) {
			case "1":
				Calendar now = Calendar.getInstance();
				int year = now.get(Calendar.YEAR);
				int month = now.get(Calendar.MONTH) + 1;
				int day = now.get(Calendar.DATE);
				out.println("<h2>Ex14_1������ ������ ��¥</h2>");
				out.println("<p>" + year + "�� " + month + "�� " + day + "�� </p>");
				break;
			case "2":
				int lucky = (int)(Math.random()*101);
				out.println("<h2>Ex14_2 ������ ����ϱ�</h2>");
				
				out.println("<p>" + lucky + "%</p>");
				break;
			case "3":
				Calendar now2 = Calendar.getInstance();
				int year2 = now2.get(Calendar.YEAR);
				int month2 = now2.get(Calendar.MONTH) + 1;
				int day2 = now2.get(Calendar.DATE);
				int lucky2 = (int)(Math.random()*101);
				
				out.println("<h2>Ex15 ������ ������ ��¥�� �</h2>");
				
				out.println("<p>" + year2 + "�� " + month2 + "�� " + day2 + "�� �� � :" + lucky2 + "%</p>");
				break;
		}
		
		
		
		
	}

}
