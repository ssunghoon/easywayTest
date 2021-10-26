package easyway.action.attendance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.model.attendance.Attendance;
import easyway.service.AttendanceService;

public class AttendanceTodayAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		AttendanceService service = AttendanceService.getInstance();
		
		//임의의 사원 1번
		int employee_id = 1;
		
		Attendance attendance = service.attendanceTodayService(employee_id);
		request.setAttribute("attendance", attendance);
		
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/attendances/attendance.jsp");
		
		return forward;
	}

}
