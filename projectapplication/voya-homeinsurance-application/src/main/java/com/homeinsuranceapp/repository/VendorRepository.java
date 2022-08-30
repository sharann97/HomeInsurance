package com.homeinsuranceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.homeinsuranceapp.model.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
