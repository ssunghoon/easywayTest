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
import easyway.action.sign.BasicInsertAction;
import easyway.action.sign.BasicInsertFormAction;
import easyway.action.sign.DraftListAction;
import easyway.action.sign.SignInsertListAction;
import easyway.action.sign.SpendInsertAction;
import easyway.action.sign.SpendInsertFormAction;
import easyway.action.sign.VacationInsertAction;
import easyway.action.sign.VacationInsertFormAction;

@WebServlet("/sign/*")
public class SignController extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public SignController() {
		super();
	}
	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();  
		String contextPath = request.getContextPath();   //   /eayway
    	String command = requestURI.substring(contextPath.length() + 6);
    	System.out.println(command);
    	
    	Action action = null;
    	ActionForward forward = null;
    	
    	// begin 기본 기안서
    	if(command.equals("insertBasicForm.do")) {
    		action = new BasicInsertFormAction();
    		try {
    			forward = action.execute(request, response);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}else if(command.equals("insertBasicAction.do")) {
    		action =  new BasicInsertAction();
    		try {
    			forward = action.execute(request, response);
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
		// end 기본 기안서
		// begin 지출 결의서
    	}else if(command.equals("insertSpendForm.do")) {
    		action = new SpendInsertFormAction();
    		try {
    			forward = action.execute(request, response);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}else if(command.equals("insertSpendAction.do")) {
    		action =  new SpendInsertAction();
    		try {
    			forward = action.execute(request, response);
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
		// end 지출 결의서
		// begin 휴가 신청서
    	}else if(command.equals("insertVacationForm.do")) {
    		action = new VacationInsertFormAction();
    		try {
    			forward = action.execute(request, response);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}else if(command.equals("insertVacationAction.do")) {
    		action =  new VacationInsertAction();
    		try {
    			forward = action.execute(request, response);
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
		// end 휴가 신청서
		// 기안 작성 목록 페이지
    	}else if(command.equals("signInsertListAction.do")) {
    		action =  new SignInsertListAction();
    		try {
    			forward = action.execute(request, response);
    		}catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    	else if(command.equals("draftListAction.do")) {
    		action = new DraftListAction();
    		try {
    			forward = action.execute(request, response);
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
    	}
	}// end doProcess
    	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		doProcess(request, response);
    	}

    	protected void doPost(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		doProcess(request, response);
    	}

    }
