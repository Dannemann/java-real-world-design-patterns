package com.google.maps.routing.strategies;

import com.google.maps.routing.models.TransportType;

/**
 * This is the <b>context</b> UML actor.
 */
public class RouteCalculatorContext {

    private Double gpsFrom;
    private Double gpsTo;
    private TransportType transportType;

    public RouteCalculatorContext(Double gpsFrom, Double gpsTo, TransportType transportType) {
        this.gpsFrom = gpsFrom;
        this.gpsTo = gpsTo;
        this.transportType = transportType;
    }

    /**
     * <p>Calculates the route using the selected strategy.</p>
     * <p>This is the actual Strategy pattern execution.</p>
     */
    public Object calculate() {
        return transportType.getRouteCalculator().calculate(gpsFrom, gpsTo);
    }

    // Getters and setters...

    public void setGpsFrom(Double gpsFrom) {
        this.gpsFrom = gpsFrom;
    }

    public void setGpsTo(Double gpsTo) {
        this.gpsTo = gpsTo;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

}
