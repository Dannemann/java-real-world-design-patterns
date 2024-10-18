package com.google.maps.routing.strategy.algorithms;

import com.google.maps.routing.strategy.RouteCalculator;
import com.google.maps.routing.strategy.RouteCalculatorContext;

/**
 * <p>Calculates the best route by motorcycle.</p>
 * <p>This is the <b>concrete strategy</b> UML actor.</p>
 */
public class MotorcycleRouteCalculator implements RouteCalculator {

    public Object calculate(RouteCalculatorContext ctx) {
        ctx.getLatitude(); ctx.getMapCenter(); ctx.getTileLayer(); // The context provides access to all arguments.
        // ...complex algorithm to calculate the best route...
        System.out.println("Calculating motorcycle route...");
        return new Object(); // Let's treat this object as the calculated motorcycle route.
    }

}
