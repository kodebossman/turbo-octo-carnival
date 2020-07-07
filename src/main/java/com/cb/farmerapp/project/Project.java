package com.cb.farmerapp.project;
import javax.persistence.*;
import com.cb.farmerapp.farmer.model.Farmer;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import java.time.LocalDate;

 @Entity
 @Getter @Setter
 @Table(name = "project")
 @AllArgsConstructor
public class Project {
  @Id
  @Column(name = "projectId", length = 5, nullable = false,unique = true)
  private Long Id;
   @Column(name = "projectName", length = 50, nullable = false)
  private String projectName;
   @Column(name = "projectDescription", length = 200, nullable = false)
  private String description;
   @Column(name = "projectBudget", length = 5, nullable = false)
  private Double projectBudget;
   @Temporal(value = TemporalType.TIMESTAMP)
   @JsonFormat(pattern = "MM/dd/yyyy")
   @Column(name = "projectStartDate", nullable = false)
  private LocalDate startDate;
   @Column(name = "projectOwner", length = 100, nullable = false)
  private String Owner;
   @Column(name = "projectManager", length = 50, nullable = false)
  private String projectManager;
   @Column(name = "projectLocation", length = 50, nullable = false)
  private String projectLocation;
   @Column(name = "projectSponsor", length = 50, nullable = false)
  private String sponsor;
   @Column(name = "projectFarmer", length = 50, nullable = false)
  private Farmer farmer;

}
