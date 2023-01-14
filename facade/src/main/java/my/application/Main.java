package my.application;

/**
 * <p>Imagine you are writing an application that shows a map in some of your
 * screens. Unfortunately, your company choose a cumbersome maps library full of
 * complexity and boilerplate code. Also, you only need a few of the methods
 * provided by some of the classes. And as you do not want to couple these in
 * the source code of your screens, you choose to write a class with all this
 * complexity encapsulated in a simpler interface. This is the Facade design
 * pattern.</p>
 * <p>This is the <b>client</b> UML actor.</p>
 */
public class Main {

	public static void main(String[] args) {
		// Instead of coupling the maps library complexity all over our code, 
		// we use our simpler Facade to handle maps and locations.
		MapsFacade mapsFacade = new MapsFacade();
		Object location = mapsFacade.findLocation();
		Object map = mapsFacade.renderMap();
	}

}
