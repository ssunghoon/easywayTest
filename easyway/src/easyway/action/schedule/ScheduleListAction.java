package easyway.action.schedule;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.service.ScheduleService;

public class ScheduleListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward(); 
		ScheduleService service = ScheduleService.getInstance();
		
//		
//		request.setAttribute("listModel", listModel);
		
		forward.setRedirect(false);
		forward.setPath("/list.jsp");
		
		return forward;
	}

}
