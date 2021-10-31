package easyway.model.schedule;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import easyway.mapper.AttendanceMapper;
import easyway.mapper.ScheduleMapper;
import easyway.model.attendance.Attendance;

public class ScheduleDao {
	private static ScheduleDao dao = new ScheduleDao();
	public static ScheduleDao getInstance() {
		return dao;
	}
	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public int scheduleInsert(Schedule schedule) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re =-1;
		
		try {
			re = sqlSession.getMapper(ScheduleMapper.class).scheduleInsert(schedule);//xml과이름동일!!
			System.out.println(re);
			if(re>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
			System.out.println(re);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession. close();
			}
		}
		return re;
	}
	
	public List<Schedule> scheduleList() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Schedule> list = null;
		
		try {
			list = sqlSession.getMapper(ScheduleMapper.class).scheduleList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession. close();
			}
		}
		return list;
		
	}
}
