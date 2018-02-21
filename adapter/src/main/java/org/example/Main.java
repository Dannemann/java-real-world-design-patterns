package org.example;

import org.example.adapters.PhillipsAdapter;
import org.example.adapters.SamsungAdapter;
import org.example.adapters.SonyAdapter;
import org.example.adapters.TargetSmartTVInterface;

import com.thirdparty.libs.phillips.PhillipsSmartTV;
import com.thirdparty.libs.samsung.SamsungSmartTV;
import com.thirdparty.libs.sony.Connector;

/**
 * <p>This is the <b>client</b> UML actor.</p>
 */
public class Main {

	public static void main(String[] args) {
		// The old hard-coded way.
//		Connector sonyConnector = new Connector();
//		SonySmartTV sonyInterface = sonyConnector.connectToTV();
//		sonyInterface.connectToWifi("myPersonalWifi");
//		sonyInterface.openWidget("wifi.connected.notificator");
//		sonyInterface.play(0);

		// Connecting to a Sony smart TV with the new adapted way.
		executeDefaultActions(new SonyAdapter(new Connector()));

		// Connecting to a Phillips smart TV with the new adapted way.
		executeDefaultActions(new PhillipsAdapter(new PhillipsSmartTV()));

		// Connecting to a Samsung smart TV with the new adapted way.
		executeDefaultActions(new SamsungAdapter(new SamsungSmartTV()));
	}

	private static void executeDefaultActions(TargetSmartTVInterface smartTVInterface) {
		smartTVInterface.connectToTV();
		smartTVInterface.connectToWifi("myPersonalWifi");
		smartTVInterface.showWidget("wifi.connected.notificator");
		smartTVInterface.startPlay(0);
	}

}
