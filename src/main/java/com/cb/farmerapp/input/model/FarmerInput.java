package com.cb.farmerapp.input.model;

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

public class FarmerInput {

  @javax.persistence.Id
  private Long Id;
  @Column(name = "input_name", length = 50, nullable = false)
  private String inputName;
  @Column(name = "description", length = 300, nullable = false)
  private String description;
  @Column(name = "input_quantity", length = 50, nullable = false)
  private String quantity;
  @Column(name = "input_weight", length = 50, nullable = false)
  private String weight;
  @Column(name = "input_brand", length = 50, nullable = false)
  private String brand;
  @Column(name = "input_cost", length = 50, nullable = false)
  private String cost;
  @Column(name = "input_type", length = 50, nullable = false)
  private String inputType;
  @Column(name = "input_supplier", length = 50, nullable = false)
  private String supplier;

}
