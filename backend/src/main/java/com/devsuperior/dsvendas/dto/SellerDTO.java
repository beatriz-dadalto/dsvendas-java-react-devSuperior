package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SellerDTO implements Serializable {

  private static final long serialVersionUID = -6595466531379749906L;

  private Long id;
  private String name;

  public SellerDTO() {}

  public SellerDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public SellerDTO(Seller entity) {
    id = entity.getId();
    name = entity.getName();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
