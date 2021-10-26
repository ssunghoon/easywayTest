package easyway.model.sign;

import java.sql.Date;

public class BasicSign {
	private int sb_id;
	private int sf_id;
	private String sb_range;
	private String sb_start;
	private String sb_end;
	private String sb_importance;
	private String sb_title;
	private String sb_content;
	
	public BasicSign() {}

	public BasicSign(int sb_id, int sf_id, String sb_range, String sb_start, String sb_end, String sb_importance,
			String sb_title, String sb_content) {
		super();
		this.sb_id = sb_id;
		this.sf_id = sf_id;
		this.sb_range = sb_range;
		this.sb_start = sb_start;
		this.sb_end = sb_end;
		this.sb_importance = sb_importance;
		this.sb_title = sb_title;
		this.sb_content = sb_content;
	}

	public int getSb_id() {
		return sb_id;
	}

	public void setSb_id(int sb_id) {
		this.sb_id = sb_id;
	}

	public int getSf_id() {
		return sf_id;
	}

	public void setSf_id(int sf_id) {
		this.sf_id = sf_id;
	}

	public String getSb_range() {
		return sb_range;
	}

	public void setSb_range(String sb_range) {
		this.sb_range = sb_range;
	}

	public String getSb_start() {
		return sb_start;
	}

	public void setSb_start(String sb_start) {
		this.sb_start = sb_start;
	}

	public String getSb_end() {
		return sb_end;
	}

	public void setSb_end(String sb_end) {
		this.sb_end = sb_end;
	}

	public String getSb_importance() {
		return sb_importance;
	}

	public void setSb_importance(String sb_importance) {
		this.sb_importance = sb_importance;
	}

	public String getSb_title() {
		return sb_title;
	}

	public void setSb_title(String sb_title) {
		this.sb_title = sb_title;
	}

	public String getSb_content() {
		return sb_content;
	}

	public void setSb_content(String sb_content) {
		this.sb_content = sb_content;
	}
	
	
}
