package com.smarttv.libs.phillips;

/**
 * <p>Imagine that this class is provided by Phillips for you to call commands on a
 * Phillips smart TV. In the real world, you would not have access to this class
 * source code and it would be packed in a JAR file provided by Phillips. You
 * would need then to add it as a dependency to your project.</p>
 * <p>This is the <b>adaptee</b> UML actor.</p>
 */
public class PhillipsSmartTv {

	// Phillips specific implementations.

	public void on() {
		System.out.println("Phillips smart TV is on");
	}

	public void off() {
		System.out.println("Phillips smart TV is off");
	}

	public void menu() {
		System.out.println("Phillips smart TV menu opened");
	}

	public void startPlay(long startTime) {
		System.out.println("Phillips smart TV playback started at " + startTime);
	}

	public void ffw(short speed) {
		System.out.println("Phillips smart TV fast forwarding playback with speed " + speed);
	}

	public void rwn(short speed) {
		System.out.println("Phillips smart TV rewind playback with speed " + speed);
	}

	public void connectWifi(String wifiName) {
		System.out.println("Phillips smart TV connected to wireless network with name " + wifiName);
	}

	public void showWidget(String widgetID) {
		System.out.println("Phillips smart TV showing widget with ID " + widgetID);
	}

}
