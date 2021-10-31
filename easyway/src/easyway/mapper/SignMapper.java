package easyway.mapper;

import java.util.List;

import easyway.model.sign.Sign;
import easyway.model.sign.SpendSign;
import easyway.model.sign.VacationSign;
import easyway.model.sign.BasicSign;

public interface SignMapper {
	int insertSign(Sign sign);
	// 기본 기안서 등록
	int insertSignBasic(BasicSign basic);
	// 지출 결의서 등록
	int insertSignSpend(SpendSign spend);
	// 휴가 신청서 등록
	int insertSignVacation(VacationSign vacation);
	
	// 기안함 목록
	List<Sign> listDraftSign();

}
