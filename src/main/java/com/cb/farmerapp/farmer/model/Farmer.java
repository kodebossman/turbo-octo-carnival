package com.cb.farmerapp.farmer.model;

public class Farmer {


  public Farmer(String farmerName, String idNo) {
    this.farmerName = farmerName;
    this.idNo = idNo;
  }

  private int Id;
  private String farmerName;
  private String msisdn;
  private String idNo;
  private String location;
  private String speciality;
  private String dOB;

  public int getId() {
    return Id;
  }

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

  public String getdOB() {
    return dOB;
  }

  public void setId(int id) {
    Id = id;
  }

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

  public void setdOB(String dOB) {
    this.dOB = dOB;
  }
}
