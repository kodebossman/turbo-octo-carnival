package com.cb.farmerapp.model.Projecttemplate;

import java.util.Date;

public class Projecttemplate {
    private String ProjectObjective;
    private Date ProjectDatestarted;
    private int ProjectBudgetedResources;
    private String ProjectCustomer;

    public Projecttemplate(String projectObjective, Date projectDatestarted, int projectBudgetedResources, String projectCustomer) {
        ProjectObjective = projectObjective;
        ProjectDatestarted =projectDatestarted;
        ProjectBudgetedResources = projectBudgetedResources;
        ProjectCustomer = projectCustomer;
    }

    public String getProjectObjective() {
        return ProjectObjective;
    }

    public void setProjectObjective(String projectObjective) {
        ProjectObjective = projectObjective;
    }

    public Date getProjectDatestarted() {
        return ProjectDatestarted;
    }

    public void setProjectDatestarted(Date projectDatestarted) {
        ProjectDatestarted = projectDatestarted;
    }

    public int getProjectBudgetedResources() {
        return ProjectBudgetedResources;
    }

    public void setProjectBudgetedResources(int projectBudgetedResources) {
        ProjectBudgetedResources = projectBudgetedResources;
    }

    public String getProjectCustomer() {
        return ProjectCustomer;
    }

    public void setProjectCustomer(String projectCustomer) {
        ProjectCustomer = projectCustomer;
    }
}
