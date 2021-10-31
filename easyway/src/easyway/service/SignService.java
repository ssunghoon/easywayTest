package easyway.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import easyway.model.sign.Sign;
import easyway.model.sign.BasicSign;
import easyway.model.sign.SignDao;
import easyway.model.sign.SpendSign;
import easyway.model.sign.VacationSign;

public class SignService {
	private static SignService service = new SignService();
	private static SignDao dao;
	
	
	public static SignService getInstance() {
		dao = SignDao.getInstance();
		return service;
	}
	public int insertSignService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("utf-8");
		
		Sign sign = new Sign();
		sign.setSf_id(Integer.parseInt(request.getParameter("sf_id")));
		
		return dao.insertSign(sign);
	}
	
	// 기본 기안서 등록
	public int insertBasicSignService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("utf-8");
				
		BasicSign basic = new BasicSign();
		basic.setSb_range(request.getParameter("sb_range"));
		basic.setSb_start(request.getParameter("sb_start"));
		basic.setSb_end(request.getParameter("sb_end"));
		basic.setSb_importance(request.getParameter("sb_importance"));
		basic.setSb_title(request.getParameter("sb_title"));
		basic.setSb_content(request.getParameter("sb_content"));
		
		return dao.insertSignBasic(basic);
	}
	
	// 지출 결의서 등록 
		public int insertSpendSignService(HttpServletRequest request)throws Exception {
			request.setCharacterEncoding("utf-8");
					
			SpendSign spend = new SpendSign();
			spend.setSs_range(request.getParameter("ss_range"));
			spend.setSs_importance(request.getParameter("ss_importance"));
			spend.setSs_title(request.getParameter("ss_title"));
			spend.setSs_content(request.getParameter("ss_content"));
			
			return dao.insertSignSpend(spend);
		}
	
		// 지출 결의서 등록 
		public int insertVacationSignService(HttpServletRequest request)throws Exception {
			request.setCharacterEncoding("utf-8");
					
			VacationSign vacation = new VacationSign();
			vacation.setSv_title(request.getParameter("sv_title"));
			vacation.setSv_reason(request.getParameter("sv_reason"));
			vacation.setSv_start(request.getParameter("sv_start"));
			vacation.setSv_end(request.getParameter("sv_end"));
			vacation.setSv_type(request.getParameter("sv_type"));
			
			return dao.insertSignVacation(vacation);
		}
			
	// 기안함 목록
	public List<Sign> listDraftService(HttpServletRequest request)throws Exception {
		
		List<Sign> draftList = dao.draftListSign();
		
		return draftList;

	}
}
