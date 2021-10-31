package easyway.model.notice;

public class Employee {
	private int employee_id;
	private int office_id;
	private int member_id;
	private int department_id;
	private int position_id;
	private String employee_name;
	private String employee_call;
	private String employee_phone;
	private String employee_hiredate;
	private String employee_work_type;
	private String employee_birth;
	private String employee_master;
	private int employee_left_day;
	
	
	public Employee() {}
	
	public Employee(int employee_id, int office_id, int member_id, int department_id, int position_id,
			String employee_name, String employee_call, String employee_phone, String employee_hiredate,
			String employee_work_type, String employee_birth, String employee_master, int employee_left_day) {
		super();
		this.employee_id = employee_id;
		this.office_id = office_id;
		this.member_id = member_id;
		this.department_id = department_id;
		this.position_id = position_id;
		this.employee_name = employee_name;
		this.employee_call = employee_call;
		this.employee_phone = employee_phone;
		this.employee_hiredate = employee_hiredate;
		this.employee_work_type = employee_work_type;
		this.employee_birth = employee_birth;
		this.employee_master = employee_master;
		this.employee_left_day = employee_left_day;
	}


	public int getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}


	public int getOffice_id() {
		return office_id;
	}


	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}


	public int getMember_id() {
		return member_id;
	}


	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}


	public int getDepartment_id() {
		return department_id;
	}


	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}


	public int getPosition_id() {
		return position_id;
	}


	public void setPosition_id(int position_id) {
		this.position_id = position_id;
	}


	public String getEmployee_name() {
		return employee_name;
	}


	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}


	public String getEmployee_call() {
		return employee_call;
	}


	public void setEmployee_call(String employee_call) {
		this.employee_call = employee_call;
	}


	public String getEmployee_phone() {
		return employee_phone;
	}


	public void setEmployee_phone(String employee_phone) {
		this.employee_phone = employee_phone;
	}


	public String getEmployee_hiredate() {
		return employee_hiredate;
	}


	public void setEmployee_hiredate(String employee_hiredate) {
		this.employee_hiredate = employee_hiredate;
	}


	public String getEmployee_work_type() {
		return employee_work_type;
	}


	public void setEmployee_work_type(String employee_work_type) {
		this.employee_work_type = employee_work_type;
	}


	public String getEmployee_birth() {
		return employee_birth;
	}


	public void setEmployee_birth(String employee_birth) {
		this.employee_birth = employee_birth;
	}


	public String getEmployee_master() {
		return employee_master;
	}


	public void setEmployee_master(String employee_master) {
		this.employee_master = employee_master;
	}


	public int getEmployee_left_day() {
		return employee_left_day;
	}


	public void setEmployee_left_day(int employee_left_day) {
		this.employee_left_day = employee_left_day;
	}


	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", office_id=" + office_id + ", member_id=" + member_id
				+ ", department_id=" + department_id + ", position_id=" + position_id + ", employee_name="
				+ employee_name + ", employee_call=" + employee_call + ", employee_phone=" + employee_phone
				+ ", employee_hiredate=" + employee_hiredate + ", employee_work_type=" + employee_work_type
				+ ", employee_birth=" + employee_birth + ", employee_master=" + employee_master + ", employee_left_day="
				+ employee_left_day + "]";
	}
	
	
	
	
}
