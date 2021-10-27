package easyway.service;

import javax.servlet.http.HttpServletRequest;

import easyway.model.schedule.Schedule;
import easyway.model.schedule.ScheduleDao;

public class ScheduleService {
	private static ScheduleService service = new ScheduleService();
	private static ScheduleDao dao;
	
	public static ScheduleService getInstance() {
		dao = ScheduleDao.getInstance();
		return service;
	}
			  
	public int ScheduleInsertService(HttpServletRequest request) throws Exception{//내꺼에 맞게 수정하기
		request.setCharacterEncoding("utf-8");
		System.out.println("ScheduleInsertService실행");//확인코드
		
		Schedule schedule = new Schedule();
		schedule.setSchedule_title(request.getParameter("schedule_title"));
		schedule.setSchedule_start(request.getParameter("schedule_start"));
		schedule.setSchedule_end(request.getParameter("schedule_end"));
		schedule.setSchedule_content(request.getParameter("schedule_content"));
		schedule.setSchedule_importance(request.getParameter("schedule_importance"));
		schedule.setSchedule_private(request.getParameter("schedule_private"));
		
		System.out.println(request.getParameter("schedule_title"));
		System.out.println(request.getParameter("schedule_start"));
		System.out.println(request.getParameter("schedule_end"));
		System.out.println(request.getParameter("schedule_content"));
		System.out.println(request.getParameter("schedule_importance"));
		System.out.println(request.getParameter("schedule_private"));
//		
		
		return dao.scheduleInsert(schedule);
	}
}

