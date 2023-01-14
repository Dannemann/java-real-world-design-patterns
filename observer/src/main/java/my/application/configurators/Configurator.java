package my.application.configurators;

import java.util.Map;

/**
 * This is the <b>observer/subscriber</b> UML actor interface.
 */
public interface Configurator {

	void update(Map newSettings);

}
