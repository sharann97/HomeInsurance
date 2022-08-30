package com.homeinsuranceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeinsuranceapp.model.HomeInsurance;

public interface InsuranceRepository extends JpaRepository<HomeInsurance, Integer> {

}
