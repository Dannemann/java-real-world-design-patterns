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
        System.out.println("NOT USING AN ADAPTER.");
        // Note that we are hard-coding brand-specific methods like connectToWifi()
        // and openWidget(). We'll need to call brand-specific methods for all other
        // TV brands used in the project. Keep in mind that Samsung and Philips have
        // different classes and method names for Wi-Fi connectivity and widget
        // management.

        Connector sonyConnector = new Connector();
        SonySmartTv sonyInterface = sonyConnector.turnSonyTvOn();
        sonyInterface.connectToWifi(userSelectedWifi());
        sonyInterface.openWidget("wifi.connected.notificator"); // Sony specific widget name.
        sonyInterface.play(0);

        PhillipsSmartTv phillipsSmartTv = new PhillipsSmartTv();
        phillipsSmartTv.on();
        phillipsSmartTv.connectWifi(userSelectedWifi());
        phillipsSmartTv.showWidget("wifinotifier"); // Phillips specific widget name.
        phillipsSmartTv.startPlay(0);

        SamsungSmartTv samsungSmartTv = new SamsungSmartTv();
        samsungSmartTv.turnOn();
        samsungSmartTv.wifiConn(userSelectedWifi());
        samsungSmartTv.showWidget("wifi.notificator"); // Samsung specific widget name.
        samsungSmartTv.startPlayback(0);


        System.out.println("\n\nWITH AN ADAPTER.");
        // With the Adapter pattern we abstract all the operations that are common to
        // all smart TVs. Now, we do not need to hard-code vendor specific
        // implementations because they are all hidden by TargetSmartTvInterface.
        // BUT REMEMBER: ONLY use the Adapter pattern if you have multiple different
        // implementations of the same logical operations, as seen with smart TVs.
        // That's what the Adapter pattern is about.

        SonyAdapter sonyAdapter = new SonyAdapter(new Connector());
        connectWifiAndPlay(sonyAdapter, "wifi.connected.notificator");

        PhillipsAdapter phillipsAdapter = new PhillipsAdapter(new PhillipsSmartTv());
        connectWifiAndPlay(phillipsAdapter, "wifinotifier");

        SamsungAdapter samsungAdapter = new SamsungAdapter(new SamsungSmartTv());
        connectWifiAndPlay(samsungAdapter, "wifi.notificator");
    }

    // With the Adapter pattern, we can create generic methods like this that will
    // execute a sequence of operations independently of the smart TV brand being
    // used.
    private static void connectWifiAndPlay(TargetSmartTvInterface smartTVInterface, String wifiNotificationWidgetId) {
        smartTVInterface.turnTvOn();
        smartTVInterface.connectToWifi(userSelectedWifi());
        smartTVInterface.showWidget(wifiNotificationWidgetId);
        smartTVInterface.startPlay(0);
    }

    /**
     * Imagine this method is used to retrieve the name of the Wi-Fi network to connect to.
     */
    private static String userSelectedWifi() {
        return "anEssid";
    }

}
