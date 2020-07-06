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

}


