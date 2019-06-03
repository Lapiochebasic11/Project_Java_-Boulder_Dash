package model.Element;

import model.Map;

/**
 * 
 * @author lilian Schneider
 * @version 1.0
 */
public class RockFall extends Element {

	private static String SPRITE = "ROCKFALL.jpg";
	boolean movement = true;
	
	/**
	 * Constructor call
	 */
	public RockFall() {
		super(SPRITE);
	}
	

	/**
	 * check if the rock can continue to fall
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 * @return if the box is able to receive the rock 
	 * 
	 */
	public boolean freePlace(int x, int y,Map map){
		if(map.getOnTheMapXY(x, y).getSprite()=="VOID.jpg" || (map.getOnTheMapXY(x, y).getSprite()=="PLAYER.jpg") || (map.getOnTheMapXY(x, y).getSprite()=="ENEMY.jpg")){
			return true;
			
		}
		else {
			return false;
		}
	}
	
	/**
	 * 
	 * 
	 *Defines in which direction the rock has to fall or if he has to stop falling
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 * @param direction implement direction
	 * 
	 */
	public void move(int x, int y, int direction,Map map) {
		
		System.out.println("YES");
		if (freePlace(x,y+1,map)){
			moveDown(x,y,map);
			}
		
		else {
			map.setOnTheMapXY(new Rock(), x, y);
		}
		
		
		 if (freePlace(x-1, y,map) && freePlace(x-1, y+1,map) && ((map.getOnTheMapXY(x, y+1).getSprite()=="ROCK.jpg") || (map.getOnTheMapXY(x, y+1).getSprite()=="DIAMOND.jpg"))){
			moveLeft(x,y,map);
		}
		
		 if (freePlace(x+1, y,map) && freePlace(x+1, y+1,map) && ((map.getOnTheMapXY(x, y+1).getSprite()=="ROCK.jpg") || (map.getOnTheMapXY(x, y+1).getSprite()=="DIAMOND.jpg"))){
			moveRight(x,y,map);

		}
	}
	
	/**
	 * 
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	
	public void moveDown(int x, int y,Map map){
		map.getOnTheMapXY(x, y+1).walkOver(x, y, 'd',map);
	}

	
/**
 * 
 * @param x implement X axis
 * @param y implement Y axis
 * @param map call Map
*/
	public void moveLeft(int x, int y,Map map){
		map.getOnTheMapXY(x-1, y).walkOver(x, y, 'l',map);
	}

/**
 * 
 * @param x implement X axis
 * @param y implement Y axis
 * @param map call Map
*/
	public void moveRight(int x, int y,Map map){
		map.getOnTheMapXY(x+1, y).walkOver(x, y, 'r',map);
	}
	
}
