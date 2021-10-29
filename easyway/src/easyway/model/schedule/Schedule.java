package easyway.model.schedule;

import java.io.Serializable;

public class Schedule implements Serializable {
	private int schedule_id; //DB 컬럼명 이랑 일치
	private int employee_id;
	private String schedule_title;
	private String schedule_start; //DATE
	private String schedule_end; //DATE
	private String schedule_content;
	private String schedule_importance; //중요도 상중하
	private String schedule_private;// 공사구분 0은 회사 1은 부서
	
	public Schedule() {
		super();
	}
	
	public Schedule(int schedule_id, int employee_id, String schedule_title, String schedule_start, String schedule_end,
			String schedule_content, String schedule_importance, String schedule_private) {
		super();
		this.schedule_id = schedule_id;
		this.employee_id = employee_id;
		this.schedule_title = schedule_title;
		this.schedule_start = schedule_start;
		this.schedule_end = schedule_end;
		this.schedule_content = schedule_content;
		this.schedule_importance = schedule_importance;
		this.schedule_private = schedule_private;
	}
	
	public int getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(int schedule_id) {
		this.schedule_id = schedule_id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getSchedule_title() {
		return schedule_title;
	}
	public void setSchedule_title(String schedule_title) {
		this.schedule_title = schedule_title;
	}
	public String getSchedule_start() {
		return schedule_start;
	}
	public void setSchedule_start(String schedule_start) {
		this.schedule_start = schedule_start;
	}
	public String getSchedule_end() {
		return schedule_end;
	}
	public void setSchedule_end(String schedule_end) {
		this.schedule_end = schedule_end;
	}
	public String getSchedule_content() {
		return schedule_content;
	}
	public void setSchedule_content(String schedule_content) {
		this.schedule_content = schedule_content;
	}
	public String getSchedule_importance() {
		return schedule_importance;
	}
	public void setSchedule_importance(String schedule_importance) {
		this.schedule_importance = schedule_importance;
	}
	public String getSchedule_private() {
		return schedule_private;
	}
	public void setSchedule_private(String schedule_private) {
		this.schedule_private = schedule_private;
	}
	
}
