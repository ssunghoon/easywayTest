package easyway.mapper;

import java.util.List;

import easyway.model.office.Office;

public interface OfficeMapper {
	
	int insertOffice(Office office);
	List<Office> listOffice();
	Office detailOffice(int seq);
	int deleteOffice(int seq);	

}
