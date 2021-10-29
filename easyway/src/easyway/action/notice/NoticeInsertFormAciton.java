package easyway.action.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NoticeInsertFormAciton implements NoticeAction{

	@Override
	public NoticeActionForward execute(HttpServletRequest request
			, HttpServletResponse response) throws Exception {
		NoticeActionForward forward = new NoticeActionForward();
	forward.setRedirect(false);
	forward.setPath("/WEB-INF/notice/noticerInsertForm.jsp");
	System.out.println("asdfasdf");
		return forward;
	}
	
}
