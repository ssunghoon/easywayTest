package easyway.action.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.service.ProjectService;

public class ProjectInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ProjectService service = ProjectService.getInstance();
		
		service.insertProjectService(request);
		
		forward.setRedirect(true);
		forward.setPath("projectListAction.do");
		
		return forward;
	}

}
