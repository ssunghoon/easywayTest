package easyway.action.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;

public class ProjectInsertFormAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/projects/project.jsp");
		
		return forward;
	}
}
