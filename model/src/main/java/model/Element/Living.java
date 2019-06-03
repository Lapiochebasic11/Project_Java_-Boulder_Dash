package model.Element;

/**
 * 
 * @author Geoffrey Keff
 * @version 1.0
 */
public abstract class Living extends Element {

	/**
	 * Constructor call
	 * @param SPRITE implement sprite
	 */
	public Living(String SPRITE) 
	{
		super(SPRITE);
	}
/**
 * 
 * @param x implement X axis
 * @param y implement Y axis
 * @param map call Map
 */
	public void death(int x, int y, model.Map map) {
	}

}