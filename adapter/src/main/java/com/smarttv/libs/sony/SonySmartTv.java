package com.smarttv.libs.sony;

/**
 * <p>Imagine that this class is provided by Sony for you to call commands on a
 * Sony smart TV. In the real world, you would not have access to this class
 * source code and it would be packed in a JAR file provided by Sony. You
 * would need then to add it as a dependency to your project.</p>
 * <p>This is the <b>adaptee</b> UML actor.</p>
 */
public class SonySmartTv {

	// Notice how Sony implementation is separated into two classes. 
	// You need to use the Connector class first to turn the TV on and obtain an instance of this class.
	// I made this to show you that you can adapt more than one class if needed.

	SonySmartTv() {
	}

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
