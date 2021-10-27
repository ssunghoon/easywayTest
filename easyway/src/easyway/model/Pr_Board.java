package easyway.model;

import java.io.Serializable;

public class Pr_Board implements Serializable {
	private int pb_id;
	private String pb_title;
	private String pb_content;
	private String pb_file_path;
	private String pb_date;
	
	public Pr_Board() {}
	
	public Pr_Board(int pb_id, String pb_title, String pb_content, String pb_file_path, String pb_date) {
		super();
		this.pb_id = pb_id;
		this.pb_title = pb_title;
		this.pb_content = pb_content;
		this.pb_file_path = pb_file_path;
		this.pb_date = pb_date;
	}
	
	
}
