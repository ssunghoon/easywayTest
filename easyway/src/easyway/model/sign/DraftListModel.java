package easyway.model.sign;

import java.util.List;

public class DraftListModel {
	// 기안함 목록
	private List<Sign> list;
	
	public DraftListModel() {}

	public DraftListModel(List<Sign> list) {
		super();
		this.list = list;
		
	}

	public List<Sign> getList() {
		return list;
	}

	public void setList(List<Sign> list) {
		this.list = list;
	}

}
