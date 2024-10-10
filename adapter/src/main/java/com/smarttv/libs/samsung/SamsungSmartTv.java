package com.smarttv.libs.samsung;

/**
 * <p>Imagine that this class is provided by Samsung for you to call commands on a
 * Samsung smart TV. In the real world, you would not have access to this class
 * source code and it would be packed in a JAR file provided by Samsung. You
 * would need then to add it as a dependency to your project.</p>
 * <p>This is the <b>adaptee</b> UML actor.</p>
 */
public class SamsungSmartTv {

	// Samsung specific implementations.

	public void turnOn() {
		System.out.println("Samsung smart TV is on");
	}

	public void turnOff() {
		System.out.println("Samsung smart TV is off");
	}

	public void openMenu() {
		System.out.println("Samsung smart TV menu opened");
	}

	public void startPlayback(long startTime) {
		System.out.println("Samsung smart TV playback started at " + startTime);
	}

	public void ffwPlayback(short speed) {
		System.out.println("Samsung smart TV fast forwarding playback with speed " + speed);
	}

	public void rwnPlayback(short speed) {
		System.out.println("Samsung smart TV rewind playback with speed " + speed);
	}

	public void wifiConn(String wifiName) {
		System.out.println("Samsung smart TV connected to wireless network with name " + wifiName);
	}

	public void showWidget(String widgetID) {
		System.out.println("Samsung smart TV showing widget with ID " + widgetID);
	}

}
