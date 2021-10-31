package easyway.model.sign;

import java.io.Serializable;

public class VacationSign implements Serializable{
	private int sv_id;
	private int sf_id;
	private String sv_reason;
	private String sv_type;
	private String sv_start;
	private String sv_end;
	private String sv_title;
	
	public VacationSign () {}

	public VacationSign(int sv_id, int sf_id, String sv_reason, String sv_type, String sv_start, String sv_end,
			String sv_title) {
		super();
		this.sv_id = sv_id;
		this.sf_id = sf_id;
		this.sv_reason = sv_reason;
		this.sv_type = sv_type;
		this.sv_start = sv_start;
		this.sv_end = sv_end;
		this.sv_title = sv_title;
	}

	public int getSv_id() {
		return sv_id;
	}

	public void setSv_id(int sv_id) {
		this.sv_id = sv_id;
	}

	public int getSf_id() {
		return sf_id;
	}

	public void setSf_id(int sf_id) {
		this.sf_id = sf_id;
	}

	public String getSv_reason() {
		return sv_reason;
	}

	public void setSv_reason(String sv_reason) {
		this.sv_reason = sv_reason;
	}

	public String getSv_type() {
		return sv_type;
	}

	public void setSv_type(String sv_type) {
		this.sv_type = sv_type;
	}

	public String getSv_start() {
		return sv_start;
	}

	public void setSv_start(String sv_start) {
		this.sv_start = sv_start;
	}

	public String getSv_end() {
		return sv_end;
	}

	public void setSv_end(String sv_end) {
		this.sv_end = sv_end;
	}

	public String getSv_title() {
		return sv_title;
	}

	public void setSv_title(String sv_title) {
		this.sv_title = sv_title;
	};
	
	
}
