package Element;

import model.Map;

public abstract class ElementMobile extends Element {
	
	String sprite;
	
	public void moveUp(int x, int y,Map map) {
		map.getOnTheMapXY(x, y-1).walk(x,y,'u',map);

	}

	public void moveDown(int x, int y,Map map){
		map.getOnTheMapXY(x, y+1).walk(x, y, 'd',map);
	}

	
	public void moveLeft(int x, int y,Map map){
		map.getOnTheMapXY(x+1, y).walk(x, y, 'l',map);
	}

	
	public void moveRight(int x, int y,Map map){
		map.getOnTheMapXY(x-1, y).walk(x, y, 'r',map);
	}
}
