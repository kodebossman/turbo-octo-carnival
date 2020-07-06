package com.cb.farmerapp.input.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@Table(name = "farmerInput")
@Entity
public class FarmerInput {


  @Id
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
