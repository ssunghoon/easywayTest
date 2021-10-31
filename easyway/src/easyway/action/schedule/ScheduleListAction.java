package easyway.action.schedule;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.model.schedule.Schedule;
import easyway.service.ScheduleService;

public class ScheduleListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ActionForward forward = new ActionForward(); 
		ScheduleService service = ScheduleService.getInstance();
		List<Schedule> list = service.ScheduleListservice(request, response);

		request.setAttribute("list",list );
		
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/schedules/scheduleListForm.jsp");//수정확인하기
		
		return forward;
	}

}
