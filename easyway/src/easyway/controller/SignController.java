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
