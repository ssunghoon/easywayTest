package easyway.action.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface NoticeAction {
public NoticeActionForward execute(HttpServletRequest request, 
		HttpServletResponse response)throws Exception; 
	
}

