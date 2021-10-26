package easyway.action.project;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.model.Project;
import easyway.service.ProjectService;

public class ProjectListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward = new ActionForward();
		ProjectService service = ProjectService.getInstance();
		
		List<Project> list = service.listProjectService(request);
		
		request.setAttribute("list", list);
		
		
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/projects/projectlist.jsp");
		
		return forward;
	}

}
