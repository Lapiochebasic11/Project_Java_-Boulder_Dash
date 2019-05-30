package model.Element;

import model.Map;

public class Empty extends Element{

    public static String SPRITE = "VOID.jpg";

    Empty(){
        super(SPRITE);
}

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
    /**
     * Put a Void when a ground element is destroyed
     * @param position and map pointer
     *
     */
    public void destruction(int x, int y,Map map) {
        map.setOnTheMapXY(new Empty(), x, y);
    }
}