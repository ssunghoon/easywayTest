package easyway.model.notice;

import java.io.Serializable;

public class Notice implements Serializable {
private int ob_id;
private int obm_id;
private int employee_id;
private String ob_title;
private String ob_type;
private String ob_content;
private String ob_file_path;
private String ob_date;
private int ob_view;

public Notice() {}

public Notice(int ob_id, int obm_id, int employee_id, String ob_title, String ob_type, String ob_content,
		String ob_file_path, String ob_date, int ob_view) {
	super();
	this.ob_id = ob_id;
	this.obm_id = obm_id;
	this.employee_id = employee_id;
	this.ob_title = ob_title;
	this.ob_type = ob_type;
	this.ob_content = ob_content;
	this.ob_file_path = ob_file_path;
	this.ob_date = ob_date;
	this.ob_view = ob_view;
}

public int getOb_id() {
	return ob_id;
}

public void setOb_id(int ob_id) {
	this.ob_id = ob_id;
}

public int getObm_id() {
	return obm_id;
}

public void setObm_id(int obm_id) {
	this.obm_id = obm_id;
}

public int getEmployee_id() {
	return employee_id;
}

public void setEmployee_id(int employee_id) {
	this.employee_id = employee_id;
}

public String getOb_title() {
	return ob_title;
}

public void setOb_title(String ob_title) {
	this.ob_title = ob_title;
}

public String getOb_type() {
	return ob_type;
}

public void setOb_type(String ob_type) {
	this.ob_type = ob_type;
}

public String getOb_content() {
	return ob_content;
}

public void setOb_content(String ob_content) {
	this.ob_content = ob_content;
}

public String getOb_file_path() {
	return ob_file_path;
}

public void setOb_file_path(String ob_file_path) {
	this.ob_file_path = ob_file_path;
}

public String getOb_date() {
	return ob_date;
}

public void setOb_date(String ob_date) {
	this.ob_date = ob_date;
}

public int getOb_view() {
	return ob_view;
}

public void setOb_view(int ob_view) {
	this.ob_view = ob_view;
}

@Override
public String toString() {
	return "Notice [ob_id=" + ob_id + ", obm_id=" + obm_id + ", employee_id=" + employee_id + ", ob_title=" + ob_title
			+ ", ob_type=" + ob_type + ", ob_content=" + ob_content + ", ob_file_path=" + ob_file_path + ", ob_date="
			+ ob_date + ", ob_view=" + ob_view + "]";
}



}
