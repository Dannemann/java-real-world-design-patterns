package com.google.maps.routing.strategy;

import com.google.maps.routing.models.TransportType;

/**
 * <p>This is the <b>context</b> UML actor.</p>
 * <p>As the name suggests, it provides a context where all the necessary
 * information is stored for your family of algorithms to function properly.</p>
 * <p>Keep in mind, we have different implementations of the same behavior, which
 * typically require a similar set of parameters.</p>
 */
public class RouteCalculatorContext {

    // Essential parameters for complex map route calculations; different algorithms may use a subset of these.
    private TransportType transportType;
    private double latitude;
    private double longitude;
    private int zoomLevel;
    private String mapProjection;
    private String tileLayer;
    private long mapCenter;
    private long markerPosition;

    public RouteCalculatorContext(TransportType transportType, double latitude, double longitude, int zoomLevel,
                                  String mapProjection, String tileLayer, long mapCenter, long markerPosition) {
        this.transportType = transportType;
        this.latitude = latitude;
        this.longitude = longitude;
        this.zoomLevel = zoomLevel;
        this.mapProjection = mapProjection;
        this.tileLayer = tileLayer;
        this.mapCenter = mapCenter;
        this.markerPosition = markerPosition;
    }

    /**
     * <p>Triggers route calculation with the selected strategy. Notice how we pass the
     * current instance of this class as an argument, granting the strategies access
     * to all the data defined within it.</p>
     * <p>This is the actual Strategy pattern execution.</p>
     */
    public Object calculate() {
        // If you're not using enum or Map associations, you can include an if statement here to select the appropriate algorithm.
        return transportType.getRouteCalculator().calculate(this);
    }

    // Getters and setters...

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getZoomLevel() {
        return zoomLevel;
    }

    public void setZoomLevel(int zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    public String getMapProjection() {
        return mapProjection;
    }

    public void setMapProjection(String mapProjection) {
        this.mapProjection = mapProjection;
    }

    public String getTileLayer() {
        return tileLayer;
    }

    public void setTileLayer(String tileLayer) {
        this.tileLayer = tileLayer;
    }

    public long getMapCenter() {
        return mapCenter;
    }

    public void setMapCenter(long mapCenter) {
        this.mapCenter = mapCenter;
    }

    public long getMarkerPosition() {
        return markerPosition;
    }

    public void setMarkerPosition(long markerPosition) {
        this.markerPosition = markerPosition;
    }

}
