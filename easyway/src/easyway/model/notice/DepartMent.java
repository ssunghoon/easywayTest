package easyway.model.notice;

public class DepartMent {
	private int department_id;
	private int office_id;
	private String department_name;
	
	public DepartMent() {}

	public DepartMent(int department_id, int office_id, String department_name) {
		super();
		this.department_id = department_id;
		this.office_id = office_id;
		this.department_name = department_name;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public int getOffice_id() {
		return office_id;
	}

	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	@Override
	public String toString() {
		return "DepartMent [department_id=" + department_id + ", office_id=" + office_id + ", department_name="
				+ department_name + "]";
	}
	
	
	
	
}
