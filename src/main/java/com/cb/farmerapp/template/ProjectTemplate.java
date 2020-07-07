package com.cb.farmerapp.template;

import com.cb.farmerapp.input.model.FarmerInput;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "project", indexes = {@Index(name = "indx_farmers", columnList = "msisdn", unique = true)})
@ToString
@Access(AccessType.FIELD)
@Getter
@Setter
public class ProjectTemplate {

  @javax.persistence.Id
  private Long Id;
  @Column(name = "template_name", length = 50, nullable = false)
  private String templateName;
  @Column(name = "template_desc", length = 50, nullable = false)
  private String templateDesc;
  @Column(name = "template-standard", length = 50, nullable = false)
  private String standard;
  @Column(name = "total_per_standard", length = 50, nullable = false)
  private Double totalPerStandard;
  @Column(name = "basic_requirements", length = 50, nullable = false)
  private String basicRequirements;
  @Column(name = "season", length = 50, nullable = false)
  private String season;
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  private FarmerInput farmerInput;


}
