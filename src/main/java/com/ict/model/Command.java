package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//����� �߻� �޼ҵ常 ������ �ִ� == �������̽�
public interface Command {
	//������ ��¥�� ��� ���ϴ� �޼ҵ�
	public String exec(HttpServletRequest request, HttpServletResponse response);
}
