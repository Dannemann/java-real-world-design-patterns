package com.google.maps;

import com.google.maps.model.TransportType;

/**
 * <p>Google Maps' map engine.</p>
 * <p>This is the <b>Context</b> UML actor.</p>
 */
public class MapEngine {

    // Imagine these are essential parameters for complex map route calculations.
    public TransportType transportType;
    public double latitude; // public for brevity. No getters/setters.
    public double longitude;

    // ...other instance variables and members of the Maps engine...

    /**
     * <p>Triggers route calculation using the selected strategy.</p>
     * <p>This method passes the current instance of this class as an argument,
     * allowing strategies to access all public members. Note that this approach is
     * optional. If you need Strategies decoupled from <code>MapEngine</code>, you
     * could pass each parameter individually.</p>
     */
    public Object calculateRoute() {
        // ...complex code to transform parameters, call other methods, etc...
        Object route = transportType.getRouteCalculator().calculate(this);
        // ...validates and transform route to a UI friendly object...
        return route;
    }

    // ...other methods and members of the Maps engine...

}
