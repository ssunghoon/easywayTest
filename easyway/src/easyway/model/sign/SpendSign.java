package easyway.model.sign;

import java.io.Serializable;

public class SpendSign implements Serializable{
	
	private int ss_id;
	private int sf_id;
	private String ss_range;
	private String ss_importance;
	private String ss_title;
	private String ss_content;
	
	public SpendSign () {}

	public SpendSign(int ss_id, int sf_id, String ss_range, String ss_importance, String ss_title, String ss_content) {
		super();
		this.ss_id = ss_id;
		this.sf_id = sf_id;
		this.ss_range = ss_range;
		this.ss_importance = ss_importance;
		this.ss_title = ss_title;
		this.ss_content = ss_content;
	}

	public int getSs_id() {
		return ss_id;
	}

	public void setSs_id(int ss_id) {
		this.ss_id = ss_id;
	}

	public int getSf_id() {
		return sf_id;
	}

	public void setSf_id(int sf_id) {
		this.sf_id = sf_id;
	}

	public String getSs_range() {
		return ss_range;
	}

	public void setSs_range(String ss_range) {
		this.ss_range = ss_range;
	}

	public String getSs_importance() {
		return ss_importance;
	}

	public void setSs_importance(String ss_importance) {
		this.ss_importance = ss_importance;
	}

	public String getSs_title() {
		return ss_title;
	}

	public void setSs_title(String ss_title) {
		this.ss_title = ss_title;
	}

	public String getSs_content() {
		return ss_content;
	}

	public void setSs_content(String ss_content) {
		this.ss_content = ss_content;
	};
	
	

}
