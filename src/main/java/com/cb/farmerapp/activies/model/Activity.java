package com.cb.farmerapp.activies.model;
import com.cb.farmerapp.project.Project;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "activity", indexes = {@Index(name = "indx_farmers", columnList = "msisdn", unique = true)})
@ToString
@Access(AccessType.FIELD)
@Getter
@Setter
public class Activity {


  @javax.persistence.Id
  private Long Id;
  @Column(name = "activity_desc", length = 1000, nullable = false)
  private String activityDesc;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Column(name = "start_date")
  @Temporal(value = TemporalType.TIMESTAMP)
  private LocalDate startDate;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @Column(name = "est_end_date")
  @Temporal(value = TemporalType.TIMESTAMP)
  private LocalDate estEndDate;
  @Column(name = "activity_type", length = 60, nullable = false)
  private String activityType;
  @Column(name = "category", length = 60, nullable = false)
  private ActivityCategories category;
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  private Project project;
}
