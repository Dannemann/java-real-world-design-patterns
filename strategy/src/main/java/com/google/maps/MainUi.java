package com.google.maps;

import com.google.maps.model.TransportType;
import com.google.maps.routing.BikeRouteCalculator;
import com.google.maps.routing.CarRouteCalculator;
import com.google.maps.routing.MotorcycleRouteCalculator;
import com.google.maps.routing.RouteCalculator;

/**
 * Client code.
 */
public class MainUi {

    // Engine used by the UI to execute operations related to Maps.
    private static final MapEngine ENGINE = new MapEngine();

    public static void main(String[] args) {
        // This data will usually come from the user interacting with the UI.
        ENGINE.transportType = TransportType.BIKE;
        ENGINE.latitude = -122.4194;
        ENGINE.longitude = 37.7749;

        // Calculating the route for the selected transportation type.
        Object route = ENGINE.calculateRoute();

        // If the user changes the transportation type...
        ENGINE.transportType = TransportType.CAR;

        // ...we just calculate it again but this time with a different algorithm.
        route = ENGINE.calculateRoute();
    }

    /**
     * <p>If you're not using enum, array, or Map associations, you could use a method
     * like this to select the appropriate algorithm and pass it to
     * <code>MapEngine</code>. <code>MapEngine</code> would then have a reference to
     * <code>RouteCalculator</code> instead of <code>TransportType</code>.</p>
     * <p>The reason this method is outside <code>MapEngine</code> is to keep concrete
     * strategies decoupled from the context.</p>
     */
    private static RouteCalculator routeCalculator(TransportType transporttype) {
        // Route calculators could be Singletons if that better suits your design (as they are in TransportType).
        return switch (transporttype) {
            case BIKE -> new BikeRouteCalculator();
            case CAR -> new CarRouteCalculator();
            case MOTORCYCLE -> new MotorcycleRouteCalculator();
        };
    }

}
