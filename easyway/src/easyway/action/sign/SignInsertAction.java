package easyway.action.sign;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;

// 기본 기안서
public class SignInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();

		int sign_id = Integer.parseInt(request.getParameter("sign_id"));
		
		System.out.println(sign_id);
		// 비즈니스 호출
		
		
		// 페이지이동(insertSign.do) => 새로운 요청
		forward.setRedirect(true);
		forward.setPath("signInsertAction.do");
		
		return forward;
	}

}
