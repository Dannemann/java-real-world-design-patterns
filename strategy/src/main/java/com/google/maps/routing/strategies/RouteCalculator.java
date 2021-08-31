package com.google.maps.routing.strategies;

import com.google.maps.routing.models.Route;

/**
 * <p>The strategy interface.</p>
 * <p>In this interface, we will define the contract of the operation that
 * calculates the route. It doesn't necessarily need to be an interface. It
 * could be an abstract class if that fits your needs better.</p>
 * <p>This is the <b>strategy</b> UML actor.</p>
 */
public interface RouteCalculator {

	Route calculate(Double from, Double to);

}
