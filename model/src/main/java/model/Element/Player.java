package model.Element;

import model.Map;



public class Player extends Living {

	private static String SPRITE = "PLAYER.jpg";

	public Player() {
		super(SPRITE);

	}


	public void destruction(int x, int y,Map map) {
		death(x, y,map);
	}


	public void death(int x, int y,Map map) 
	{
		map.setLose(true);
	}
	

	
	public void walkOver(int x, int y, char direction,Map map){
	
		death(x,y, map);
		
	}

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

	public void moveUp(int x, int y,Map map) {
		map.getOnTheMapXY(x, y-1).walkOver(x,y,'u',map);

	}

	public void moveDown(int x, int y,Map map) {
		map.getOnTheMapXY(x, y+1).walkOver(x,y,'d',map);

	}


	public void moveLeft(int x, int y,Map map) {
		map.getOnTheMapXY(x-1, y).walkOver(x,y,'l',map);

	}

	public void moveRight(int x, int y,Map map) {
		map.getOnTheMapXY(x+1, y).walkOver(x,y,'r',map);

	}

}