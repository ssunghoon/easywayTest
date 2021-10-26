package easyway.model.schedule;

import java.io.InputStream;

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
		System.out.println("scheduleInsert실행");//확인코드
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re =-1;
		
		try {
			re = sqlSession.getMapper(ScheduleMapper.class).scheduleInsert(schedule);
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
	
}
