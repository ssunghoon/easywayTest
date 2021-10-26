package easyway.action.office;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.ListModel;

import easyway.action.Action;
import easyway.action.ActionForward;
import easyway.model.office.Office;
import easyway.service.OfficeService;

public class OfficeListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		OfficeService service = OfficeService.getInstance();
		
		List<Office> listOffice = service.listOfficeService(request);
		
		request.setAttribute("listOffice", listOffice);
		// 받아온 데이터 저장
		
		forward.setRedirect(false);
		// .do에서 .do로 갈 때는 redirect
		// .do에서 .jsp로 갈 때는 dispatcher
		// redirect로 하면 list가 사라짐
		forward.setPath("/offices/office_main.jsp");
		return forward;
	}

}
