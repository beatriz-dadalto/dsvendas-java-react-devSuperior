package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {

  private static final long serialVersionUID = 4677665879248736917L;

  private String sellerName;
  private Double sum;

  public SaleSumDTO() {}

  public SaleSumDTO(Seller seller, Double sum) {
    this.sellerName = seller.getName();
    this.sum = sum;
  }

  public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }

  public Double getSum() {
    return sum;
  }

  public void setSum(Double sum) {
    this.sum = sum;
  }
}
