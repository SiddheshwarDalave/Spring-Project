package com.example.simpleproject.Controller;

import com.example.simpleproject.Models.Developer;
import com.example.simpleproject.Models.Project;
import com.example.simpleproject.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @PostMapping ("/project/create")
    public Project createProject(@RequestBody Project project){
        return projectService.createProject(project);
    }
    @PatchMapping("/project/mapwithdev/{DevId}/{ProjId}")
    public Project mapWithDeveloper(@PathVariable String DevId, @PathVariable String ProjId){
        return projectService.mapWithDeveloper(DevId,ProjId);
    }
    @GetMapping("/project/getprojects")
    public List<Project> getAllProjects(){
        return projectService.getAllProjects();
    }
    @GetMapping("/project/getmap")
    public Map<Developer,Project> getAllMapping(){
        return projectService.getAllMapping();
    }
}
