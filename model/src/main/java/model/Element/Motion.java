package model.Element;

import model.Map;

/**
 * 
 * @author Lilian Schneider
 * @version 1.0
 */

public abstract class Motion extends Element{

		boolean movement = false;
		/**
		 * Constructor call
		 * @param sprite implement sprite
		 */
	public Motion(String sprite) {
		super(sprite);

	}
	
	/**
	 * check if the object can continue to fall
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 * @return if the box is able to receive the object 
	 * 
	 */
	public boolean freePlace(int x, int y,Map map){
		if(map.getOnTheMapXY(x, y).getSprite()=="VOID.jpg" || (map.getOnTheMapXY(x, y).getSprite()=="PLAYER.jpg" && movement) || (map.getOnTheMapXY(x, y).getSprite()=="ENEMY.jpg" && movement)){
			return true;
			
		}
		else {
			return false;
		}
	}

	/**
	 *Defines in which direction the object has to fall or if he has to stop falling
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 * @param direction implement direction
	 * 
	 */
	public void move(int x, int y, int direction,Map map) {

		if (freePlace(x,y+1,map)){
			moveDown(x,y,map);
		}
		
		else 
		{
		
		}
		
		
		 if (freePlace(x-1, y,map) && freePlace(x-1, y+1,map) && ((map.getOnTheMapXY(x, y+1).getSprite()=="ROCK.jpg") || (map.getOnTheMapXY(x, y+1).getSprite()=="DIAMOND.jpg"))){
			moveLeft(x,y,map);
		}
		
		 if (freePlace(x+1, y,map) && freePlace(x+1, y+1,map) && ((map.getOnTheMapXY(x, y+1).getSprite()=="ROCK.jpg") || (map.getOnTheMapXY(x, y+1).getSprite()=="DIAMOND.jpg"))){
			moveRight(x,y,map);

		}

		
	}
	
	
	/**
	 * delete the object
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map 
	 */
	public void destruction(int x, int y,Map map) {
		map.setOnTheMapXY(new Empty(), x, y);
	}
	/**
	 * this kind of object can't go up but we have to keep it cause of the interfaces
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	 
	public void moveUp(int x, int y,Map map){
		//void
	}

	/**
	 *
	 * Launch the move to the down and create the right object
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	public void moveDown(int x, int y,Map map){
		if (map.getOnTheMapXY(x, y).getSprite()=="ROCK.jpg")
		{
		map.setOnTheMapXY(new RockFall(), x, y);
		}
		else {
			map.setOnTheMapXY(new DiamondFall(), x, y);
		}
	}

	/**
	 *
	 * Launch the move to the left and create the right object
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	public void moveLeft(int x, int y,Map map){
		if (map.getOnTheMapXY(x, y).getSprite()=="ROCK.jpg")
		{
		map.setOnTheMapXY(new RockFall(), x, y);
		}
		else {
			map.setOnTheMapXY(new DiamondFall(), x, y);
		}
	}

	/**
	 *
	 * Launch the move to the right and create the right object
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	public void moveRight(int x, int y,Map map){
		if (map.getOnTheMapXY(x, y).getSprite()=="ROCK.jpg")
		{
		map.setOnTheMapXY(new RockFall(), x, y);
		}
		else {
			map.setOnTheMapXY(new DiamondFall(), x, y);
		}
	}
	
	
}