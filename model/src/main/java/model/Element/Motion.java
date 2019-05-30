package model.Element;

import model.Map;



public abstract class Motion extends Element implements Moves {

	boolean movement = false;
	
	public Motion(String sprite ) {
		super(sprite);

	}
	
	public boolean freePlace(int x, int y,Map map){
		if(map.getOnTheMapXY(x, y).getSprite()=="VOID.jpg" || (map.getOnTheMapXY(x, y).getSprite()=="PLAYER.jpg"&& movement) || (map.getOnTheMapXY(x, y).getSprite()=="ENEMY.jpg" && movement)){
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public void move(int x, int y, int direction,Map map) {
		//System.out.println(map.getOnTheMapXY(x, y+1).getSprite());
		if (freePlace(x,y+1,map)){
			moveDown(x,y,map);
			movement = true;
			System.out.println(movement);
			
		}
		else{
			movement = false;
			
		}
		
		
		if (freePlace(x-1, y,map) && freePlace(x-1, y+1,map) && ((map.getOnTheMapXY(x, y+1).getSprite()=="ROCK.jpg") || (map.getOnTheMapXY(x, y+1).getSprite()=="DIAMOND.jpg"))){
			moveLeft(x,y,map);
		}
		
		if (freePlace(x+1, y,map) && freePlace(x+1, y+1,map) && ((map.getOnTheMapXY(x, y+1).getSprite()=="ROCK.jpg") || (map.getOnTheMapXY(x, y+1).getSprite()=="DIAMOND.jpg"))){
			moveRight(x,y,map);

		}
		
	}
	

	public void destruction(int x, int y,Map map) {
		map.setOnTheMapXY(new Empty(), x, y);
	}

	
	public void moveUp(int x, int y,Map map){
		//void
	}

	/**
	 *
	 * Launch the move to the down
	 * @param position and map pointer
	 */
	public void moveDown(int x, int y,Map map){
		map.getOnTheMapXY(x, y+1).walkOver(x, y, 'd',map);
	}

	/**
	 *
	 * Launch the move to the left
	 * @param position and map pointer
	 */
	public void moveLeft(int x, int y,Map map){
		map.getOnTheMapXY(x+1, y).walkOver(x, y, 'l',map);
	}

	/**
	 *
	 * Launch the move to the right
	 * @param position and map pointer
	 */
	public void moveRight(int x, int y,Map map){
		map.getOnTheMapXY(x-1, y).walkOver(x, y, 'r',map);
	}
	
	
}