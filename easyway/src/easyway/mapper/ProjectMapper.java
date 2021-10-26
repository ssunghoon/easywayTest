package easyway.mapper;

import java.util.List;

import easyway.model.Project;

public interface ProjectMapper {
	int insertProject(Project project);
	List<Project> listProject();
;}
