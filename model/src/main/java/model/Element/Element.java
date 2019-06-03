package model.Element;

import model.Map;

/**
 * 
 * @author Lilian Schneider
 * @version 1.0
 */
public abstract class Element{

	String sprite;
	int walk = 0;

	/**
	 * @param sprite
	 * Constructor call
	 */
	public Element(String sprite) {
		this.sprite = sprite;

	}
/**
 * @return String
 */
	public String getSprite() {
		return this.sprite;
	}

	/**
	 * use to delete a Object
	 * @param position x 
	 * @param position y
	 * @param map
	 */
	public void destruction(int x, int y, Map map) {

	}

	/**
	 * use if object are at the same position 
	 * @param position x 
	 * @param position y
	 * @param map 
	 */
	
	public void walkOver(int x, int y, char direction, Map map) {

	}

	/**
	 * use when object move
	 * @param position x 
	 * @param position y
	 * @param map
	 */
	public void move(int x, int y, int direction, Map map) {

	}
	/**
	 * delete a Object
	 * @return 
	 * 
	 * 
	 */
	
	public int isWalk() {
		return walk;
	}

	public void setWalk(int walk) {
		this.walk = walk;
	}

}