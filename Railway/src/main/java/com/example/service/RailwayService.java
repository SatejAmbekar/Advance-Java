package com.example.service;

import java.util.List;

import com.example.entities.Railway;

public interface RailwayService {
	
	/*
	 * •	Add new Railway
•	Delete Railway details 
•	Fetch all Railway matched by given Railway category
•	Add station details

	 */
	
	Railway addNewRailway(Railway newRailway);
	
	List<Railway> getAllRailways();
	
	String deleteRailwayDetails(Long railwayId);
	
	Railway getRailwayDetails(Long railwayId);
	
	Railway updateRailwayDetails(Railway railway);
	

}
