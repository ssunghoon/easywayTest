package easyway.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import easyway.model.Project;
import easyway.model.ProjectDao;

public class ProjectService {
	private static ProjectService service = new ProjectService();
	private static ProjectDao dao;
	
	public static ProjectService getInstance() {
		dao = ProjectDao.getInstance();
		return service;
	}
	
	public int insertProjectService(HttpServletRequest request)throws Exception {
		request.setCharacterEncoding("utf-8");
		
		Project project = new Project();
		project.setProject_name(request.getParameter("project_name"));
		project.setProject_start(request.getParameter("project_start"));
		project.setProject_end(request.getParameter("project_end"));
		project.setProject_content(request.getParameter("project_content"));
		
		return dao.insertProject(project);
	}
	
	public List<Project> listProjectService(HttpServletRequest request)throws Exception {
		return dao.listProject();
	}
	
}
