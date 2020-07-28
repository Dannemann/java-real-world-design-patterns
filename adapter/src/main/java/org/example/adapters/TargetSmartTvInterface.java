package org.example.adapters;

/**
 * <p>The target interface.</p>
 * <p>In this interface, we will define all operations that are common to all smart TVs, no matter the brand.</p>
 * <p>This is the <b>target</b> UML actor.</p>
 */
public interface TargetSmartTvInterface {

	void turnTvOn();

	void turnTvOff();

	void showMenu();

	void startPlay(long startTime);

	void ffw(short speed);

	void rwn(short speed);

	void connectToWifi(String wifiName);

	void showWidget(String widgetID);

}
