package easyway.action.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.model.member.Member;
import easyway.service.MemberService;

public class MemberLoginAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		MemberService service = MemberService.getInstance();
		
		System.out.println("로그인 액션 실행");
		//이하 비즈니스 호출 작업
		Member result = service.loginMemberService(request);
		HttpSession session = request.getSession();
		session.setAttribute("memberInfo", result);
		
		
		//페이지 이동 (listAction.do) = .do에서 .do로 이동 = 새로운 요청
		//list.jsp로 바로 이동해서 list.jsp가 모든 것을 처리하게끔 하지 않을 예정
		
		forward.setRedirect(true);
		forward.setPath("/easyway/office/officeListAction.do");
		
		return forward;
	}

}
