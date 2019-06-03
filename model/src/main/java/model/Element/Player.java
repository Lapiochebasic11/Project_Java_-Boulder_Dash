package model.Element;

import model.Map;

/**
 * 
 * @author Geoffrey Keff
 * @version 1.0
 */
public class Player extends Element 
{
	private static String SPRITE = "PLAYER.jpg";

	/**
	 * Constructor call
	 */
	public Player() 
	{
		super(SPRITE);
	}


	/**
	 * delete the object
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	public void destruction(int x, int y,Map map) 
	{
		death(x, y,map);
	}


	/**
	 * used to kill end the game when the player is dead
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	public void death(int x, int y,Map map) 
	{
		map.setLose(true);
	}
	

	/**
	 * Determine the action when you walk on different kind of object
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 * @param direction implement direction 
	 */
	public void walkOver(int x, int y, char direction,Map map)
	{
		death(x,y, map);	
	}

	/**
	 * Determine where the player move
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 * @param direction implement direction 
	 */
	public void move(int x, int y,int direction,Map map) 
	{		
		switch (direction)
		{
			case 38:
				moveUp(x, y,map);
				break;
			case 40:
				moveDown(x, y,map);
				break;
			case 39:
				moveRight(x, y,map);
				break;
			case 37:
				moveLeft(x, y,map);
				break;
		}
	}

	/**
	 * 
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	public void moveUp(int x, int y,Map map) {
		map.getOnTheMapXY(x, y-1).walkOver(x,y,'u',map);

	}

	/**
	 * 
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	public void moveDown(int x, int y,Map map) {
		map.getOnTheMapXY(x, y+1).walkOver(x,y,'d',map);

	}


	/**
	 * 
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	public void moveLeft(int x, int y,Map map) {
		map.getOnTheMapXY(x-1, y).walkOver(x,y,'l',map);

	}

	/**
	 * 
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	public void moveRight(int x, int y,Map map) {
		map.getOnTheMapXY(x+1, y).walkOver(x,y,'r',map);

	}

}