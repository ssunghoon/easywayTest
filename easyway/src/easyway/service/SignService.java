package easyway.service;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import easyway.model.sign.DraftListModel;
import easyway.model.sign.Search;
import easyway.model.sign.Sign;
import easyway.model.sign.BasicSign;
import easyway.model.sign.SignDao;

public class SignService {
	private static SignService service = new SignService();
	private static SignDao dao;
	private static final int PAGE_SIZE = 2;
	
	public static SignService getInstance() {
		dao = SignDao.getInstance();
		return service;
	}
	
	// 기본 기안서 등록
	public int insertBasicSignService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("utf-8");
				
		BasicSign basic = new BasicSign();
		
		basic.setSb_title(request.getParameter("sb_title"));
		basic.setSb_content(request.getParameter("sb_content"));
		basic.setSb_importance(request.getParameter("sb_importance"));
		basic.setSb_range(request.getParameter("sb_range"));
		basic.setSb_start(request.getParameter("sb_start"));
		basic.setSb_end(request.getParameter("sb_end"));
		
		return dao.insertSignBasic(basic);
	}
	
	// 기안함 목록
	public DraftListModel listDraftService(HttpServletRequest request) {
		Search search = new Search();
		HttpSession session = request.getSession();
		
		
		// 세션에 검색 정보가 있는 경우
		if(session.getAttribute("search") != null) {
			search = (Search)session.getAttribute("search");
		}
		
		// 페이징 처리시 필요사항
		// 페이지당 글 갯수, 총 글 갯수, 현재페이지
		// startPage, endPage, startRow, endRow
		
		// 총 글 갯수
		int totalCount = dao.countDraft(search);
		
		// 총 페이지수
		int totalPageCount = totalCount/PAGE_SIZE;
		if(totalCount%PAGE_SIZE > 0) {
			totalPageCount++;
		}
		// 현재 페이지
		String pageNum = request.getParameter("pageNum");
		if(pageNum == null) {
			pageNum = "1";
		}
		int requestPage = Integer.parseInt(pageNum);
		
		// startPage = 현재페이지 - (현재페이지 - 1)%5
		int startPage = requestPage - (requestPage - 1) % 5;
		
		// endPage
		int endPage = startPage + 4;
		if(endPage > totalPageCount) {
			endPage = totalPageCount;
		}
		
		// startRow = (현재페이지 - 1) * 페이지당 글 갯수
		int startRow = (requestPage - 1) * PAGE_SIZE;
		
		List<Sign> draftList = dao.draftListSign(startRow, search);
		
		DraftListModel draftistModel = 
			new DraftListModel(draftList,totalPageCount, startPage, endPage);
			
		return draftistModel;

	}
}
