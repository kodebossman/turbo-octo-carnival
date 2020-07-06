package com.cb.farmerapp.template;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ProjectTemplate {
  private String ProjectObjective;
  private Date ProjectDatestarted;
  private int ProjectBudgetedResources;
  private String ProjectCustomer;
}
