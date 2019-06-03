package  model.Element;

import model.Map;

/**
 * 
 * @author Geoffrey Keff
 * @version 1.0
 */
public class Ground extends Element {

	private static String SPRITE = "SOIL.jpg";
	
	/*
	 * Constructor call
	 */
	public Ground() 
	{
		super(SPRITE);
	} 
	
	/**
	 * Determine when you walk on the ground
	 * @param position x
	 * @param position y
	 * @param map 
	 */
	public void walkOver(int x, int y, char direction,Map map) {
		switch (direction){
		case 'u':
			map.setOnTheMapXY(map.getOnTheMapXY(x, y),x,y-1);
			break;
		case 'd':
			map.setOnTheMapXY(map.getOnTheMapXY(x, y),x,y+1);
			break;
		case 'l':
			map.setOnTheMapXY(map.getOnTheMapXY(x, y),x-1,y);
			break;
		case 'r':
			map.setOnTheMapXY(map.getOnTheMapXY(x, y),x+1,y);
			break;
		}
			map.setOnTheMapXY(new Empty(), x, y);
		
	}
	
	/**
	 * Change the ground to empty
	 * @param position x
	 * @param position y
	 * @param map  
	 */
	public void destruction(int x, int y,Map map) {
		map.setOnTheMapXY(new Empty(), x, y);
	}
}