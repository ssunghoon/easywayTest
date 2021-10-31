package easyway.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import easyway.model.notice.Notice;
import easyway.model.notice.NoticeDao;

public class NoticeService {
	private static NoticeService service = new NoticeService();
	private static NoticeDao dao;
	/* private static final int PAGE_SIZE = 2; */

	public static NoticeService getInstance() {
		dao = NoticeDao.getIntstance();
		return service;
	}

	public int noticeInsertService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
	
		/*
		 * String uploadPath = request.getRealPath("upload"); int size = 20 * 1024 *
		 * 1024; // 20mb
		 * 
		 * MultipartRequest multi = new MultipartRequest(request, uploadPath, size,
		 * "utf-8", new DefaultFileRenamePolicy());
		 */

	Notice notice = new Notice();
	notice.setDepartment_id(Integer.parseInt(request.getParameter("department_id")));
	notice.setEmployee_id(Integer.parseInt(request.getParameter("employee_id")));
	notice.setOb_title(request.getParameter("ob_title"));
	notice.setOb_content(request.getParameter("ob_content"));
	notice.setOb_file_path(request.getParameter("ob_file_path"));
System.out.println(request.getParameter("ob_content"));
		/*// 파일 업로드 시 파일 이름 DB 저장
			if (multi.getFilesystemName("ob_file_path") != null) {
				String ob_file_path = (String) multi.getFilesystemName("ob_file_path");
				notice.setOb_file_path(ob_file_path);

				// 섬네일이미지(gif,jpg,png) nn.jpg > nn_small.jpg
				// 확장자 뽑아내기
				String pattern = ob_file_path.substring(ob_file_path.indexOf(".")+1);// gif/jpg
				String head = ob_file_path.substring(0,ob_file_path.indexOf(".")); //파일 이름 nn
				
				//원본 파일 객체
				String imagePath = uploadPath + "\\" + ob_file_path;
				File src = new File(imagePath);
				
				//섬네일 파일 객체
				String thumPath = uploadPath + "\\" + head + "_small." + pattern;
				File dest = new File(thumPath);
				
				System.out.println("insertservice");
				//리사이즈 메서드에 파라미터 값 넣기
				if(pattern.equals("gif") || pattern.equals("jpg") || pattern.equals("PNG")) {
					ImageUtil.resize(src, dest, 100, ImageUtil.RATIO);
				}
			}*/
					
return dao.noticeInsert(notice);
}

public List<Notice> noticeListService(HttpServletRequest request, HttpServletResponse response)throws Exception{

	List<Notice> list = dao.noticeList();

	return list ;
}

		
	

	/*
	 * public Notice detailNoticeService(int ob_id) throws Exception { return
	 * dao.detailNotice(ob_id); }
	 * 
	 * public int updateNoticeService(Notice notice) throws Exception { return
	 * dao.updateNotice(notice); }
	 */

	/*
	 * public int countNoticeService(int ob_id) throws Exception { return
	 * dao.countNotice(ob_id); }
	 */


/*
 * public Board deleteBoardService(int seq) throws Exception { return
 * dao.deleteBoard(seq); }
 */
}