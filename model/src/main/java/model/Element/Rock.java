package model.Element;

import model.Map;

/**
 * 
 * @author lilian Schneider
 * @version 1.0
 */
public class Rock extends Motion {

	private static String SPRITE = "ROCK.jpg";

	/**
	 * Constructor call
	 */
	public Rock() {
		super(SPRITE);
	}


	/**
	 * 
	 * Determine when the player push the rock 
	 * @param x
	 * @param y
	 * @param direction
	 * @param map 
	 */
	public void walkOver(int x, int y, char direction,Map map) {

		
		
		switch (direction){
		
		case 'r':
			if(map.getOnTheMapXY(x+1, y+1).getSprite()!="VOID.jpg" && map.getOnTheMapXY(x+2, y).getSprite()=="VOID.jpg"){
			map.getOnTheMapXY(x+2, y).walkOver(x+1, y, direction,map);
			map.getOnTheMapXY(x+1, y).walkOver(x, y, direction,map);
			}
			break;
			
		case 'l':
			if(map.getOnTheMapXY(x-1, y+1).getSprite()!="VOID.jpg" && map.getOnTheMapXY(x-2, y).getSprite()=="VOID.jpg"){
				map.getOnTheMapXY(x-2, y).walkOver(x-1, y, direction,map);
				map.getOnTheMapXY(x-1, y).walkOver(x, y, direction,map);
				}
			break;
			
		}
	}

	
	
}