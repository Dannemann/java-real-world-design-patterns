package my.application;

import com.smarttv.libs.phillips.PhillipsSmartTvApi;
import com.smarttv.libs.samsung.SamsungSmartTvApi;
import com.smarttv.libs.sony.Connector;
import com.smarttv.libs.sony.SonySmartTvApi;
import my.application.adapters.PhillipsAdapter;
import my.application.adapters.SamsungAdapter;
import my.application.adapters.SonyAdapter;
import my.application.adapters.TargetSmartTvInterface;

/**
 * This is the <b>client</b> UML actor.
 */
public class Main {

	public static void main(String[] args) {
		// With the Adapter pattern we abstract all the operations that are common to
		// all smart TVs. Therefore, we do not need to hard-code any vendor specific
		// implementations because they are all hidden by TargetSmartTvInterface.
		// BUT REMEMBER: ONLY use the Adapter pattern if you have multiple different
		// implementations of the same logical operations, as seen with smart TVs.

		PhillipsAdapter phillipsAdapter = new PhillipsAdapter(new PhillipsSmartTvApi());
		connectWifiAndPlay(phillipsAdapter, "some.phillips.widget");

		SamsungAdapter samsungAdapter = new SamsungAdapter(new SamsungSmartTvApi());
		connectWifiAndPlay(samsungAdapter, "some.samsung.widget");

		SonyAdapter sonyAdapter = new SonyAdapter(new Connector());
		connectWifiAndPlay(sonyAdapter, "some.sony.widget");
	}

	// With the Adapter pattern, we can create generic methods that will execute a
	// sequence of operations independently of the smart TV brand being used.
	private static void connectWifiAndPlay(TargetSmartTvInterface adapter, String widgetId) {
		adapter.turnTvOn();
		adapter.connectToWifi(userSelectedWifi());
		adapter.showWidget(widgetId);
		adapter.startPlay(0);
	}

	private static void withoutTheAdapters() {
		// Notice that we are hard-coding brand-specific methods like connectToWifi()
		// and openWidget(). We'll need to call brand-specific methods for all other
		// TV brands used in the project.

		PhillipsSmartTvApi phillipsSmartTvApi = new PhillipsSmartTvApi();
		phillipsSmartTvApi.on();
		phillipsSmartTvApi.connectWifi(userSelectedWifi());
		phillipsSmartTvApi.showWidget("some.phillips.widget");
		phillipsSmartTvApi.startPlay(0);

		SamsungSmartTvApi samsungSmartTvApi = new SamsungSmartTvApi();
		samsungSmartTvApi.turnOn();
		samsungSmartTvApi.wifiConn(userSelectedWifi());
		samsungSmartTvApi.showWidget("some.samsung.widget");
		samsungSmartTvApi.startPlayback(0);

		Connector sonyConnector = new Connector();
		SonySmartTvApi sonyInterface = sonyConnector.turnSonyTvOn();
		sonyInterface.connectToWifi(userSelectedWifi());
		sonyInterface.openWidget("some.sony.widget");
		sonyInterface.play(0);
	}

	/**
	 * Imagine this method is used to retrieve the name of the Wi-Fi network to connect to.
	 */
	private static String userSelectedWifi() {
		return "someEssid";
	}

}
