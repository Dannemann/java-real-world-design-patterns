package my.application;

import com.maps.lib.Gps;
import com.maps.lib.Location;
import com.maps.lib.Map;

/**
 * <p>This class will be our facade to the complexity and boilerplate of the maps
 * library. It will be a simpler and unique point of access to the API.</p>
 * <p>This is the <b>facade</b> UML actor.</p>
 */
public class MapsFacade {

	private Map map = new Map();
	private Location location = new Location();
	private Gps gps = new Gps();

	// Imagine that both methods below are the only ones we need for our
	// application. One to find the location and another one to render maps. We
	// don't want the complexity from Map, Gps, and Location classes all over our
	// project. We only need a simpler interface to handle all the complexity and
	// decoupling from these objects.

	public Object findLocation() {
		// Complex code to find the location.
		map.method1(4440, "qwerty");
		gps.method2();
		map.method4(true);
		location.method7(false, 44L, false);
		return location.method3();
	}

	public Object renderMap() {
		// Complex code to render a map.
		gps.method2();
		gps.method1((byte) 4);
		map.method1(4440, "qwerty");
		location.method7(false, 44L, false);
		location.method5();
		map.method4(true);
		return map.method3();
	}

}
