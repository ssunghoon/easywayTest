package easyway.action.office;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.model.office.Office;
import easyway.service.OfficeService;

public class OfficeDetailAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		OfficeService service = OfficeService.getInstance();
		
		int seq = Integer.parseInt(request.getParameter("seq"));

		Office office = new Office();
		office = service.detailOfficeService(seq);
		request.setAttribute("office", office);
		
		
		forward.setRedirect(false);
		forward.setPath("/detail.jsp");
		
		return forward;
	
	}


}
