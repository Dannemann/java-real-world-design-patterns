package org.example;

import com.google.maps.routing.RouteCalculatorContext;
import com.google.maps.routing.models.Route;
import com.google.maps.routing.models.TransportType;

/**
 * <p>This is the <b>client</b> UML actor.</p>
 * <p>Notice how we decoupled the whole Strategy in package
 * <code>com.google.maps.*</code>. It could easily be in another JAR.</p>
 */
public class Main {

	public static void main(String[] args) {
		// This information will usually come from the GUI.
		TransportType transportationType = TransportType.FOOT;
		Double gpsPositionFrom = 43348589345435d;
		Double gpsPositionTo = 02349209237478d;

		// Creating the context object.
		RouteCalculatorContext routeCalculatorContext = new RouteCalculatorContext(
				gpsPositionFrom, gpsPositionTo, transportationType.getRouteCalculator());

		// Calculating the route to the selected transportation type.
		Route route = routeCalculatorContext.calculate();

		// If the user changes the transportation type...
		transportationType = TransportType.CAR;

		// ...we just call it again but this time with a different algorithm.
		routeCalculatorContext.setRouteCalculator(transportationType.getRouteCalculator());
		route = routeCalculatorContext.calculate();
	}

}
