package com.ict.model;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command01 implements Command {
	//������ ��¥�� ��� ��ġ�� �޼ҵ�
	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		String msg = "";
		//������ ��¥�� ��� ���ϴ� �޼ҵ�
		
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DATE);
		int lucky = (int)(Math.random()*101);
		
		msg =  year + "�� " + month + "�� " + day + "�� �� � :" + lucky + "%";
		
		
		return msg;
	}
}
