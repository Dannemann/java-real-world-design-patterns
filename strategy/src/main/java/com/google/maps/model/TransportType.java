package com.google.maps.model;

import com.google.maps.routing.BikeRouteCalculator;
import com.google.maps.routing.CarRouteCalculator;
import com.google.maps.routing.MotorcycleRouteCalculator;
import com.google.maps.routing.RouteCalculator;

/**
 * <p>Available transport types in Google Maps.</p>
 * <p>Notice how we associate the route calculator instance with its corresponding
 * enum. I did it this way to demonstrate a method for avoiding the use of
 * <code>if</code> statements to select the algorithm.</p>
 */
public enum TransportType {

    BIKE(new BikeRouteCalculator()),
    CAR(new CarRouteCalculator()),
    MOTORCYCLE(new MotorcycleRouteCalculator());

    private final RouteCalculator routeCalculator;

    TransportType(RouteCalculator routeCalculator) {
        this.routeCalculator = routeCalculator;
    }

    public RouteCalculator getRouteCalculator() {
        return routeCalculator;
    }

}
