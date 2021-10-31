package easyway.model;

import java.io.Serializable;

public class Project implements Serializable {
	private int project_id;
	private String project_name;
	private String project_start;
	private String project_end;
	private String project_content;
	
	public Project() {}
	
	public Project(int project_id, String project_name, String project_start, String project_end,
			String project_content) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.project_start = project_start;
		this.project_end = project_end;
		this.project_content = project_content;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public String getProject_start() {
		return project_start;
	}

	public void setProject_start(String project_start) {
		this.project_start = project_start;
	}

	public String getProject_end() {
		return project_end;
	}

	public void setProject_end(String project_end) {
		this.project_end = project_end;
	}

	public String getProject_content() {
		return project_content;
	}

	public void setProject_content(String project_content) {
		this.project_content = project_content;
	}
	
	
}
