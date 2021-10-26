package easyway.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;


import easyway.model.schedule.Schedule;
import easyway.model.schedule.ScheduleDao;

public class ScheduleService {
	private static ScheduleService service = new ScheduleService();
	private static ScheduleDao dao;
	
	public static ScheduleService getInstance() {
		dao = ScheduleDao.getInstance();
		return service;
	}
			  
	public int ScheduleInsertService() throws Exception{//내꺼에 맞게 수정하기
		System.out.println("ScheduleInsertService실행");//확인코드
		
		Schedule schedule = new Schedule();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
        
        schedule.setSchedule_start(sdf.format(timestamp));
        schedule.setSchedule_end("");
        System.out.println(schedule.getSchedule_start());
        
		return dao.scheduleInsert(schedule);
	}
}

