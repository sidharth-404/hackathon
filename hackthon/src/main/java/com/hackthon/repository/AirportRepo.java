package com.hackthon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackthon.model.Airports;

public interface AirportRepo extends JpaRepository<Airports,String> {

}
