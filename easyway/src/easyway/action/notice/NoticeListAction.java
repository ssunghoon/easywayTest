package easyway.action.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.model.notice.Notice;
import easyway.model.notice.ListModel;
import easyway.service.NoticeService;

public class NoticeListAction implements NoticeAction {

	@Override
	public NoticeActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		NoticeActionForward forward = new NoticeActionForward();
		NoticeService service = NoticeService.getInstance();

		List<Notice> list = service.noticeListService(request, response);
		request.setAttribute("list", list);
		
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/notice/noticeList.jsp");
		
		return forward;
	}

}
