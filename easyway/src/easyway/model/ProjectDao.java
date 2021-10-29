package easyway.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import easyway.mapper.ProjectMapper;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;

public class ProjectDao {
	private static ProjectDao dao = new ProjectDao();
	
	public static ProjectDao getInstance() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		//mybatis-config.xml => SqlSessionFactory 변환
		String resource ="mybatis-config.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public int insertProject(Project project) {
		SqlSession sqlSession = getSqlSessionFactory().openSession(); //String resource ="mybatis-config.xml"; 불러온것
		int re = -1;
		
		try {
			//re = sqlSession.insert("kosta.mapper.BoardMapper.insertBoard", board); //namespace+id명
			re = sqlSession.getMapper(ProjectMapper.class).insertProject(project); //네임스페이스를 안써줘도되는 다른 장점이 있음
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
				sqlSession.close();
			}
		}
		return re;
	}
	
	public List<Project> listProject(){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Project> list = null;
		
		try {
			//list = sqlSession.selectList("kosta.mapper.BoardMapper.listBoard");
			list = sqlSession.getMapper(ProjectMapper.class).listProject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;
	}
	
	public List<Pb_Menu> listPb_Menu(int project_id){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Pb_Menu> list = null;
		
		try {
			list = sqlSession.getMapper(ProjectMapper.class).listPb_Menu(project_id);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		return list;
	}
	
	
}
