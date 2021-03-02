package com.tripmaster.gpsutilservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gpsUtil.GpsUtil;

@Configuration
public class LocationConfig {
	@Bean
	public GpsUtil getGpsUtil() {
		return new GpsUtil();
	}
}
