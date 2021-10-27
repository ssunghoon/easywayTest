package easyway.action.office;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.service.OfficeService;


public class OfficeInsertAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		OfficeService service = OfficeService.getInstance();
		
		System.out.println("오피스 인서트 액션 실행");
		//이하 비즈니스 호출 작업
		int result = service.insertOfficeService(request);
		result = -1;
		request.setAttribute("insertResult", result);
		
		//페이지 이동 (listAction.do) = .do에서 .do로 이동 = 새로운 요청
		//list.jsp로 바로 이동해서 list.jsp가 모든 것을 처리하게끔 하지 않을 예정
		
		forward.setRedirect(true);
		forward.setPath("/easyway/office/officeListAction.do");
		//listAction.do는 진짜 파일 경로가 아니므로 /listAction.do 이렇게 안 씀ㅜ
		
		return forward;
	}

}
