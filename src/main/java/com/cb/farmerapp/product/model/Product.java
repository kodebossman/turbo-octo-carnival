package com.cb.farmerapp.product.model;

import com.cb.farmerapp.project.Project;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "farmerInput", indexes = {@Index(name = "id", columnList = "id", unique = true)})
@Getter
@Setter
@ToString
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {
  @Id
  private Long Id;
  @Column(name = "product_name", length = 50, nullable = false)
  private String productName;
  @Column(name = "product_Id", length = 50, nullable = false)
  private String serialNo;
  @Column(name = "season", length = 50, nullable = false)
  private String season;
  @Column(name = "color", length = 100, nullable = false)
  private String color;
  @Column(name = "status", length = 50, nullable = false)
  private String status;
  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  private Project project;


}

 



