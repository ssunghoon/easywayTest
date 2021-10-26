package easyway.model.office;

import java.io.Serializable;

public class OfficeCreate implements Serializable{
	
	private int oc_id;
	private int member_id;
	private int office_id;
	
	public OfficeCreate() {}

	public OfficeCreate(int oc_id, int member_id, int office_id) {
		super();
		this.oc_id = oc_id;
		this.member_id = member_id;
		this.office_id = office_id;
	}

	public int getOc_id() {
		return oc_id;
	}

	public void setOc_id(int oc_id) {
		this.oc_id = oc_id;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public int getOffice_id() {
		return office_id;
	}

	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}
	
	

}
