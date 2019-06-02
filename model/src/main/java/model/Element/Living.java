package model.Element;

/**
 * 
 * @author Lilian Schneider
 *
 */
public abstract class Living extends Element {

	/**
	 * @param sprite
	 */
	public Living(String SPRITE) {
		super(SPRITE);
	}
/**
 * 
 * @param x
 * @param y
 * @param map
 */
	public void death(int x, int y, model.Map map) {
	}

}