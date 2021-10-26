package easyway.mapper;

import easyway.model.attendance.Attendance;

public interface AttendanceMapper {
	
	int attendanceInsert(Attendance attendance);
	int attendanceOutUpdate(Attendance attendance);
	int AttendanceEndUpdate(Attendance attendance);
	
}
