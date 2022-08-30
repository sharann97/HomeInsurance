package com.homeinsuranceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeinsuranceapp.model.Buyer;

public interface BuyerRepository extends  JpaRepository<Buyer, Integer>{

}
