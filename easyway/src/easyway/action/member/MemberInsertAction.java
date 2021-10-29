package easyway.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.service.MemberService;

public class MemberInsertAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MemberService service = MemberService.getInstance();
		
		//이하 비즈니스 호출 작업
		int result = service.insertMemberService(request);
		result = -1;
		request.setAttribute("insertResult", result);
		
		//페이지 이동 (listAction.do) = .do에서 .do로 이동 = 새로운 요청
		//list.jsp로 바로 이동해서 list.jsp가 모든 것을 처리하게끔 하지 않을 예정
		
		forward.setRedirect(true);
		forward.setPath("memberLoginForm.do");
		
		return forward;
	}

}
