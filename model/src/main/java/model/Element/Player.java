package model.Element;

import model.Map;

/**
 * 
 * @author Geoffrey Keff
 *
 */
public class Player extends Living 
{
	private static String SPRITE = "PLAYER.jpg";

	/**
	 * @param sprite
	 */
	public Player() 
	{
		super(SPRITE);
	}


	/**
	 * delete the object
	 * @param x
	 * @param y
	 * @param map 
	 */
	public void destruction(int x, int y,Map map) 
	{
		death(x, y,map);
	}


	/**
	 * used to kill end the game when the player is dead
	 * @param x
	 * @param y
	 * @param map 
	 */
	public void death(int x, int y,Map map) 
	{
		map.setLose(true);
	}
	

	/**
	 * Determine the action when you walk on different kind of object
	 * @param x
	 * @param y
	 * @param direction
	 * @param map 
	 */
	public void walkOver(int x, int y, char direction,Map map)
	{
		death(x,y, map);	
	}

	/**
	 * Determine where the player move
	 * @param x
	 * @param y
	 * @param direction
	 * @param map  
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
	 * @param x
	 * @param y
	 * @param map
	 */
	public void moveUp(int x, int y,Map map) {
		map.getOnTheMapXY(x, y-1).walkOver(x,y,'u',map);

	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param map
	 */
	public void moveDown(int x, int y,Map map) {
		map.getOnTheMapXY(x, y+1).walkOver(x,y,'d',map);

	}


	/**
	 * 
	 * @param x
	 * @param y
	 * @param map
	 */
	public void moveLeft(int x, int y,Map map) {
		map.getOnTheMapXY(x-1, y).walkOver(x,y,'l',map);

	}

	/**
	 * 
	 * @param x
	 * @param y
	 * @param map
	 */
	public void moveRight(int x, int y,Map map) {
		map.getOnTheMapXY(x+1, y).walkOver(x,y,'r',map);

	}

}