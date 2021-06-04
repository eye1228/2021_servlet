package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//상수와 추상 메소드만 가지고 있다 == 인터페이스
public interface Command {
	//오늘의 날짜와 운세를 구하는 메소드
	public String exec(HttpServletRequest request, HttpServletResponse response);
}
