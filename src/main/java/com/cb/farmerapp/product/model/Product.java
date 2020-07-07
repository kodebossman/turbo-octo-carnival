package com.cb.farmerapp.product.model;

public class Product {



        public Product(String productName, String serialNo) {
            this.productName = productName;
            this.serialNo = serialNo;
        }

        private String productName;
        private String serialNo;
        private String season;
        private String color;
        private String customer;


        public String getProductName() {
            return productName;
        }

        public String getSerialNo() {
            return serialNo;
        }

        public String getSeason() {
            return season;
        }

        public String getColor() {
            return color;
        }

        public String getCustomer() {
            return customer;
        }

        public void setSerialNo(String serialNo) {
            this.serialNo = serialNo;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public void setSeason(String season) {
            this.season = season;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setCustomer(String customer) {
            this.customer = customer;
        }
    }


