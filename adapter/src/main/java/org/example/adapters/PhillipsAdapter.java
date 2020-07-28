package org.example.adapters;

import com.thirdparty.libs.phillips.PhillipsSmartTv;

/**
 * <p>Phillips adapter.</p>
 * <p>This is the <b>adapter</b> UML actor.</p>
 */
public class PhillipsAdapter implements TargetSmartTvInterface {

	// -------------------------------------------------------------------------
	// Fields:

	private final PhillipsSmartTv phillipsSmartTv;

	// -------------------------------------------------------------------------
	// Constructors:

	public PhillipsAdapter(PhillipsSmartTv phillipsSmartTv) {
		this.phillipsSmartTv = phillipsSmartTv;
	}

	// -------------------------------------------------------------------------
	// TargetSmartTvInterface implementation:

	public void turnTvOn() {
		phillipsSmartTv.on();
	}

	public void turnTvOff() {
		phillipsSmartTv.off();
	}

	public void showMenu() {
		phillipsSmartTv.menu();
	}

	public void startPlay(long startTime) {
		phillipsSmartTv.startPlay(startTime);
	}

	public void ffw(short speed) {
		phillipsSmartTv.ffw(speed);
	}

	public void rwn(short speed) {
		phillipsSmartTv.rwn(speed);
	}

	public void connectToWifi(String wifiName) {
		phillipsSmartTv.connectWifi(wifiName);
	}

	public void showWidget(String widgetID) {
		phillipsSmartTv.showWidget(widgetID);
	}

	// -------------------------------------------------------------------------
}
