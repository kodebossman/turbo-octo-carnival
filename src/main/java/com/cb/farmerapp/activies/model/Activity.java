package com.cb.farmerapp.activies.model;

import com.cb.farmerapp.project.Project;

import java.time.LocalDate;
import java.time.Period;

public class Activity {

  private Long Id;
  private String activityDesc;
  private Period duration;
  private LocalDate startDate;
  private LocalDate estEndDate;
  private Project project;
  private String activityType;
  private ActivityCategories category;

}
