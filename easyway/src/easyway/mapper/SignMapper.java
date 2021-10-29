package easyway.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import easyway.model.sign.Search;
import easyway.model.sign.Sign;
import easyway.model.sign.SpendSign;
import easyway.model.sign.VacationSign;
import easyway.model.sign.BasicSign;

public interface SignMapper {
	// 기본 기안서 등록
	int insertSignBasic(BasicSign basic);
	// 지출 결의서 등록
	int insertSignSpend(SpendSign spend);
	// 휴가 신청서 등록
	int insertSignVacation(VacationSign vacation);
	
	List<Sign> listDraftSign(Search search, RowBounds rows);

	int countDraft(Search search);
	
}
