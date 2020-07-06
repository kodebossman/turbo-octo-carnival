package com.cb.farmerapp.farmer.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "farmers", indexes = {@Index(name = "indx_farmers", columnList = "msisdn", unique = true)})
@ToString
@Access(AccessType.FIELD)
@Getter
@Setter
public class Farmer {

  @Id
  private Long Id;
  @Column(name = "farmer_name", length = 50, nullable = false)
  private String farmerName;
  @Column(name = "msisdn", length = 50, nullable = false)
  private String msisdn;
  @Column(name = "id_no", length = 50, nullable = false)
  private String idNo;
  @Column(name = "location", length = 50, nullable = false)
  private String location;
  @Column(name = "speciality", length = 50, nullable = false)
  private String speciality;
  @Column(name = "date_of_date")
  @Temporal(value = TemporalType.TIMESTAMP)
  @JsonFormat(pattern = "MM/dd/yyyy")
  private LocalDate dOB;



}
