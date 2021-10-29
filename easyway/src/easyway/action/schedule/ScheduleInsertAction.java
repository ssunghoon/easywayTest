package easyway.action.schedule;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.service.ScheduleService;

public class ScheduleInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		ScheduleService service = ScheduleService.getInstance();
		
		//서비스호출
		service.ScheduleInsertService(request);
		forward.setRedirect(true);
//		forward.setPath("scheduleInsertAction.do");
		forward.setPath("list.do");//수정
		
		
		
		return forward;
	}

}
