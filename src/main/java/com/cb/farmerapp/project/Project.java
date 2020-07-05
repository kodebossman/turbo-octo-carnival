package com.cb.farmerapp.project;


import com.cb.farmerapp.farmer.model.Farmer;

import java.time.LocalDate;

public class Project {

  private Long Id;
  private String projectName;
  private String description;
  private Double projectBudget;
  private LocalDate startDate;
  private String Owner;
  private String projectManager;
  private String projectLocation;
  private String sponsor;
  private Farmer farmer;

  public Project(Long id, String projectName, String description, Double projectBudget, LocalDate startDate, String owner,
                 String projectManager, String projectLocation, String sponsor) {
    Id = id;
    this.projectName = projectName;
    this.description = description;
    this.projectBudget = projectBudget;
    this.startDate = startDate;
    Owner = owner;
    this.projectManager = projectManager;
    this.projectLocation = projectLocation;
    this.sponsor = sponsor;
  }

  public Project(String projectName, Double projectBudget) {
    this.projectName = projectName;
    this.projectBudget = projectBudget;

  }

  public Long getId() {
    return Id;
  }

  public void setId(Long id) {
    Id = id;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getProjectBudget() {
    return projectBudget;
  }

  public void setProjectBudget(Double projectBudget) {
    this.projectBudget = projectBudget;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public String getOwner() {
    return Owner;
  }

  public void setOwner(String owner) {
    Owner = owner;
  }

  public String getProjectManager() {
    return projectManager;
  }

  public void setProjectManager(String projectManager) {
    this.projectManager = projectManager;
  }

  public String getProjectLocation() {
    return projectLocation;
  }

  public void setProjectLocation(String projectLocation) {
    this.projectLocation = projectLocation;
  }

  public String getSponsor() {
    return sponsor;
  }

  public void setSponsor(String sponsor) {
    this.sponsor = sponsor;
  }
}
