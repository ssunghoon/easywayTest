package easyway.mapper;

import easyway.model.attendance.Attendance;

public interface AttendanceMapper {
	
	int attendanceInsert(Attendance attendance);
	int attendanceOutUpdate(Attendance attendance);
	int attendanceEndUpdate(Attendance attendance);
	Attendance attendanceToday(int employee_id);
	
}
