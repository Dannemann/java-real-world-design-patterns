package org.example;

import org.example.adapters.PhillipsAdapter;
import org.example.adapters.SamsungAdapter;
import org.example.adapters.SonyAdapter;
import org.example.adapters.TargetSmartTvInterface;

import com.thirdparty.libs.phillips.PhillipsSmartTv;
import com.thirdparty.libs.samsung.SamsungSmartTv;
import com.thirdparty.libs.sony.Connector;
import com.thirdparty.libs.sony.SonySmartTv;

/**
 * This is the <b>client</b> UML actor.
 */
public class Main {

	public static void main(String[] args) {
		// ----------------------------------
		// - NOT USING THE ADAPTER PATTERN. -
		// ----------------------------------
		System.out.println("NOT USING THE ADAPTER PATTERN.");
		// Notice that we are hard-coding methods specific to a Sony smart TV like "connectToWifi" and 
		// "openWidget". We will need to hard-code specific methods of all other brands that we 
		// need in the project. Remember that Samsung and Phillips have different classes and method 
		// names to connect to a Wi-Fi and to open a widget. We will end up with a lot of boilerplate  
		// code that will have the same sequence of actions only with different classes/method names.

		Connector sonyConnector = new Connector();
		SonySmartTv sonyInterface = sonyConnector.turnSonyTvOn();
		sonyInterface.connectToWifi("myPersonalWifi");
		sonyInterface.openWidget("wifi.connected.notificator"); // Sony specific widget name.
		sonyInterface.play(0);

		PhillipsSmartTv phillipsSmartTv = new PhillipsSmartTv();
		phillipsSmartTv.on();
		phillipsSmartTv.connectWifi("myPersonalWifi");
		phillipsSmartTv.showWidget("wifinotifier"); // Phillips specific widget name.
		phillipsSmartTv.startPlay(0);

		SamsungSmartTv samsungSmartTv = new SamsungSmartTv();
		samsungSmartTv.turnOn();
		samsungSmartTv.wifiConn("myPersonalWifi");
		samsungSmartTv.showWidget("wifi.notificator"); // Samsung specific widget name.
		samsungSmartTv.startPlayback(0);


		// -----------------------------
		// - WITH THE ADAPTER PATTERN. -
		// -----------------------------
		System.out.println("\n\nWITH THE ADAPTER PATTERN.");
		// With the Adapter pattern we abstract all the operations that are common to all smart TVs.
		// Now, we do not need to hard-code vendor specific implementations because they are all 
		// hidden by TargetSmartTvInterface. We end up with no boilerplate, no vendor specific 
		// hard-coding and with a very scalable and organized code.
		// BUT REMEMBER: ONLY use the Adapter pattern if you have multiple different implementations
		// of the same logical operations, like smart TVs do. All smart TVs turn on, turn off,
		// open menus, connect to Wi-Fi, have widgets, play video and etc. All the same logical operations 
		// with different vendor specific implementations.

		SonyAdapter sonyAdapter = new SonyAdapter(new Connector());
		connectWifiAndPlay(sonyAdapter, "wifi.connected.notificator");

		PhillipsAdapter phillipsAdapter = new PhillipsAdapter(new PhillipsSmartTv());
		connectWifiAndPlay(phillipsAdapter, "wifinotifier");

		SamsungAdapter samsungAdapter = new SamsungAdapter(new SamsungSmartTv());
		connectWifiAndPlay(samsungAdapter, "wifi.notificator");
	}

	// With the Adapter pattern, we can create generic methods like this that will execute a sequence of
	// operations independently of the smart TV brand being used.
	private static void connectWifiAndPlay(TargetSmartTvInterface smartTVInterface, String wifiNotificationWidgetId) {
		smartTVInterface.turnTvOn();
		smartTVInterface.connectToWifi("myPersonalWifi");
		smartTVInterface.showWidget(wifiNotificationWidgetId);
		smartTVInterface.startPlay(0);
	}

}
