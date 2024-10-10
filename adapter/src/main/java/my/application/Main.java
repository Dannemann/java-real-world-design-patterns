package my.application;

import com.smarttv.libs.phillips.PhillipsSmartTv;
import com.smarttv.libs.samsung.SamsungSmartTv;
import com.smarttv.libs.sony.Connector;
import com.smarttv.libs.sony.SonySmartTv;
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

		PhillipsAdapter phillipsAdapter = new PhillipsAdapter(new PhillipsSmartTv());
		connectWifiAndPlay(phillipsAdapter, "some.phillips.widget");

		SamsungAdapter samsungAdapter = new SamsungAdapter(new SamsungSmartTv());
		connectWifiAndPlay(samsungAdapter, "some.samsung.widget");

		SonyAdapter sonyAdapter = new SonyAdapter(new Connector());
		connectWifiAndPlay(sonyAdapter, "some.sony.widget");


		// --- NOT USING ADAPTERS ---
		// Notice that we are hard-coding brand-specific methods like connectToWifi()
		// and openWidget(). We'll need to call brand-specific methods for all other
		// TV brands used in the project.

		PhillipsSmartTv phillipsSmartTv = new PhillipsSmartTv();
		phillipsSmartTv.on();
		phillipsSmartTv.connectWifi(userSelectedWifi());
		phillipsSmartTv.showWidget("some.phillips.widget");
		phillipsSmartTv.startPlay(0);

		SamsungSmartTv samsungSmartTv = new SamsungSmartTv();
		samsungSmartTv.turnOn();
		samsungSmartTv.wifiConn(userSelectedWifi());
		samsungSmartTv.showWidget("some.samsung.widget");
		samsungSmartTv.startPlayback(0);

		Connector sonyConnector = new Connector();
		SonySmartTv sonyInterface = sonyConnector.turnSonyTvOn();
		sonyInterface.connectToWifi(userSelectedWifi());
		sonyInterface.openWidget("some.sony.widget");
		sonyInterface.play(0);
	}

	// With the Adapter pattern, we can create generic methods that will execute a
	// sequence of operations independently of the smart TV brand being used.
	private static void connectWifiAndPlay(TargetSmartTvInterface adapter, String widgetId) {
		adapter.turnTvOn();
		adapter.connectToWifi(userSelectedWifi());
		adapter.showWidget(widgetId);
		adapter.startPlay(0);
	}

	/**
	 * Imagine this method is used to retrieve the name of the Wi-Fi network to connect to.
	 */
	private static String userSelectedWifi() {
		return "someEssid";
	}

}
