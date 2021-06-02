package com.ict.edu;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
	���� 	: �ڹٸ� ������ �� �������� ǥ���ϴ� ���
			  �ڹٿ��� HTML, CSS, JavaScript���� ǥ���ؼ� �� �������� ����� ǥ���Ѵ�.
			  ���� �޼ҵ���� �����Ѵ�.
 */

//URL mapping 	: �ش� �������� ������ ������ �� �ִ� �ּ�
//������			: localhost:8090/������Ʈ�̸�/URL mapping�ּ�
@WebServlet("/Ex01")
public class Ex01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Ex01() {
        super();
        //sysout�� �ܼ�â�� ��µ�(���������� ��µ��� �ʴ´�)
        System.out.println("������");
    }

	public void init(ServletConfig config) throws ServletException {
		//�����ڿ� ����ʵ��� �ʱ�ȭ, ��ü ������ �� �ѹ� ȣ�� �ȴ�.
		System.out.println("init");
		//�ڵ����� service�� ȣ���Ѵ�.
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//������ ������ Ŭ���̾�Ʈ�� ������ ��û�� �� ��û ��Ŀ� ���� �˸´� �޼ҵ带 ȣ���ϴ� ����
		// ��û��� : 	-get ����̸� doGet()�� �̵�
		//		  : -post ����̸� doPost()�� �̵�
		//** get���(��������) : 	������ http ��Ŷ�� head�� ��Ƽ� ������.
		//						*�ּ�â�� �ش� �ּҰ� ���δ�.
		//						�ӵ��� ������. ���� �翡 ����, ���ȿ� ���
		//** post��� : 			������ http ��Ŷ�� body�� ��Ƽ� ������.
		//						*�ּ�â�� �ش� ������ ������ �ʴ´�.
		//						�ӵ��� get���� ��������� ������. ���� �翡 ����. get��ĺ��ٴ� �������̴�.
		// - request : Ŭ���̾�Ʈ���� ���� ��û ������ ������ �ִ� ��ü
		// - response : Ŭ���̾�Ʈ���� ����� ������ �� �ִ� ���� ������ ������ �ִ� ��ü
		System.out.println("service");
		if(request.getMethod().equalsIgnoreCase("get")) {
			doGet(request, response);
		}else if(request.getMethod().equalsIgnoreCase("post")) {
			doPost(request, response);
		}
	}
	
	//������ �ڹ��ڵ�� HTML, CSS, JavaScript�� ��� ����ؼ� �� �������� ����� �޼ҵ�(doPost(), doGet())
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet()");
		doPost(request, response);
	}
	
	//������ �ڹ��ڵ�� HTML, CSS, JavaScript�� ��� ����ؼ� �� �������� ����� �޼ҵ�(doPost(), doGet())
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost()");
	}

	public void destroy() {
		//�ش� ������Ʈ ���Ͽ��� �����Ǳ� ������ �����ϴ� �޼ҵ�
		System.out.println("destroy");
	}
}
