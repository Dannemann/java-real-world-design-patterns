package org.example;

import com.google.maps.routing.models.TransportType;
import com.google.maps.routing.strategy.RouteCalculatorContext;

/**
 * <p>This is the <b>client</b> UML actor.</p>
 * <p>Notice how we decoupled the whole Strategy inside package
 * <code>com.google.maps.routing</code>. It could be easily packed in a JAR.</p>
 */
public class Main {

    public static void main(String[] args) {
        // This data will usually come from the UI.
        RouteCalculatorContext context = new RouteCalculatorContext(TransportType.BIKE, 37.7749, -122.4194, 12,
                "EPSG:3857", "OpenStreetMap", 123456789L, 987654321L);

        // Calculating the route for the selected transportation type.
        Object route = context.calculate();

        // If the user changes the transportation type...
        context.setTransportType(TransportType.CAR);

        // ...we just calculate it again but this time with a different algorithm.
        route = context.calculate();

        // Notice how RouteCalculatorContext serves as an ideal location for maintaining
        // context and shared data across algorithm (strategy) changes. There was no
        // need to provide the GPS coordinates again, only the transport type.
        // The arguments are preserved within the context.
        // Without it, you simply use the polymorphic behavior offered by
        // RouteCalculator interface as a generic type, which is a common daily-basis
        // OOP feature.
    }

}
