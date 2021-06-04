package com.ict.model;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command02  implements Command{
	//���� �޼ҵ�
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String msg = "";
		//��갪 ���ϱ�
		
		int s1 = Integer.parseInt(request.getParameter("s1"));
		int s2 = Integer.parseInt(request.getParameter("s2"));
		String op = request.getParameter("op");
		
		int result = 0;
		
		
		if(s2 == 0 && op.equals("/")) {
			msg = "0���� ���� �� �����ϴ�.";
		}
		else {
			
			switch(op) {
				case "+" : result = s1 + s2 ; break; 
				case "-" : result = s1 - s2 ; break; 
				case "*" : result = s1 * s2 ; break; 
				case "/" : result = s1 / s2 ; break; 
			}
			msg = s1 + " " + op + " " + s2 + "=" + result;
		}
		return msg;
	}
}
