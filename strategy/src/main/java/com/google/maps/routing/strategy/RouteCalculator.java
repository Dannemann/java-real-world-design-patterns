package com.google.maps.routing.strategy;

/**
 * <p>Here we define the operation(s) that calculates the route. It can be replaced
 * with an abstract class if that better suits your design requirements.</p>
 * <p>This is the <b>strategy</b> UML actor.</p>
 */
public interface RouteCalculator {

    Object calculate(RouteCalculatorContext context);

}
