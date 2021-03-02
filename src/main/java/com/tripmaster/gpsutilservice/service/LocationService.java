package com.tripmaster.gpsutilservice.service;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;

@Service
public class LocationService {
	private final GpsUtil gpsUtil;
	private final Logger logger = LoggerFactory.getLogger(LocationService.class);

	@Autowired
	public LocationService(GpsUtil gpsUtil) {
		this.gpsUtil = gpsUtil;
	}

	public VisitedLocation getUserLocation(UUID userID) {
		return gpsUtil.getUserLocation(userID);
	}

	public List<Attraction> getAttractions() {
		return gpsUtil.getAttractions();
	}
}