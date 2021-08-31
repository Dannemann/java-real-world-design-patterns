package com.google.maps.routing.strategies;

import java.util.Date;

import com.google.maps.routing.models.Route;
import com.google.maps.routing.models.TransportType;

/**
 * <p>In this class, we will implement the algorithm that calculates the best route by bike.</p>
 * <p>This is the <b>concrete strategy</b> UML actor.</p>
 */
public class BikeRouteCalculator implements RouteCalculator {

	public Route calculate(Double from, Double to) {
		System.out.println("By bike.");

		// Doing complex path calculations...
		Object resultPath = new Object();
		Date resultEta = new Date();

		// Returns a Route object with the best path available by bike.
		return new Route(from, to, TransportType.BIKE, resultPath, resultEta);
	}

}
