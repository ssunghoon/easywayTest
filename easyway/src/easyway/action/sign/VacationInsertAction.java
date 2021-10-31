package easyway.action.sign;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.service.SignService;

// 기본 기안서
public class VacationInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		SignService service = SignService.getInstance();
		// 비즈니스 호출
		service.insertVacationSignService(request);
		
		// 페이지이동(insertSign.do) => 새로운 요청
		forward.setRedirect(true);
		forward.setPath("signInsertListAction.do");
		
		return forward;
	}

}
