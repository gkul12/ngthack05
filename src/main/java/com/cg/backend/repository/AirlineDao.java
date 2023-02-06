package com.cg.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.backend.entity.AirlineDetails;


@Repository
public interface AirlineDao extends JpaRepository<AirlineDetails,String>{


}
