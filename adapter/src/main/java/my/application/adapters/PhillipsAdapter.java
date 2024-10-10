package my.application.adapters;

import com.smarttv.libs.phillips.PhillipsSmartTvApi;

/**
 * <p>Phillips adapter.</p>
 * <p>This is the <b>adapter</b> UML actor.</p>
 */
public class PhillipsAdapter implements TargetSmartTvInterface {

	private final PhillipsSmartTvApi phillipsSmartTvApi = new PhillipsSmartTvApi();

	// TargetSmartTvInterface implementation:

	public void turnTvOn() {
		phillipsSmartTvApi.on();
	}

	public void turnTvOff() {
		phillipsSmartTvApi.off();
	}

	public void showMenu() {
		phillipsSmartTvApi.menu();
	}

	public void startPlay(long startTime) {
		phillipsSmartTvApi.startPlay(startTime);
	}

	public void ffw(short speed) {
		phillipsSmartTvApi.ffw(speed);
	}

	public void rwn(short speed) {
		phillipsSmartTvApi.rwn(speed);
	}

	public void connectToWifi(String wifiName) {
		phillipsSmartTvApi.connectWifi(wifiName);
	}

	public void showWidget(String widgetID) {
		phillipsSmartTvApi.showWidget(widgetID);
	}

}
