package easyway.action.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.service.NoticeService;

public class NoticeInsertAction implements NoticeAction {

	@Override
	public NoticeActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		NoticeActionForward forward = new NoticeActionForward()	;
		NoticeService service = NoticeService.getInstance();
		
		service.noticeInsertService(request);
		
		//페이지이동 (listAction.do) => 새로운 요청
		forward.setRedirect(true);
		forward.setPath("noticeListAction.do");
		
		return forward;
	}

}
