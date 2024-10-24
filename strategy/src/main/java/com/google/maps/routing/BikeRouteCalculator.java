package com.google.maps.routing;

import com.google.maps.MapEngine;

/**
 * <p>Calculates the best route by bike.</p>
 * <p>This is the <b>concrete strategy</b> UML actor.</p>
 */
public class BikeRouteCalculator implements RouteCalculator {

    public Object calculate(MapEngine engine) {
        // engine.latitude; engine.longitude; // Gets necessary data from context...
        System.out.println("Complex algorithm calculating the best BIKE route...");
        return new Object(); // Let's treat this object as the calculated bike route.
    }

}
