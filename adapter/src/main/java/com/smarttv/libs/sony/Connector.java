package com.smarttv.libs.sony;

/**
 * <p>Imagine that this class is provided by Sony for you to call commands on a
 * Sony smart TV. In the real world, you would not have access to this class
 * source code and it would be packed in a JAR file provided by Sony. You
 * would need then to add it as a dependency to your project.</p>
 * <p>This is the <b>adaptee</b> UML actor.</p>
 */
public class Connector {

	// Notice how Sony implementation is separated into two classes.
	// First, you need to use this class to turn the TV on and obtain the SonySmartTvApi object to call other commands.
	// I made this to show you that you can adapt more than one class if needed.

	public SonySmartTvApi turnSonyTvOn() {
		System.out.println("Sony smart TV is on");
		return new SonySmartTvApi();
	}

	public void turnSonyTvOff() {
		System.out.println("Sony smart TV is off");
	}

}
