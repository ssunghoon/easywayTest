package easyway.action.office;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.service.OfficeService;

public class OfficeDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		OfficeService service = OfficeService.getInstance();
		
		int seq = Integer.parseInt(request.getParameter("seq"));
		service.deleteOfficeService(seq);
		
		forward.setRedirect(true);
		forward.setPath("OfficelistAction.do");
		
		return forward;
	}

}
