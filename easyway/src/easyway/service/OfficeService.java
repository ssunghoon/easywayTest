package easyway.service;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import easyway.model.member.Member;
import easyway.model.office.Office;
import easyway.model.office.OfficeDao;


public class OfficeService {
	private static OfficeService service = new OfficeService();
	private static OfficeDao dao;

	public static OfficeService getInstance() {
		dao = OfficeDao.getInstance();
		return service;
	}

	public int insertOfficeService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		System.out.println("인서트 실행");

		Random rnd = new Random();

		StringBuffer officeCode = new StringBuffer();

		for (int i = 0; i < 10; i++) {
			if (rnd.nextBoolean()) {// rnd.nextBoolean() 는 랜덤으로 true, false 를 리턴. true일 시 랜덤 한 소문자를, false 일 시 랜덤 한 숫자를
				officeCode.append((char)((int) (rnd.nextInt(26)) + 97));
			} else {
				officeCode.append((rnd.nextInt(10)));
			}
		}//오피스코드 랜덤으로 숫자+영어 10자
		
		Office office = new Office();
		office.setOffice_code(officeCode.toString());
		office.setOffice_name(request.getParameter("officeName"));

		return dao.insertOffice(office);

	}

	public List<Office> listOfficeService(HttpServletRequest request) throws Exception {

		request.setCharacterEncoding("utf-8");

		HttpSession sesstion = request.getSession();
		Member member = (Member)sesstion.getAttribute("memberInfo");
		
		int member_id = member.getMember_id();

		List<Office> list = dao.listOffice(member_id);

		return list;
	}

	public Office detailOfficeService(int seq) throws Exception {
		return dao.detailOffice(seq);
	}

	public int deleteOfficeService(int seq) throws Exception {
		return dao.deleteOffice(seq);
	}
}
