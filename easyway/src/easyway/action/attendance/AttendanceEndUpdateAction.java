package easyway.action.attendance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.service.AttendanceService;

public class AttendanceEndUpdateAction implements Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		AttendanceService service = AttendanceService.getInstance();

		service.AttendanceEndUpdateService();

		forward.setRedirect(false);
		forward.setPath("/attendance.jsp");

		return forward;
	}

}
