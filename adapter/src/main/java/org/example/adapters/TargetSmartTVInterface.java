package org.example.adapters;

/**
 * <p>The target interface.</p>
 * <p>This is the <b>target</b> UML actor.</p>
 */
public interface TargetSmartTVInterface {

	public void connectToTV();

	public void disconnectTV();

	public void showMeny();

	public void startPlay(long startTime);

	public void ffw(short speed);

	public void rwn(short speed);

	public void connectToWifi(String wifiName);

	public void showWidget(String widgetID);

}
