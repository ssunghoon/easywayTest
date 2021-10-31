package easyway.model.sign;

import java.io.Serializable;
import java.sql.Date;

public class Sign implements Serializable{
	private int sign_id;
	private int sf_id;
	private int employee_id;
	private Date sign_date;
	private String sign_file_path;
	private String sign_save;
	private int seq;
	private String title;
	private String content;
	
	public Sign () {}

	public Sign(int sign_id, int sf_id, int employee_id, Date sign_date, String sign_file_path, String sign_save,
			int seq, String title, String content) {
		super();
		this.sign_id = sign_id;
		this.sf_id = sf_id;
		this.employee_id = employee_id;
		this.sign_date = sign_date;
		this.sign_file_path = sign_file_path;
		this.sign_save = sign_save;
		this.seq = seq;
		this.title = title;
		this.content = content;
	}

	public int getSign_id() {
		return sign_id;
	}

	public void setSign_id(int sign_id) {
		this.sign_id = sign_id;
	}

	public int getSf_id() {
		return sf_id;
	}

	public void setSf_id(int sf_id) {
		this.sf_id = sf_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public Date getSign_date() {
		return sign_date;
	}

	public void setSign_date(Date sign_date) {
		this.sign_date = sign_date;
	}

	public String getSign_file_path() {
		return sign_file_path;
	}

	public void setSign_file_path(String sign_file_path) {
		this.sign_file_path = sign_file_path;
	}

	public String getSign_save() {
		return sign_save;
	}

	public void setSign_save(String sign_save) {
		this.sign_save = sign_save;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	
}
