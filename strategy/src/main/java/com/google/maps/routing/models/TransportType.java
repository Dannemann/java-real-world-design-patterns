package com.google.maps.routing.models;

import com.google.maps.routing.strategy.RouteCalculator;
import com.google.maps.routing.strategy.algorithms.BikeRouteCalculator;
import com.google.maps.routing.strategy.algorithms.CarRouteCalculator;
import com.google.maps.routing.strategy.algorithms.FootRouteCalculator;
import com.google.maps.routing.strategy.algorithms.MotorcycleRouteCalculator;

/**
 * <p>Available transport types in Google Maps.</p>
 * <p>Notice how we associate the route calculator instance with its corresponding
 * enum. I did it this way to demonstrate a method for avoiding the use of
 * <code>if</code> statements to select the algorithm.</p>
 */
public enum TransportType {

    BIKE(new BikeRouteCalculator()),
    CAR(new CarRouteCalculator()),
    FOOT(new FootRouteCalculator()),
    MOTORCYCLE(new MotorcycleRouteCalculator());

    private final RouteCalculator routeCalculator;

    TransportType(RouteCalculator routeCalculator) {
        this.routeCalculator = routeCalculator;
    }

    public RouteCalculator getRouteCalculator() {
        return routeCalculator;
    }

}
