package edu.hdu.tcp.service;

import edu.hdu.tcp.mapper.ProjectMapper;
import edu.hdu.tcp.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectMapper projectMapper;

//    查询所有项目
    public List<Project> selectAllProjects() {
        List<Project> projectList = this.projectMapper.selectAllProjects();
        return projectList;
    }

//    添加项目
    public void insertProjects(Project project) {
        this.projectMapper.insertProjects(project);
    }

//    修改项目
    public void updateProject(Project project) {
        this.projectMapper.updateProject (project);
    }

//    删除项目
    public void deleteProject( int id) {
        this.projectMapper.deleteProject ( id );
    }
}

