package my.application.adapters;

import com.smarttv.libs.samsung.SamsungSmartTvApi;

/**
 * <p>Samsung adapter.</p>
 * <p>This is the <b>adapter</b> UML actor.</p>
 */
public class SamsungAdapter implements TargetSmartTvInterface {

	private final SamsungSmartTvApi samsungSmartTvApi = new SamsungSmartTvApi();

	// TargetSmartTvInterface implementation:

	public void turnTvOn() {
		samsungSmartTvApi.turnOn();
	}

	public void turnTvOff() {
		samsungSmartTvApi.turnOff();
	}

	public void showMenu() {
		samsungSmartTvApi.openMenu();
	}

	public void startPlay(long startTime) {
		samsungSmartTvApi.startPlayback(startTime);
	}

	public void ffw(short speed) {
		samsungSmartTvApi.ffwPlayback(speed);
	}

	public void rwn(short speed) {
		samsungSmartTvApi.rwnPlayback(speed);
	}

	public void connectToWifi(String wifiName) {
		samsungSmartTvApi.wifiConn(wifiName);
	}

	public void showWidget(String widgetID) {
		samsungSmartTvApi.showWidget(widgetID);
	}

}
