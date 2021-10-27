package easyway.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;

public class MemberLoginFormAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//insertForm.jsp으로 이동하기 위한 클래스 (경로 하나당 클래스 하나만들어야 함)
		ActionForward forward = new ActionForward();
		forward.setRedirect(false);
		// 새 페이지가 아니라 연장요청이기 때문에 디스패처 호출
		forward.setPath("/WEB-INF/members/log_in.jsp");
		//경로 지정
		
		return forward;
	}
}
