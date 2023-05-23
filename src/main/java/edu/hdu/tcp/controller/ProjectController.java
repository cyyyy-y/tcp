package edu.hdu.tcp.controller;

import edu.hdu.tcp.model.Project;
import edu.hdu.tcp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/selectAllProjects")
    public List<Project> selectAllProducts() {
        return this.projectService.selectAllProjects ();
    }
}
