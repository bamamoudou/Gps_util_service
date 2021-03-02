package com.tripmaster.gpsutilservice.model;

import java.util.List;

import gpsUtil.location.Attraction;

public class AttractionListWrapper {
	private List<Attraction> attractionList;

	public List<Attraction> getAttractionList() {
		return attractionList;
	}

	public void setAttractionList(List<Attraction> attractionList) {
		this.attractionList = attractionList;
	}
}