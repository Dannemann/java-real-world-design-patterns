package my.application.adapters;

import com.smarttv.libs.samsung.SamsungSmartTv;

/**
 * <p>Samsung adapter.</p>
 * <p>This is the <b>adapter</b> UML actor.</p>
 */
public class SamsungAdapter implements TargetSmartTvInterface {

	private final SamsungSmartTv samsungSmartTv;

	public SamsungAdapter(SamsungSmartTv samsungSmartTv) {
		this.samsungSmartTv = samsungSmartTv;
	}

	// TargetSmartTvInterface implementation:

	public void turnTvOn() {
		samsungSmartTv.turnOn();
	}

	public void turnTvOff() {
		samsungSmartTv.turnOff();
	}

	public void showMenu() {
		samsungSmartTv.openMenu();
	}

	public void startPlay(long startTime) {
		samsungSmartTv.startPlayback(startTime);
	}

	public void ffw(short speed) {
		samsungSmartTv.ffwPlayback(speed);
	}

	public void rwn(short speed) {
		samsungSmartTv.rwnPlayback(speed);
	}

	public void connectToWifi(String wifiName) {
		samsungSmartTv.wifiConn(wifiName);
	}

	public void showWidget(String widgetID) {
		samsungSmartTv.showWidget(widgetID);
	}

}
