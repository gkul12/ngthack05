package com.cg.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.backend.entity.Airports;

public interface AirportRepository extends JpaRepository<Airports, String>{

}
