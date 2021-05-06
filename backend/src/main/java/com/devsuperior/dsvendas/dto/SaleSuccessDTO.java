package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSuccessDTO implements Serializable {
  private static final long serialVersionUID = 7532811462995750642L;
  private String sellerName;
  private Long visited;
  private Long deals;

  public SaleSuccessDTO() {}

  public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
    sellerName = seller.getName();
    this.visited = visited;
    this.deals = deals;
  }

  public String getSellerName() {
    return sellerName;
  }

  public void setSellerName(String sellerName) {
    this.sellerName = sellerName;
  }

  public Long getVisited() {
    return visited;
  }

  public void setVisited(Long visited) {
    this.visited = visited;
  }

  public Long getDeals() {
    return deals;
  }

  public void setDeals(Long deals) {
    this.deals = deals;
  }
}
