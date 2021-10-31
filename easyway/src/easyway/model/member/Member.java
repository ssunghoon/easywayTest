package easyway.model.member;

import java.io.Serializable;

public class Member implements Serializable{
	
	private int member_id;
	private String member_email;
	private String member_pw;
	private String member_name;
	
	public Member() {}

	public Member(int member_id, String member_email, String member_pw, String member_name) {
		super();
		this.member_id = member_id;
		this.member_email = member_email;
		this.member_pw = member_pw;
		this.member_name = member_name;
	}

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getMember_email() {
		return member_email;
	}

	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}

	public String getMember_pw() {
		return member_pw;
	}

	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	
}
