package easyway.mapper;

import java.util.List;

import easyway.model.Pb_Menu;
import easyway.model.Project;

public interface ProjectMapper {
	int insertProject(Project project);
	List<Project> listProject();
	List<Pb_Menu> listPb_Menu(int project_id);
};
