package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex05")
public class Ex05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��û(�Ķ����)�� ���� �ѱ� ó��
		request.setCharacterEncoding("utf-8");		
		
		//����(������)�� ���� �ѱ� ó��
		response.setContentType("text/html; charset=utf-8");
		//ȭ��(������)�� ��� ����
		PrintWriter out = response.getWriter();
		
		//------------------------------ ������� 3���� �⺻���� ó�� �κ�
		
		//Ŭ���̾�Ʈ�� �������� ������ ��û�ϸ鼭 �ʿ��� ������ ���� �� �ִ�.
		//�̷��� ��û�� ó���ϱ� ���ؼ� �Բ� ���޵Ǵ� ������ �Ķ���Ͷ�� �Ѵ�.
		//�Ķ���͸� �޾Ƽ� ó���� �� �ʿ��� ������ Ŭ���̾�Ʈ���� ������.
		
		//�Ķ������ �ڷ����� �⺻������ String�̰ų� String[]�̴�.
		//���� �̸����� �������� ���� �Ѿ�� String[]�̰� �̸��� �ϳ��� ���� �Ѿ���� String�̴�.
		//get ����� �ּ�â�� �Ķ���Ͱ� ���δ�.(?name=values&name=values&name=values....)
		//�׷��� post����� �ּ�â�� �Ķ���Ͱ� ������ �ʴ´�.
	
		//�Ķ���͸� �޾Ƽ� ó���ϴ� �޼ҵ��
		// 1. request.getParameter("name") : String   = �ش� �̸��� �ش��ϴ� ���� �����ؼ� �����Ѵ�. => ���� �ϳ�
		// 2. request.getParameterValues("name") : String[] = �ش� �̸��� ��Ī ���� �����ؼ� ����(���� ������)
		// 3. request.getParameterMap() : Map<String, String[]> = �� ������ �Ķ���� �϶� ���
		// 4. request.getParameterNames() : Enumeration<String> = �������� �Ķ���� �� ��
		
		//���� �̸�(name)�� ����(age)�� �Ķ���Ͱ����� �Ѿ���� �� ó���ϴ� ���
		out.println("<h2>���� �Ķ���� ����</h2>");
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.println("<h3>");
		out.println("<p>�̸� : " + name + "</p>");
		out.println("<p>���� : " + age + "</p>");
		out.println("</h3>");
		
		//���࿡ s1, s2, op��� �̸����� ���� �ΰ��� �ϳ��� ������(+-*/)�� �Ѿ�´ٰ� �ڤä�
		String s1 = request.getParameter("s1");
		String s2 = request.getParameter("s2");
		String op = request.getParameter("op");
		int su1 = Integer.parseInt(s1);
		int su2 = Integer.parseInt(s2);
		out.println("<h3>"); 
		switch (op) {
		case "+":  out.println("<p>��� : " + su1 + op + su2 + "=" + (su1+su2) +"</p>"); break;
		case "-":  out.println("<p>��� : " + su1 + op + su2 + "=" + (su1-su2) +"</p>"); break;
		case "*":  out.println("<p>��� : " + su1 + op + su2 + "=" + (su1*su2) +"</p>"); break;
		case "/":  out.println("<p>��� : " + su1 + op + su2 + "=" + (su1/su2) +"</p>"); break;
		}
		out.println("</h3>");
		out.println("<hr>");
		
		//���� �� ���
		
		int k1 = Integer.parseInt(request.getParameter("s1"));
		int k2 = Integer.parseInt(request.getParameter("s2"));
		int result = 0 ;
		out.println("<h3>");
		switch (op) {
		case "+": result = k1 + k2 ; break;
		case "-": result = k1 - k2 ; break; 
		case "*": result = k1 * k2 ; break; 
		case "/": result = k1 / k2 ; break; 
		}
	    out.println("<p>��� : " + su1 + op + su2 + "=" + result +"</p>"); 
		out.println("</h3>");
		
		out.println("<hr>");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
