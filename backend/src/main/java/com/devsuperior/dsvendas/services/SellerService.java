package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

  @Autowired
  private SellerRepository repository;

  public List<SellerDTO> findAll() {
    List<Seller> result = repository.findAll();
    // converter para DTO
    return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
  }

}
