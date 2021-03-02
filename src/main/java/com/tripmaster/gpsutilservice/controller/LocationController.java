package com.tripmaster.gpsutilservice.controller;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tripmaster.gpsutilservice.model.AttractionListWrapper;
import com.tripmaster.gpsutilservice.service.LocationService;

import gpsUtil.location.VisitedLocation;

@RestController
public class LocationController {
	@Autowired
	private LocationService locationService;
	private final Logger logger = LoggerFactory.getLogger(LocationController.class);

	@RequestMapping("/user-location")
	public VisitedLocation getUserLocation(@RequestParam String userId) {
		VisitedLocation visitedLocation = locationService.getUserLocation(UUID.fromString(userId));
		logger.debug("Request made to getUserLocation");
		return visitedLocation;
	}

	@RequestMapping("/attractions")
	public AttractionListWrapper getAttractions() {
		AttractionListWrapper attractionListWrapper = new AttractionListWrapper();
		attractionListWrapper.setAttractionList(locationService.getAttractions());
		logger.debug("Request made to getAttractions");
		return attractionListWrapper;
	}
}