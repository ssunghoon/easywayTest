package easyway.action.project;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.model.Pb_Menu;
import easyway.service.ProjectService;

public class Pb_MenuListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward = new ActionForward();
		ProjectService service = ProjectService.getInstance();
		
		int project_id = Integer.parseInt(request.getParameter("project_id"));
		
		List<Pb_Menu> pbm = service.listPb_MenuService(project_id);
		
		request.setAttribute("project_id", project_id);
		request.setAttribute("pbm", pbm);
		
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/projects/pb_menulist.jsp");
		
		return forward;
	}

}
