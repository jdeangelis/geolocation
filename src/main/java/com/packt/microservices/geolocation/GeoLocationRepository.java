package com.packt.microservices.geolocation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class GeoLocationRepository {

	private List<GeoLocation> geoLocations = new ArrayList<GeoLocation>();
	
	public void addGeoLocation(GeoLocation geolocation) {
		geoLocations.add(geolocation);
	}
	
	public List<GeoLocation> getGeoLocations() {
		return Collections.unmodifiableList(geoLocations);
	}
}
