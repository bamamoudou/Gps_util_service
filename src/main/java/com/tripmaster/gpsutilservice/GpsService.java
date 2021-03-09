package com.tripmaster.gpsutilservice;

import java.util.List;

import com.tripmaster.common.AttractionData;
import com.tripmaster.common.User;
import com.tripmaster.common.VisitedLocationData;

import gpsUtil.location.VisitedLocation;

public interface GpsService {
	List<User> trackAllUserLocations(List<User> userList);

	VisitedLocationData getCurrentUserLocation(String userIdString);

	List<AttractionData> getAllAttractions();

	VisitedLocationData newVisitedLocationData(VisitedLocation visitedLocation);
}