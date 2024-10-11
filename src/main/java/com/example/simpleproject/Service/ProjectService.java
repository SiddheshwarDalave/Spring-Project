package com.example.simpleproject.Service;

import com.example.simpleproject.Models.Developer;
import com.example.simpleproject.Models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class ProjectService {
    @Autowired
    DevService devService;


    List<Project> listOfProjects=new ArrayList<>();
    HashMap<Developer, Project> DeveloperWithProject=new HashMap<>();

    public Project createProject(@RequestBody Project project) {
        if(project.getDeveloper()==null){
            Project newProject=new Project(project.getProjectId(), project.getProjectName(), project.getArea());
            listOfProjects.add(newProject);
            return newProject;
        }else{
            Project newProj= new Project(project.getProjectId(), project.getProjectName(), project.getArea(),project.getDeveloper());
            listOfProjects.add(newProj);
            DeveloperWithProject.put(newProj.getDeveloper(),newProj);
            return newProj;
        }


    }

    public Project mapWithDeveloper(@PathVariable String devId,@PathVariable String projId) {
        Developer newDev= new Developer();
        Project proj=new Project();
        for(Developer dev: devService.listOfDeveloper){
            if(dev.getId().equals(devId)){
                newDev=new Developer(dev.getName(),dev.getAssignment(),dev.getId());
            }
        }

        for(Project project:listOfProjects){
            if(project.getProjectId().equals(projId)){
                int index=listOfProjects.indexOf(project);
                proj=new Project(project.getProjectId(),project.getProjectName(),project.getArea(),newDev);
                listOfProjects.set(index,proj);
            }
        }
        DeveloperWithProject.put(newDev,proj);

        return proj;
    }

    public List<Project> getAllProjects() {
        return listOfProjects;
    }

    public Map<Developer, Project> getAllMapping() {
        return DeveloperWithProject;
    }
}
