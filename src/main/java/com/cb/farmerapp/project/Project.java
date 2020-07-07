package com.cb.farmerapp.project;

import com.cb.farmerapp.farmer.model.Farmer;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "project", indexes = {@Index(name = "indx_farmers", columnList = "msisdn", unique = true)})
@ToString
@Access(AccessType.FIELD)
@Getter
@Setter
public class Project {

  @Id
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
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  private Farmer farmer;

}
