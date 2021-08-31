package com.google.maps.routing.strategies;

import java.util.Date;

import com.google.maps.routing.models.Route;
import com.google.maps.routing.models.TransportType;

/**
 * <p>In this class, we will implement the algorithm that calculates the best route by motorcycle.</p>
 * <p>This is the <b>concrete strategy</b> UML actor.</p>
 */
public class MotorcycleRouteCalculator implements RouteCalculator {

	public Route calculate(Double from, Double to) {
		System.out.println("By motorcycle.");

		// Doing complex path calculations...
		Object resultPath = new Object();
		Date resultEta = new Date();

		// Returns a Route object with the best path available by motorcycle.
		return new Route(from, to, TransportType.MOTORCYCLE, resultPath, resultEta);
	}

}
