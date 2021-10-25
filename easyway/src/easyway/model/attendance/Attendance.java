package easyway.model.attendance;

import java.io.Serializable;

public class Attendance implements Serializable{
	private int attendance_id;
	private int employee_id;
	private String attendance_start;
	private String attendance_end;
	private String attendance_out;
	
	public Attendance() {}

	public Attendance(int attendance_id, int employee_id, String attendance_start, String attendance_end,
			String attendance_out) {
		super();
		this.attendance_id = attendance_id;
		this.employee_id = employee_id;
		this.attendance_start = attendance_start;
		this.attendance_end = attendance_end;
		this.attendance_out = attendance_out;
	}

	public int getAttendance_id() {
		return attendance_id;
	}

	public void setAttendance_id(int attendance_id) {
		this.attendance_id = attendance_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getAttendance_start() {
		return attendance_start;
	}

	public void setAttendance_start(String attendance_start) {
		this.attendance_start = attendance_start;
	}

	public String getAttendance_end() {
		return attendance_end;
	}

	public void setAttendance_end(String attendance_end) {
		this.attendance_end = attendance_end;
	}

	public String getAttendance_out() {
		return attendance_out;
	}

	public void setAttendance_out(String attendance_out) {
		this.attendance_out = attendance_out;
	}
	
}
