package com.cb.farmerapp.template;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "template")
@Getter
@Setter
@Data
public class ProjectTemplate {
  @Id
  private Long Id;
  @Column (name = "Project_objective",length=50 ,nullable=false)
  private String ProjectObjective;
  @Column (name = "Date_started", length =50, nullable =false)
  private Date Dated_Started;
  @Column (name ="Budgeted_resources",length = 50,nullable=false)
  private int ProjectBudgetedResources;
  @Column (name ="Project_customer", length= 50,nullable= false)
  private String ProjectCustomer;

}
