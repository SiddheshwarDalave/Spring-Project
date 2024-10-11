package com.example.simpleproject.Models;

public class Project {
    private String projectId;

    private String projectName;

    private String area;

    private Developer developer;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer developer) {
        this.developer = developer;
    }

    public Project(String projectId, String projectName, String area, Developer developer) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.area = area;
        this.developer = developer;
    }

    public Project(String projectId, String projectName, String area) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.area = area;
    }

    public Project() {
    }
}
