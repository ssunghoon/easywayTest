package easyway.model.office;

import java.io.Serializable;

public class Office implements Serializable{
	
	private int office_id;
	private String office_name;
	private String office_code;
	
	public Office() {}

	public int getOffice_id() {
		return office_id;
	}

	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}

	public String getOffice_name() {
		return office_name;
	}

	public void setOffice_name(String office_name) {
		this.office_name = office_name;
	}

	public String getOffice_code() {
		return office_code;
	}

	public void setOffice_code(String office_code) {
		this.office_code = office_code;
	}

	
}
