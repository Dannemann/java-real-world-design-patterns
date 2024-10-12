package com.google.maps.routing.strategies;

/**
 * <p>In this class, we will implement the algorithm that calculates the best route by car.</p>
 * <p>This is the <b>concrete strategy</b> UML actor.</p>
 */
public class CarRouteCalculator implements RouteCalculator {

    public Object calculate(Double from, Double to) {
        System.out.println("Calculating car route...");
        return new Object(); // Let's treat this object as the calculated car route.
    }

}
