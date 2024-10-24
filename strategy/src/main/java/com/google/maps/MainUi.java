package com.google.maps;

import com.google.maps.model.TransportType;

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

}
