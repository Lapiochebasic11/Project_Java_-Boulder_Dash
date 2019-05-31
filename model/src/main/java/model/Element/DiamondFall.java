package model.Element;

import model.Map;

public class DiamondFall extends Element {

	private static String SPRITE = "DIAMONDFALL.jpg";
	boolean movement = true;
	public DiamondFall() {
		super(SPRITE);
	}
	

	
	public boolean freePlace(int x, int y,Map map){
		if(map.getOnTheMapXY(x, y).getSprite()=="VOID.jpg" || (map.getOnTheMapXY(x, y).getSprite()=="PLAYER.jpg") || (map.getOnTheMapXY(x, y).getSprite()=="ENEMY.jpg")){
			return true;
			
		}
		else {
			return false;
		}
	}
	
	public void move(int x, int y, int direction,Map map) {
		
		System.out.println("YES");
		if (freePlace(x,y+1,map)){
			moveDown(x,y,map);
			}
		
		else {
			map.setOnTheMapXY(new Diamond(), x, y);
		}
		
		
		 if (freePlace(x-1, y,map) && freePlace(x-1, y+1,map) && ((map.getOnTheMapXY(x, y+1).getSprite()=="ROCK.jpg") || (map.getOnTheMapXY(x, y+1).getSprite()=="DIAMOND.jpg"))){
			moveLeft(x,y,map);
		}
		
		 if (freePlace(x+1, y,map) && freePlace(x+1, y+1,map) && ((map.getOnTheMapXY(x, y+1).getSprite()=="ROCK.jpg") || (map.getOnTheMapXY(x, y+1).getSprite()=="DIAMOND.jpg"))){
			moveRight(x,y,map);

		}
	}
	
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
