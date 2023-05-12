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

    /***查询所有项目*/
    public List<Project> selectAllProjects() {
        return this.projectMapper.selectAllProjects ();
    }

}

