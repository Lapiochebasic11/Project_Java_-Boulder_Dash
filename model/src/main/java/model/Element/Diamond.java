package  model.Element;

import model.Map;
import model.Element.SoundBox;

/**
 * 
 * @author Lilian Schneider
 * @version 1.0
 */

public class Diamond extends Motion{

	private static String SPRITE = "DIAMOND.jpg";
	
/**
 * 
 * Constructor call
*/
	public Diamond() 
	{
		super(SPRITE);
	}

	/**
	 * 
	 * Determine when the player take a diamond
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param direction implement direction
	 * @param map implement map
	 */
	public void walkOver(int x, int y, char direction, Map map) 
	{

		if(map.getOnTheMapXY(x, y).getSprite()=="PLAYER.jpg") 
		{
		map.setScore(map.getScore() + 1);
		map.setOnTheMapXY(new Empty(), x, y);
		SoundBox.diamondget();
		
		switch (direction)
			{
			case 'u':
				map.setOnTheMapXY(new Player(), x, y-1);
				break;
			case 'd':
				map.setOnTheMapXY(new Player(), x, y+1);
				break;
			case 'l':
				map.setOnTheMapXY(new Player(), x-1, y);
				break;
			case 'r':
				map.setOnTheMapXY(new Player(), x+1, y);
				break;
			
			}
		}
		
	}
}
