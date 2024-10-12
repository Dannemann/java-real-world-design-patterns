package my.application.adapters;

import com.smarttv.libs.sony.Connector;
import com.smarttv.libs.sony.SonySmartTvApi;

/**
 * <p>Sony adapter.</p>
 * <p>This is the <b>adapter</b> UML actor.</p>
 */
public class SonyAdapter implements TargetSmartTvInterface {

	private final Connector sonyConnector;

	private SonySmartTvApi sonySmartTvApi;

	public SonyAdapter(Connector sonyConnector) {
		this.sonyConnector = sonyConnector;
	}

	// TargetSmartTvInterface implementation:

	public void turnTvOn() {
		sonySmartTvApi = sonyConnector.turnSonyTvOn(); // Populates sonySmartTvApi.
	}

	public void turnTvOff() {
		sonyConnector.turnSonyTvOff();
	}

	public void showMenu() {
		sonySmartTvApi.openMenu();
	}

	public void startPlay(long startTime) {
		sonySmartTvApi.play(startTime);
	}

	public void ffw(short speed) {
		sonySmartTvApi.fastForwardPlayback(speed);
	}

	public void rwn(short speed) {
		sonySmartTvApi.rewindPlayback(speed);
	}

	public void connectToWifi(String wifiName) {
		sonySmartTvApi.connectToWifi(wifiName);
	}

	public void showWidget(String widgetID) {
		sonySmartTvApi.openWidget(widgetID);
	}

}
