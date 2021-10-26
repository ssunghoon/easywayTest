package easyway.model;

import java.io.Serializable;

public class Pb_Menu implements Serializable {
	private int pbm_id;

	public Pb_Menu(int pbm_id) {
		super();
		this.pbm_id = pbm_id;
	}

	public int getPbm_id() {
		return pbm_id;
	}

	public void setPbm_id(int pbm_id) {
		this.pbm_id = pbm_id;
	}
	
}
