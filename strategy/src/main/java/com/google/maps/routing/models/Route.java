package com.google.maps.routing.models;

import java.util.Date;

/**
 * This is an example model that defines the calculated route to be returned to the user.
 */
public class Route {

	private Double from;
	private Double to;
	private Object path; // Imagine that this is a complex object with the complete path to the destination.
	private Date expectedArrivalDate;
	private TransportType transportType;

	public Route(Double from, Double to, TransportType transportType, Object path, Date expectedArrivalDate) {
		this.from = from;
		this.to = to;
		this.transportType = transportType;
		this.path = path;
		this.expectedArrivalDate = expectedArrivalDate;
	}

	// Getters, setters and etc...

}
