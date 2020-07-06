package com.cb.farmerapp.farmer.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "farmer")
@ToString
@Access(AccessType.FIELD)
public class Farmer {

  public Farmer() {

  }

  public Farmer(String farmerName, String idNo) {
    this.farmerName = farmerName;
    this.idNo = idNo;
  }

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

//getter

  public String getFarmerName() {
    return farmerName;
  }

  public String getMsisdn() {
    return msisdn;
  }

  public String getIdNo() {
    return idNo;
  }

  public String getLocation() {
    return location;
  }

  public String getSpeciality() {
    return speciality;
  }

  public LocalDate getdOB() {
    return dOB;
  }

//setter

  public void setFarmerName(String farmerName) {
    this.farmerName = farmerName;
  }

  public void setMsisdn(String msisdn) {
    this.msisdn = msisdn;
  }

  public void setIdNo(String idNo) {
    this.idNo = idNo;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  public void setdOB(LocalDate dOB) {
    this.dOB = dOB;
  }
}
