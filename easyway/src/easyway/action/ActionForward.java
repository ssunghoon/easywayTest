package easyway.action;

public class ActionForward {

	// 경로, 이동방식을 결정
	private boolean isRedirect; // false -> Dispatcher
	private String path;
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	

}
