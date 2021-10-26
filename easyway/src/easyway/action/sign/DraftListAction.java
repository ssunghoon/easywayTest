package easyway.action.sign;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.model.sign.DraftListModel;
import easyway.service.SignService;

public class DraftListAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		SignService service = SignService.getInstance();
		
		DraftListModel draftListModel = service.listDraftService(request);
		request.setAttribute("draftListModel", draftListModel);
		
		forward.setRedirect(false);
		forward.setPath("/sign/draftSignList.jsp");
		
		return forward;
	}
}
