package org.example;

import com.google.maps.routing.RouteCalculatorContext;
import com.google.maps.routing.models.TransportType;

/**
 * <p>This is the <b>client</b> UML actor.</p>
 * <p>Notice how we decoupled the whole Strategy inside package
 * <code>com.google.maps.*</code>. It could be easily packed in a JAR.</p>
 */
public class Main {

	public static void main(String[] args) {
		// This data will usually come from the UI.
		TransportType transportType = TransportType.FOOT;
		Double gpsFrom = 43348589345435d;
		Double gpsTo = 02349209237478d;

		// Creating the context object.
		RouteCalculatorContext routeCalculatorContext =
				new RouteCalculatorContext(gpsFrom, gpsTo, transportType);

		// Calculating the route for the selected transportation type.
		Object route = routeCalculatorContext.calculate();

		// If the user changes the transportation type...
		transportType = TransportType.CAR;

		// ...we just calculate it again but this time with a different algorithm.
		routeCalculatorContext.setTransportType(transportType);
		route = routeCalculatorContext.calculate();

		// Notice how RouteCalculatorContext serves as an ideal location for maintaining
		// context and shared data across algorithm (strategy) changes. There was no
		// need to provide the GPS coordinates again, only the transport type.
		// The arguments are preserved within the context.

		// Without the context, you simply use the polymorphism offered by the
		// RouteCalculator interface as a generic type, which is a common behavior in
		// OOP.
	}

}
