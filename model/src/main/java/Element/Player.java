package Element;

import model.Map;

public class Player extends ElementMobile {
	

	Player(){
		sprite = "Player.jpg";
	}
	
	public void dead(int x, int y,Map map) {
		map.setOnTheMapXY(new Empty(), x, y);
		map.setLose(true);
	
}
	public void walk(int x, int y, Map map) {
		dead(x,y,map);
		
	}
	
	public void moveUp(int x, int y,Map map) {
		map.getOnTheMapXY(x, y-1).walk(x,y,'u',map);

	}

	/**
	 *
	 * Launch the move to the down
	 * @param position and map pointer
	 */
	public void moveDown(int x, int y,Map map) {
		map.getOnTheMapXY(x, y+1).walk(x,y,'d',map);

	}

	/**
	 *
	 * Launch the move to the left
	 * @param position and map pointer
	 */
	public void moveLeft(int x, int y,Map map) {
		map.getOnTheMapXY(x-1, y).walk(x,y,'l',map);

	}

	/**
	 *
	 * Launch the move to the right
	 * @param position and map pointer
	 */
	public void moveRight(int x, int y,Map map) {
		map.getOnTheMapXY(x+1, y).walk(x,y,'r',map);

	}
}
