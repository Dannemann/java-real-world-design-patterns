package com.google.maps.routing;

import com.google.maps.routing.models.Route;
import com.google.maps.routing.strategies.RouteCalculator;

/**
 * <p>This is the <b>context</b> UML actor. It is literally the context that your
 * strategies need to execute their jobs. It is not required but provides useful
 * functionality for handling and decoupling of your algorithms. All
 * functionality in this class is subjective to how you need to handle your
 * strategies.</p>
 * <p>For example, sometimes your family of algorithms need to modify a shared
 * instance variable many times before returning it to the GUI. The context
 * class could be a good place to add this variable. Or it can also hold the
 * arguments required by the algorithms (e.g. <code>gpsPositionFrom</code> and
 * the other fields in this class).</p>
 * <p>It also makes it possible to add the whole Strategy to a JAR and have a
 * unique point of access that will handle the correct algorithm selection,
 * instead of coupling this condition to your client code.</p>
 */
public class RouteCalculatorContext {

	private Double gpsPositionFrom;
	private Double gpsPositionTo;
	private RouteCalculator routeCalculator;

	public RouteCalculatorContext(Double gpsPositionFrom, Double gpsPositionTo, RouteCalculator routeCalculator) {
		this.gpsPositionFrom = gpsPositionFrom;
		this.gpsPositionTo = gpsPositionTo;
		this.routeCalculator = routeCalculator;
	}

	/**
	 * Calculates the route using the selected strategy.
	 */
	public Route calculate() {
		return routeCalculator.calculate(gpsPositionFrom, gpsPositionTo);
	}

	// Getters and setters:

	public Double getGpsPositionFrom() {
		return gpsPositionFrom;
	}

	public void setGpsPositionFrom(Double gpsPositionFrom) {
		this.gpsPositionFrom = gpsPositionFrom;
	}

	public Double getGpsPositionTo() {
		return gpsPositionTo;
	}

	public void setGpsPositionTo(Double gpsPositionTo) {
		this.gpsPositionTo = gpsPositionTo;
	}

	public RouteCalculator getRouteCalculator() {
		return routeCalculator;
	}

	public void setRouteCalculator(RouteCalculator routeCalculator) {
		this.routeCalculator = routeCalculator;
	}

}
