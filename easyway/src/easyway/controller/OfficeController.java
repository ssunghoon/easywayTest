package easyway.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.action.office.OfficeDeleteAction;
import easyway.action.office.OfficeDetailAction;
import easyway.action.office.OfficeInsertAction;
import easyway.action.office.OfficeInsertFormAction;
import easyway.action.office.OfficeListAction;

@WebServlet("/office/*")
public class OfficeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OfficeController() {
        super();
    }
    
    public void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	//url 식별
    	String requestURI = request.getRequestURI();
    	// 		/MVC/board/insertForm.do 등의 URL이 들어옴
    	String contextPath = request.getContextPath();
    	String command = requestURI.substring(contextPath.length()+8);
    	// command는 /MVC/board/ 뒤의 URL을 추출한 변수
    	System.out.println(command);
    	//	insertForm.do만 추출하고 sysout에서 확인
    	
    	Action action = null;
    	//Action으로 선언하고 개별 클래스별로 형변환 할 수 있다
    	ActionForward forward = null;
    	 
		/*
		 * if(command.equals("officeInsertForm.do")) { ///MVC/board/insertForm.do 주소로
		 * 들어왔을 때 action = new OfficeInsertFormAction(); //Action을 insertFormAction으로!
		 * try { forward = action.execute(request, response); } catch (Exception e) {
		 * e.printStackTrace(); } }else
		 */if(command.equals("officeInsertAction.do")) {
    		 action = new OfficeInsertAction();
    		 try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	 }else if(command.equals("officeListAction.do")) {
    		 action = new OfficeListAction();
    		 try {
 				forward = action.execute(request, response);
 			} catch (Exception e) {
 				e.printStackTrace();
 			}
    	 }else if(command.equals("officeDetailAction.do")) {
    		 action = new OfficeDetailAction();
    		 try {
    			 forward = action.execute(request, response);
    		 } catch (Exception e) {
    			 e.printStackTrace();
    		 }
    	 }else if(command.equals("officeDeleteAction.do")) {
    		 action = new OfficeDeleteAction();
    		 try {
    			 forward = action.execute(request, response);
    		 } catch (Exception e) {
    			 e.printStackTrace();
    		 }
    	 }    	 
    	
    	 
    	 if(forward != null) {
    		 //리다이렉트 vs 디스패처 결정하는 메서드
    		 if(forward.isRedirect()) {
    			 //isRedirect = true = redirect로 보내는 경우
    			 response.sendRedirect(forward.getPath());
    		 }else {
    			 //isRedirect = false = dispatcher로 요청하는 경우
    			 RequestDispatcher dispatcher = 
    					 request.getRequestDispatcher(forward.getPath());
    			 dispatcher.forward(request, response);
    		 }
    	 }
		/* 질문 : 어떤 경우에 Redirect로, Dispatcher로 하나요?
		- 요청이 다를 경우는 Redirect로, 같을 경우에는 Dispatcher로!
		- 해당하는 요청, 비즈니스 처리, 해당하는 jsp로 이동
		- 해당하는 요청, 비스지스 처리, 또 다른 .do로 해서 해당하는 jsp로 이동*/
    	 
    	 
    }//end doProcess

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
