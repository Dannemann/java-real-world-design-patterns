package org.example.adapters;

import com.thirdparty.libs.samsung.SamsungSmartTV;

/**
 * <p>Samsung adapter.</p>
 * <p>This is the <b>adapter</b> UML actor.</p>
 */
public class SamsungAdapter implements TargetSmartTVInterface {

	// -------------------------------------------------------------------------
	// Fields:

	private final SamsungSmartTV samsungSmartTVInterface;

	// -------------------------------------------------------------------------
	// Constructors:

	public SamsungAdapter(SamsungSmartTV samsungSmartTVInterface) {
		this.samsungSmartTVInterface = samsungSmartTVInterface;
	}

	// -------------------------------------------------------------------------
	// TargetSmartTVInterface implementation:

	public void connectToTV() {
		samsungSmartTVInterface.conn();
	}

	public void disconnectTV() {
		samsungSmartTVInterface.disconn();
	}

	public void showMeny() {
		samsungSmartTVInterface.openMenu();
	}

	public void startPlay(long startTime) {
		samsungSmartTVInterface.startPlayback(startTime);
	}

	public void ffw(short speed) {
		samsungSmartTVInterface.ffwPlayback(speed);
	}

	public void rwn(short speed) {
		samsungSmartTVInterface.rwnPlayback(speed);
	}

	public void connectToWifi(String wifiName) {
		samsungSmartTVInterface.wifiConn(wifiName);
	}

	public void showWidget(String widgetID) {
		samsungSmartTVInterface.showWidget(widgetID);
	}

	// -------------------------------------------------------------------------
}
