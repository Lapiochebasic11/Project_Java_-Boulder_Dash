package model.Element;

/**
 * 
 * @author Geoffrey Keff
 * @version 1.0
 */
public abstract class Living extends Element {

	/**
	 * Constructor call
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