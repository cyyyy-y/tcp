package edu.hdu.tcp.controller;

import edu.hdu.tcp.model.Project;
import edu.hdu.tcp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/insertProject", method = RequestMethod.POST)
    public void insertProjects(Project project){
        System.out.println(project);
        this.projectService.insertProjects ( project );
    }

    @RequestMapping(value = "/updateProject", method = RequestMethod.PUT)
    public void updateProject(Project project){
        System.out.println(project);
        this.projectService.updateProject ( project );
    }

    @RequestMapping(value = "/deleteProject/{id}", method = RequestMethod.DELETE)
    public void deleteProject(@PathVariable Integer id){
        this.projectService.deleteProject (id);
    }
}
