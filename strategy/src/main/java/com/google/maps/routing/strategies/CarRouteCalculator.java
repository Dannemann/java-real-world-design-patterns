package com.google.maps.routing.strategies;

import java.util.Date;

import com.google.maps.routing.models.Route;
import com.google.maps.routing.models.TransportType;

/**
 * <p>In this class, we will implement the algorithm that calculates the best route by car.</p>
 * <p>This is the <b>concrete strategy</b> UML actor.</p>
 */
public class CarRouteCalculator implements RouteCalculator {

	public Route calculate(Double from, Double to) {
		System.out.println("By car.");

		// Doing complex path calculations...
		Object resultPath = new Object();
		Date resultEta = new Date();

		// Returns a Route object with the best path available by car.
		return new Route(from, to, TransportType.CAR, resultPath, resultEta);
	}

}
