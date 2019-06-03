package  model.Element;

import model.Map;

/**
 * 
 * @author Geoffrey Keff
 * @version 1.0
 */
public class Enemy extends Element {

	private static String SPRITE = "ENEMY.jpg";	

	/**
	 * Constructor call
	 */
	public Enemy() {
		super(SPRITE);

	}

	/**
	 * Kill the enemy when it is destroyed
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call Map
	 */
	public void destruction(int x, int y, Map map) {
		map.setOnTheMapXY(new Empty(), x, y);
	}

	
	/**
	 * kill the enemy when he hurt something
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param direction implement direction
	 * @param map call Map
	 */

	public void walkOver(int x, int y, char direction, Map map) {
switch (direction){
		
		case 'r':
			x = x+1;
			
			break;
		
			case 'l':
			x = x-1;
			
			break;
		
		case 'u':
			y = y-1;
			
			break;
		
		case 'd':
			y = y+1;;
			
			break;
		}
		death(x,y, map);
	}

	/**
	 * Explode when the enemy dies
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call map
	 */
	public void death(int x, int y, Map map) {
		int i,j;
		
		for (i=0; i<3;i++){
			for(j=0; j<3;j++)
			{
				map.getOnTheMapXY(x-1+j, y-1+i).destruction(x-1+j, y-1+i,map);
				if (map.getOnTheMapXY(x-1+j, y-1+i).getSprite()=="VOID.jpg" || map.getOnTheMapXY(x-1+j, y-1+i).getSprite()=="ROCKFALL.jpg" )
				{
					map.setOnTheMapXY(new Diamond(),x-1+j, y-1+i);
					SoundBox.enemydie();
				}
				}
			} 
		}
	

	/**
	 * determine the conduct of the enemy
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param direction implement direction
	 * @param map call map
	 */
	public void move(int x, int y,int direction, Map map ) {
		
		System.out.println(direction);
		if (this.walk == 0){
		  
		
		switch (direction){
		
		case 0:
			moveRight(x, y, map);
			
			break;
		
			case 1:
			moveLeft(x, y, map);
			
			break;
		
		case 2:
			moveUp(x, y,map);
			
			break;
		
		case 3:
			moveDown(x, y,map);
			
			break;
		}
	}
	}

	/**
	 * check if the enemy can go on the box
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map call map
	 * @return the box is empty or not
	 */
	public boolean freePlace(int x, int y, Map map)
	{
		if(map.getOnTheMapXY(x, y).getSprite()=="VOID.jpg" || map.getOnTheMapXY(x, y).getSprite()=="PLAYER.jpg")
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	/**
	 *
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map implement map
	 */
	public void moveUp(int x, int y,Map map ) 
	{
		if (freePlace( x,  y-1, map))
		{
			map.getOnTheMapXY(x, y-1).walkOver(x, y,'u',map);
			this.walk = 1; 
		}
		else 
		{
			move(x, y, 3, map);
		}
	}

	
	
	/**
	 *
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map implement map
	 */
	public void moveDown(int x, int y,Map map) 
	{
		if (freePlace( x,  y+1, map))
		{
			map.getOnTheMapXY(x, y+1).walkOver(x, y,'d',map);
			this.walk = 1; 
		}
		else 
		{
			move(x, y, 0, map);
		}
	}

	

	/**
	 *
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map implement map
	 */
	public void moveLeft(int x, int y,Map map) 
	{
		if (freePlace( x-1,  y, map))
		{
			map.getOnTheMapXY(x-1, y).walkOver(x, y,'l',map);
			this.walk = 1; 
		}
		else 
		{			
			move(x, y, 2, map);
		}
	}

	
	
	/**
	 *
	 * @param x implement X axis
	 * @param y implement Y axis
	 * @param map implement map
	 */
	public void moveRight(int x, int y,Map map) {
		
		if (freePlace( x+1,  y, map))
		{
			map.getOnTheMapXY(x+1, y).walkOver(x, y,'r',map);
			this.walk = 1; 
		}
		else 
		{	
			move(x, y, 1, map);
		}
	}
	
}