package org.example.adapters;

import com.thirdparty.libs.sony.Connector;
import com.thirdparty.libs.sony.SonySmartTV;

/**
 * <p>Sony adapter.</p>
 * <p>This is the <b>adapter</b> UML actor.</p>
 */
public class SonyAdapter implements TargetSmartTVInterface {

	// -------------------------------------------------------------------------
	// Fields:

	private final Connector sonyConnector;

	private SonySmartTV sonySmartTVInterface;

	// -------------------------------------------------------------------------
	// Constructors:

	public SonyAdapter(Connector sonyConnector) {
		this.sonyConnector = sonyConnector;
	}

	// -------------------------------------------------------------------------
	// TargetSmartTVInterface implementation:

	public void connectToTV() {
		sonySmartTVInterface = sonyConnector.connectToTV();
	}

	public void disconnectTV() {
		sonyConnector.disconnect();
	}

	public void showMeny() {
		sonySmartTVInterface.openMenu();
	}

	public void startPlay(long startTime) {
		sonySmartTVInterface.play(startTime);
	}

	public void ffw(short speed) {
		sonySmartTVInterface.fastForwardPlayback(speed);
	}

	public void rwn(short speed) {
		sonySmartTVInterface.rewindPlayback(speed);
	}

	public void connectToWifi(String wifiName) {
		sonySmartTVInterface.connectToWifi(wifiName);
	}

	public void showWidget(String widgetID) {
		sonySmartTVInterface.openWidget(widgetID);
	}

	// -------------------------------------------------------------------------
}
