package easyway.model.sign;

import java.util.List;

public class DraftListModel {
	// 기안함 목록
	private List<Sign> list;
	private int totalPageConut;
	private int startPage;
	private int endPage;
	
	public DraftListModel() {}

	public DraftListModel(List<Sign> list, int totalPageConut, int startPage, int endPage) {
		super();
		this.list = list;
		this.totalPageConut = totalPageConut;
		this.startPage = startPage;
		this.endPage = endPage;
	}

	public List<Sign> getList() {
		return list;
	}

	public void setList(List<Sign> list) {
		this.list = list;
	}

	public int getTotalPageConut() {
		return totalPageConut;
	}

	public void setTotalPageConut(int totalPageConut) {
		this.totalPageConut = totalPageConut;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
	
}
