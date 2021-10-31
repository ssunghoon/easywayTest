package easyway.mapper;

import java.util.List;

import easyway.model.office.Office;
import easyway.model.office.OfficeCreate;

public interface OfficeMapper {
	
	int insertOffice(Office office);
	int insertOfficeCreate(OfficeCreate oc);
	List<Office> listOffice(int member_id);
	Office detailOffice(int seq);
	int deleteOffice(int seq);	

}
