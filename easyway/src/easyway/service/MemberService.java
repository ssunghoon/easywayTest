package easyway.service;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.ListModel;

import easyway.model.member.Member;
import easyway.model.member.MemberDao;
import easyway.model.office.OfficeDao;


public class MemberService {
	private static MemberService service = new MemberService();
	private static MemberDao dao;

	public static MemberService getInstance() {
		dao = MemberDao.getInstance();
		return service;
	}

	public int insertMemberService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		System.out.println("인서트 실행");
		
		Member member = new Member();
		member.setMember_email(request.getParameter("member_email"));
		member.setMember_name(request.getParameter("member_name"));
		member.setMember_pw(request.getParameter("member_pw"));

		return dao.insertMember(member);

	}
	
	public Member loginMemberService(HttpServletRequest request) throws Exception {
		request.setCharacterEncoding("utf-8");
		
		System.out.println("로그인 실행");
		String email = request.getParameter("member_email");
		String password = request.getParameter("member_pw");

		return dao.loginMember(email, password);

	}

//	public List<Member> listOfficeService(HttpServletRequest request) throws Exception {
//
//		request.setCharacterEncoding("utf-8");
//
//		List<Member> list = dao.listOffice();
//
//		return list;
//	}
//
//	public Member detailOfficeService(int seq) throws Exception {
//		return dao.detailOffice(seq);
//	}
//
//	public int deleteOfficeService(int seq) throws Exception {
//		return dao.deleteOffice(seq);
//	}
}
