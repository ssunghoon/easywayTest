package easyway.mapper;

import java.util.List;



import easyway.model.notice.Notice;

public interface NoticeMapper {
int noticeInsert(Notice notice);
List<Notice> noticeList();
}
