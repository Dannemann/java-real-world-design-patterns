package com.google.maps.routing.models;

import com.google.maps.routing.strategies.BikeRouteCalculator;
import com.google.maps.routing.strategies.CarRouteCalculator;
import com.google.maps.routing.strategies.FootRouteCalculator;
import com.google.maps.routing.strategies.MotorcycleRouteCalculator;
import com.google.maps.routing.strategies.RouteCalculator;

/**
 * Available transport types in Google Maps.
 */
public enum TransportType {

	FOOT(new FootRouteCalculator()),
	BIKE(new BikeRouteCalculator()),
	MOTORCYCLE(new MotorcycleRouteCalculator()),
	CAR(new CarRouteCalculator());

	private final RouteCalculator routeCalculator;

	private TransportType(RouteCalculator routeCalculator) {
		this.routeCalculator = routeCalculator;
	}

	public RouteCalculator getRouteCalculator() {
		return routeCalculator;
	}

}
