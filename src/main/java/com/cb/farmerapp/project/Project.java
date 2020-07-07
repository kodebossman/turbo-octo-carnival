package com.cb.farmerapp.project;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.cb.farmerapp.farmer.model.Farmer;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

 @Entity
 @Service
 @Getter @Setter

public class Project {
  @Id
  @Column(name = "projectId", length = 50, nullable = false,unique = true)
  private Long Id;
   @Column(name = "projectName", length = 50, nullable = false)
  private String projectName;
   @Column(name = "projectDescription", length = 50, nullable = false)
  private String description;
   @Column(name = "projectBudget", length = 50, nullable = false)
  private Double projectBudget;
   @Column(name = "projectStartDate", length = 50, nullable = false)
  private LocalDate startDate;
   @Column(name = "projectOwner", length = 50, nullable = false)
  private String Owner;
   @Column(name = "projectManager", length = 50, nullable = false)
  private String projectManager;
   @Column(name = "projectLocation", length = 50, nullable = false)
  private String projectLocation;
   @Column(name = "projectSponsor", length = 50, nullable = false)
  private String sponsor;
   @Column(name = "projectFarmer", length = 50, nullable = false)
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

}
