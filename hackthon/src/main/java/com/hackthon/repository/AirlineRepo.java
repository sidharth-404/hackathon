package com.hackthon.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.hackthon.model.Airline;

public interface AirlineRepo extends  JpaRepository <Airline,String> {

}
