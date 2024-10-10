package com.google.maps.routing.strategies;

/**
 * <p>The strategy interface.</p>
 * <p>Here we define the operation(s) that calculates the route. It can be replaced
 * with an abstract class if that better suits your design requirements.</p>
 * <p>This is the <b>strategy</b> UML actor.</p>
 */
public interface RouteCalculator {

	Object calculate(Double from, Double to);

}
