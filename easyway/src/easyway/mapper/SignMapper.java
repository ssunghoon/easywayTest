package easyway.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import easyway.model.sign.Search;
import easyway.model.sign.Sign;
import easyway.model.sign.BasicSign;

public interface SignMapper {
	int insertSignBasic(BasicSign basic);
	
	List<Sign> listDraftSign(Search search, RowBounds rows);

	int countDraft(Search search);
	
}
