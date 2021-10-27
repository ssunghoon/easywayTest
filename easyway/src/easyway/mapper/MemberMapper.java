package easyway.mapper;

import java.util.List;

import easyway.model.member.Member;


public interface MemberMapper {
	
	int insertMember(Member member);
	Member loginMember(String email, String password);
//	List<Office> listOffice();
//	Office detailOffice(int seq);
//	int deleteOffice(int seq);	

}
