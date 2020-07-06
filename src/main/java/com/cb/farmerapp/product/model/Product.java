package com.cb.farmerapp.product.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Data
public class Product {
    private Long Id;
    private String productName;
    private  String msisdn;
    private String idNo;
    private String customer;
    private String season;
    private String color;

  public Long getId() {
    return Id;
  }

    public String getProductName() {
        return productName;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public String getIdNo() {
        return idNo;
    }

    public String getCustomer() {
        return customer;
    }

    public String getSeason() {
        return season;
    }

    public String getColor() {
        return color;
    }

  public void setId(Long id) {
    Id = id;
  }

    public void setFarmerName(String productName) {
        this.productName = productName;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setSpeciality(String speciality) {
        this.season = speciality;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


