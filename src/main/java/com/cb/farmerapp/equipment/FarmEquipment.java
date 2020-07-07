package com.cb.farmerapp.equipment;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "farmerquipment", indexes = {@Index(name = "indx_farmers", columnList = "msisdn", unique = true)})
@ToString
@Access(AccessType.FIELD)
@Getter
@Setter
public class FarmEquipment {
  @javax.persistence.Id
  private Long Id;
  @Column(name = "equipmentName", length = 50, nullable = false)
  private String equipmentName;
  @Column(name = "desc", length = 50, nullable = false)
  private String desc;
  @Column(name = "EquipmentType", length = 50, nullable = false)
  private EquipmentType equipmentType;
  @Column(name = "EquipmentType", length = 50, nullable = false)
  private Double equipmentValue;

}
