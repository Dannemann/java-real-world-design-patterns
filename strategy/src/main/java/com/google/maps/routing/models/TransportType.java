package com.google.maps.routing.models;

import com.google.maps.routing.strategies.BikeRouteCalculator;
import com.google.maps.routing.strategies.CarRouteCalculator;
import com.google.maps.routing.strategies.FootRouteCalculator;
import com.google.maps.routing.strategies.MotorcycleRouteCalculator;
import com.google.maps.routing.strategies.RouteCalculator;

/**
 * <p>Available transport types in Google Maps.</p>
 * <p>Notice how we associate the route calculator instance with its corresponding
 * enum. I did it this way to demonstrate a method for avoiding the use of
 * <code>if</code> statements to select the algorithm.</p>
 */
public enum TransportType {

	FOOT(new FootRouteCalculator()),
	BIKE(new BikeRouteCalculator()),
	MOTORCYCLE(new MotorcycleRouteCalculator()),
	CAR(new CarRouteCalculator());

	private final RouteCalculator routeCalculator;

	TransportType(RouteCalculator routeCalculator) {
		this.routeCalculator = routeCalculator;
	}

	public RouteCalculator getRouteCalculator() {
		return routeCalculator;
	}

}
