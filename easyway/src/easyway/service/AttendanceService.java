package easyway.service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import easyway.model.attendance.Attendance;
import easyway.model.attendance.AttendanceDao;

public class AttendanceService {
	private static AttendanceService service = new AttendanceService();
	private static AttendanceDao dao;
	
	public static AttendanceService getInstance() {
		dao = AttendanceDao.getInstance();
		return service;
	}
	
	public int attendanceInsertService() throws Exception{
		Attendance attendance = new Attendance();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");

        attendance.setAttendance_start(sdf.format(timestamp));
        attendance.setAttendance_out("");
        attendance.setAttendance_end("");
        System.out.println(attendance.getAttendance_start());

		return dao.attendanceInsert(attendance);
	}
	
	public int attendanceOutUpdateService() throws Exception{
		Attendance attendance = new Attendance();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
        
        attendance.setAttendance_start("");
        attendance.setAttendance_out(sdf.format(timestamp));
        attendance.setAttendance_end("");
        
        System.out.println(attendance.getAttendance_start());
        System.out.println(attendance.getAttendance_out());
        System.out.println(attendance.getAttendance_end());
		
		return dao.attendanceOutUpdate(attendance);
	}
	
	public int AttendanceEndUpdateService() throws Exception{
		Attendance attendance = new Attendance();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");

        attendance.setAttendance_start("");
        attendance.setAttendance_out("");
        attendance.setAttendance_end(sdf.format(timestamp));
		
		return dao.AttendanceEndUpdate(attendance);
	}
}
