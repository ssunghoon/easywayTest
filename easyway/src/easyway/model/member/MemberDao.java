package easyway.model.member;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import easyway.mapper.MemberMapper;
import easyway.mapper.OfficeMapper;


public class MemberDao {

	private static MemberDao dao = new MemberDao();

	public static MemberDao getInstance() {
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

	public int insertMember(Member member) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = sqlSession.getMapper(MemberMapper.class).insertMember(member);
			if (re > 0) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}

		return re;
	}

//	public List<Member> listOffice() {
//		SqlSession sqlSession = getSqlSessionFactory().openSession();
//		List<Member> list = null;
//
//		try {
//			list = sqlSession.getMapper(OfficeMapper.class).listOffice();
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (sqlSession != null) {
//				sqlSession.close();
//			}
//		}
//
//		return list;
//	}

//	public Member detailOffice(int seq) {
//		SqlSession sqlSession = getSqlSessionFactory().openSession();
//		Member office = null;
//
//		try {
//			office = sqlSession.getMapper(OfficeMapper.class).detailOffice(seq);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (sqlSession != null) {
//				sqlSession.close();
//			}
//		}
//
//		return office;
//	}

	public int deleteOffice(int seq) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = sqlSession.getMapper(OfficeMapper.class).deleteOffice(seq);
			if (re > 0) {
				sqlSession.commit();
			} else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}

		return re;
	}
}
