package model.Element;

import model.Map;

/**
 * 
 * @author Geoffrey Keff
 * @version 1.0
 */
public class Empty extends Element{

    public static String SPRITE = "VOID.jpg";
	/**
	 * @param sprite
	 */
    Empty(){
        super(SPRITE);
}

    /**
     * able to walk on the empty box 
     * @param position x
     * @param position y
     * @param direction
     * @param map
     */
    public void walkOver(int x, int y, char direction,Map map) 
    {
        switch (direction)
        {
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
    
}