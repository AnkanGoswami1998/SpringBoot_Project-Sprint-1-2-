////Service interface

package com.railway.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.railway.entity.Fare;

@Component
public interface FareService {
	
	List<Fare> getAllFare(); //// 4 methods of crud
	Fare getFareById(int fare_id);
	Fare addFare(Fare fare);
	Fare updateFare(Fare fare,int fare_id);

}
