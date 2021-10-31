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
		/*// ���� ���ε� �� ���� �̸� DB ����
			if (multi.getFilesystemName("ob_file_path") != null) {
				String ob_file_path = (String) multi.getFilesystemName("ob_file_path");
				notice.setOb_file_path(ob_file_path);

				// �������̹���(gif,jpg,png) nn.jpg > nn_small.jpg
				// Ȯ���� �̾Ƴ���
				String pattern = ob_file_path.substring(ob_file_path.indexOf(".")+1);// gif/jpg
				String head = ob_file_path.substring(0,ob_file_path.indexOf(".")); //���� �̸� nn
				
				//���� ���� ��ü
				String imagePath = uploadPath + "\\" + ob_file_path;
				File src = new File(imagePath);
				
				//������ ���� ��ü
				String thumPath = uploadPath + "\\" + head + "_small." + pattern;
				File dest = new File(thumPath);
				
				System.out.println("insertservice");
				//�������� �޼��忡 �Ķ���� �� �ֱ�
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