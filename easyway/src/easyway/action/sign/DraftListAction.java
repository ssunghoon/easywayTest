package easyway.action.sign;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.model.sign.Sign;
import easyway.service.SignService;

public class DraftListAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		SignService service = SignService.getInstance();
		
		List<Sign> draftList = service.listDraftService(request);
		request.setAttribute("draftList", draftList);
		
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/signs/draftSignList.jsp");
		
		return forward;
	}
}
