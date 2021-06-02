package com.ict.edu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class Ex02 extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���� : java�ڵ�� HTML, CSS, JavaScript�� ��� ���
		//JSP : HTML, CSS, JavaScript�� �ڹ��ڵ带 ��� ���
		
		//������ ���� �ѱ� ó��
		//ContentType => �ش� ���� Ÿ���� ����
		response.setContentType("text/html; charset=utf-8");
		
		//ȭ��(������)�� ����ϱ� ���� ����
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title> ���� �±� : h1 ~ h6</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 style='font-size: 48px'> �����±� h1 (���� ū ����)</h1>");
		out.println("<h1 style='background-color: yellow;'> �����±� h1 </h1>");
		out.println("<h2> �����±� h2 </h2>");
		out.println("<h3> �����±� h3 </h3>");
		out.println("<h4> �����±� h4 </h4>");
		out.println("<h5> �����±� h5 </h5>");
		out.println("<h6> �����±� h6 </h6>");
		out.println("<h7> �����±� h7 </h7>");
		out.println("<h8> �����±� h8 </h8>");
		out.println("<hr>");

		out.println("<span style='background-color: yellow;'>HTML & CSS</span>");
		out.println("<span>JavaScript</span>");

		out.println("</body>");
		out.println("</html>");
		
	}

}
