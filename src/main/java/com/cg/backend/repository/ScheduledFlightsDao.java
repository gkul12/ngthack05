package com.cg.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.backend.entity.ScheduledFlights;

@Repository
public interface ScheduledFlightsDao extends JpaRepository<ScheduledFlights,Integer>
{
	@Query(value="delete from scheduled_flights where departure_date < ?1",nativeQuery=true)
	public void deletePastFlights(String date);
	
	@Query(value="select * from scheduled_flights where source=?1 and destination=?2 and departureDate=?3",nativeQuery=true)
	public List<ScheduledFlights> searchFlights(String source,String destination,String departureDate);
}
