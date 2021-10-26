package easyway.model.attendance;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import easyway.mapper.AttendanceMapper;

public class AttendanceDao {
	private static AttendanceDao dao = new AttendanceDao();
	public static AttendanceDao getInstance() {
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
	
	public int attendanceInsert(Attendance attendance) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re =-1;
		
		try {
			re = sqlSession.getMapper(AttendanceMapper.class).attendanceInsert(attendance);
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
	
	public int attendanceOutUpdate(Attendance attendance) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re =-1;
		
		try {
			re = sqlSession.getMapper(AttendanceMapper.class).attendanceOutUpdate(attendance);
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
	
	public int attendanceEndUpdate(Attendance attendance) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re =-1;
		
		try {
			re = sqlSession.getMapper(AttendanceMapper.class).attendanceEndUpdate(attendance);
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
	
	public Attendance attendanceToday(int employee_id){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		Attendance attendance = null;
		
		try {
			attendance = sqlSession.getMapper(AttendanceMapper.class).attendanceToday(employee_id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession. close();
			}
		}
		
		return attendance;
	}
	
}
