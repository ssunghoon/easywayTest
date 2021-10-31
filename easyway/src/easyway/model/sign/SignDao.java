package easyway.model.sign;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import easyway.mapper.SignMapper;

public class SignDao {
	private static SignDao dao = new SignDao();
	
	public static SignDao getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		// mybatis-config.xml => SqlSessionFactory 변환
		String resource = "mybatis-config.xml";
		InputStream in = null;
		
		try {
			in = Resources.getResourceAsStream(resource);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	public int insertSign(Sign sign) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		
		 try {
			 re = sqlSession.getMapper(SignMapper.class).insertSign(sign);
			 if(re>0) {
				 sqlSession.commit();
			 }else {
				 sqlSession.rollback();
			 }
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		 return re;
	}
	
	// 기본기안서 등록
	public int insertSignBasic(BasicSign basic) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		
		 try {
			 re = sqlSession.getMapper(SignMapper.class).insertSignBasic(basic);
			 if(re>0) {
				 sqlSession.commit();
			 }else {
				 sqlSession.rollback();
			 }
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		 return re;
	}
	// 지출결의서 등록
	public int insertSignSpend(SpendSign spend) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		
		 try {
			 re = sqlSession.getMapper(SignMapper.class).insertSignSpend(spend);
			 if(re>0) {
				 sqlSession.commit();
			 }else {
				 sqlSession.rollback();
			 }
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		 return re;
	}
	
	// 휴가 신청서 등록
	public int insertSignVacation(VacationSign vacation) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		
		 try {
			 re = sqlSession.getMapper(SignMapper.class).insertSignVacation(vacation);
			 if(re>0) {
				 sqlSession.commit();
			 }else {
				 sqlSession.rollback();
			 }
		 }catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		 return re;
	}

	public List<Sign> draftListSign(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Sign> list = null;
		try {
			list = sqlSession.getMapper(SignMapper.class).listDraftSign();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;
	}
	
}
