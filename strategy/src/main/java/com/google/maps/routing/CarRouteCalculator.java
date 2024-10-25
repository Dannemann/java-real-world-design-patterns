package com.google.maps.routing;

import com.google.maps.MapEngine;

/**
 * <p>Calculates the best route by car.</p>
 * <p>This is the <b>ConcreteStrategy</b> UML actor.</p>
 */
public class CarRouteCalculator implements RouteCalculator {

    public Object calculate(MapEngine engine) {
        // engine.latitude; engine.longitude; // Gets necessary data from context...
        System.out.println("Complex algorithm calculating the best CAR route...");
        return new Object(); // Let's treat this object as the calculated car route.
    }

}
