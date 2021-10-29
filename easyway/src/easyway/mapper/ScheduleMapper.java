package easyway.mapper;

import java.util.List;

import easyway.model.schedule.Schedule;

public interface ScheduleMapper {

	int scheduleInsert(Schedule schedule);
	List<Schedule> scheduleList();
}


