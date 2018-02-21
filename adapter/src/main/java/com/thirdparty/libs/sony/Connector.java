package com.thirdparty.libs.sony;

/**
 * <p>Imagine that this class is provided by Sony for you to connect to a Sony
 * smart TV and obtain the object <code>SonySmartTV</code> to call commands on it.</p>
 * <p>This is the <b>adaptee</b> UML actor.</p>
 */
public class Connector {

	public SonySmartTV connectToTV() {
		// Sony specific implementation...
		SonySmartTV sonySmartTVInterface = new SonySmartTV();
		System.out.println("Sony smart TV connected");
		return sonySmartTVInterface;
	}

	public void disconnect() {
		// Sony specific implementation...
		System.out.println("Sony smart TV disconnected");
	}

}
