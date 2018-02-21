package com.thirdparty.libs.sony;

/**
 * <p>Imagine that this class is provided by Sony for you to call commands on a Sony smart TV.</p>
 * <p>This is the <b>adaptee</b> UML actor.</p>
 */
public class SonySmartTV {

	public void openMenu() {
		// Sony specific implementation...
		System.out.println("Sony smart TV menu opened");
	}

	public void play(long startTime) {
		// Sony specific implementation...
		System.out.println("Sony smart TV playback started at " + startTime);
	}

	public void fastForwardPlayback(int speed) {
		// Sony specific implementation...
		System.out.println("Sony smart TV fast forwarding playback with speed " + speed);
	}

	public void rewindPlayback(int speed) {
		// Sony specific implementation...
		System.out.println("Sony smart TV rewind playback with speed " + speed);
	}

	public void connectToWifi(String wifiName) {
		// Sony specific implementation...
		System.out.println("Sony smart TV connected to wireless network with name " + wifiName);
	}

	public void openWidget(String widgetID) {
		// Sony specific implementation...
		System.out.println("Sony smart TV showing widget with ID " + widgetID);
	}

}
