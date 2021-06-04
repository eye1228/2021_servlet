package com.ict.model;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command03 implements Command{
	//���� ���ϴ� �޼ҵ�
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String msg = "";
		//���� ���ϱ�
		
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		
		int sum = kor + eng + math;
		
		double avg = (int)(sum/3.0 * 10) / 10.0;
		
		String hak = "";
		
		if(avg >= 90) {
			hak = "A����";
		}else if(avg >= 80) {
			hak = "B����";		
		}else if(avg >= 70) {
			hak = "C����";
		}else {
			hak = "F����";
		}
		
		msg = "�̸� : " + name + " ���� : " + sum + "��� : " + avg +  " ���� : " + hak;
		
		return msg;
	}
}
