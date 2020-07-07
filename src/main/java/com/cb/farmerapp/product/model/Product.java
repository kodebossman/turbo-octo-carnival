package com.cb.farmerapp.product.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "product")

@ToString
@Access(AccessType.FIELD)
@Getter
@Setter
public class Product {

  @Id
  private Long Id;
  @Column(name = "product_name", length = 50, nullable = false)
  private String productName;
  @Column(name = "serialNo", length = 50, nullable = false)
  private String serialNo;
  @Column(name = "season", length = 50, nullable = false)
  private String season;
  @Column(name = "color", length = 50, nullable = false)
  private String color;
  @Column(name = "customer", length = 50, nullable = false)
  private String customer;


}

 



