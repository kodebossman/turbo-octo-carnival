package com.cb.farmerapp.farmercategories.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;


@Entity
@Table(name = "farmercategories", indexes = {@Index(name = "indx_farmers", columnList = "msisdn", unique = true)})
@ToString
@Access(AccessType.FIELD)
@Getter
@Setter

public class FarmerCategories {
  @javax.persistence.Id
  private Long Id;
  @Column(name = "input_name", length = 50, nullable = false)
  private String types;
  @Column(name = "season", length = 50, nullable = false)
  private String season;
  @Column(name = "region", length = 50, nullable = false)
  private String region;
  @Column(name = "status", length = 50, nullable = false)
  private String status;

}

