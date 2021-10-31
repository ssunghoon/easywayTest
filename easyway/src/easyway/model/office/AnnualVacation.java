package easyway.model.office;

import java.io.Serializable;

public class AnnualVacation implements Serializable{
	
	private int av_id;
	private int av_annual;//몇년차인지
	private int office_id;
	
	public AnnualVacation() {}

	public AnnualVacation(int av_id, int av_annual, int office_id) {
		super();
		this.av_id = av_id;
		this.av_annual = av_annual;
		this.office_id = office_id;
	}

	public int getAv_id() {
		return av_id;
	}

	public void setAv_id(int av_id) {
		this.av_id = av_id;
	}

	public int getAv_annual() {
		return av_annual;
	}

	public void setAv_annual(int av_annual) {
		this.av_annual = av_annual;
	}

	public int getOffice_id() {
		return office_id;
	}

	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}
	
}
