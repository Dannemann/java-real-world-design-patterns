package org.example.adapters;

import com.thirdparty.libs.phillips.PhillipsSmartTV;

/**
 * <p>Phillips adapter.</p>
 * <p>This is the <b>adapter</b> UML actor.</p>
 */
public class PhillipsAdapter implements TargetSmartTVInterface {

	// -------------------------------------------------------------------------
	// Fields:

	private final PhillipsSmartTV phillipsSmartTVInterface;

	// -------------------------------------------------------------------------
	// Constructors:

	public PhillipsAdapter(PhillipsSmartTV phillipsSmartTVInterface) {
		this.phillipsSmartTVInterface = phillipsSmartTVInterface;
	}

	// -------------------------------------------------------------------------
	// TargetSmartTVInterface implementation:

	public void connectToTV() {
		phillipsSmartTVInterface.connect();
	}

	public void disconnectTV() {
		phillipsSmartTVInterface.disconnect();
	}

	public void showMeny() {
		phillipsSmartTVInterface.menu();
	}

	public void startPlay(long startTime) {
		phillipsSmartTVInterface.startPlay(startTime);
	}

	public void ffw(short speed) {
		phillipsSmartTVInterface.ffw(speed);
	}

	public void rwn(short speed) {
		phillipsSmartTVInterface.rwn(speed);
	}

	public void connectToWifi(String wifiName) {
		phillipsSmartTVInterface.connectWifi(wifiName);
	}

	public void showWidget(String widgetID) {
		phillipsSmartTVInterface.showWidget(widgetID);
	}

	// -------------------------------------------------------------------------
}
