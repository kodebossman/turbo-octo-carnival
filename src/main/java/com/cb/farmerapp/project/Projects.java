package com.cb.farmerapp.project;

public class Projects {
    public Projects(String projectName,Double projectBudget){
        this.projectName = projectName;
        this.projectBudget = projectBudget;

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Double getProjectBudget() {
        return projectBudget;
    }

    public void setProjectBudget(Double projectBudget) {
        this.projectBudget = projectBudget;
    }

    private String projectName;
    private Double projectBudget;
}
