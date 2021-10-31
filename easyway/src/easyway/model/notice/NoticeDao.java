package easyway.model.notice;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import easyway.mapper.NoticeMapper;

public class NoticeDao {
	private static NoticeDao dao = new NoticeDao();

	public static NoticeDao getIntstance() {
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

	//���⼭ re�� db�� �����Ͱ� �� ������ Ȯ�����ش�
	//����� ������ ���� �ȵ��� ����
	public int noticeInsert(Notice notice) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;

		try {
			re = sqlSession.getMapper(NoticeMapper.class).noticeInsert(notice);
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

	public List<Notice> noticeList() {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Notice> list = null;
		try {
			list = sqlSession.getMapper(NoticeMapper.class).noticeList();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
		return list; 

	}

	/*
	 * public Notice detailNotice(int ob_id) { SqlSession sqlSession =
	 * getSqlSessionFactory().openSession(); Notice notice = null; try { notice =
	 * sqlSession.getMapper(NoticeMapper.class).detailNotice(ob_id); } catch
	 * (Exception e) { e.printStackTrace(); } finally { if (sqlSession != null) {
	 * sqlSession.close(); } } return notice; }
	 * 
	 * public int updateNotice(Notice notice) { SqlSession sqlSession =
	 * getSqlSessionFactory().openSession(); int re = -1; try { re =
	 * sqlSession.getMapper(NoticeMapper.class).updateNotice(notice); if (re > 0) {
	 * sqlSession.commit(); } else { sqlSession.rollback(); } } catch (Exception e)
	 * { e.printStackTrace(); } finally { if (sqlSession != null) {
	 * sqlSession.close(); } } return re; }
	 * 
	 * public int deleteNotice(int ob_id) { SqlSession sqlSession =
	 * getSqlSessionFactory().openSession(); int re = -1; try { re =
	 * sqlSession.getMapper(NoticeMapper.class).deleteNotice(ob_id); if (re > 0) {
	 * sqlSession.commit(); } else { sqlSession.rollback(); } } catch (Exception e)
	 * { e.printStackTrace(); } finally { if (sqlSession != null) {
	 * sqlSession.close(); } } return re; }
	 * 
	 * public int countNotice(Search search) { SqlSession sqlSession =
	 * getSqlSessionFactory().openSession(); int re = 0; try { re =
	 * sqlSession.getMapper(NoticeMapper.class).countNotice(search); } catch
	 * (Exception e) { e.printStackTrace(); } finally { if (sqlSession != null) {
	 * sqlSession.close(); } }
	 * 
	 * return re; }
	 */

}
