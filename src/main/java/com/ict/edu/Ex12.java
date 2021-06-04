package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ex12")
public class Ex12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		//������ �̵�(�� ���̷�Ʈ, ������)
		// 1. ������ 	:	�ٸ� �������� �̵��ϸ鼭 ������ request�� response�� �״�� ��������
		//				�� �Ķ���Ͱ����� ������� �ʴ´�.
		//				�ּ�â�� ���� �ּҰ� ���δ�
		
		//����		  :	request.getRequestDispatcher("�̵��� �ּ�").forword(request, response);
		//				�̵��� �ּҰ� servlet�̸� Ȯ���ڴ� ���� �ʴ´�. 
		//				�̵��� �ּ� html�����̸� Ȯ���ڸ� ����Ѵ�.
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.println("<h2> Ex12 ������ </h2>");
		out.println("<h3>");
		out.println("<li>�̸� : " + name + "</li>");
		out.println("<li>���� : " + age + "</li>");
		
		out.println("</h3>");
		
		request.getRequestDispatcher("Ex13").forward(request, response);
	}

}
