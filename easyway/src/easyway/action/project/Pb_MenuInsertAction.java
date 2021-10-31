package easyway.action.project;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.service.ProjectService;

public class Pb_MenuInsertAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ProjectService service = ProjectService.getInstance();
		
		int project_id = Integer.parseInt(request.getParameter("project_id"));
		service.insertPb_MenuService(project_id);
		
		forward.setRedirect(true);
		forward.setPath("pb_menuListAction.do?project_id="+project_id);
		
		return forward;
	}

}
