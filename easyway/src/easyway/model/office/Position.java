package easyway.model.office;

import java.io.Serializable;

public class Position implements Serializable{
	
	private int position_id;
	private String position_name;
	private int office_id;
	
	public Position() {}

	public Position(int position_id, String position_name, int office_id) {
		super();
		this.position_id = position_id;
		this.position_name = position_name;
		this.office_id = office_id;
	}

	public int getPosition_id() {
		return position_id;
	}

	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}

	public String getPosition_name() {
		return position_name;
	}

	public void setPosition_name(String position_name) {
		this.position_name = position_name;
	}

	public int getOffice_id() {
		return office_id;
	}

	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}

}
