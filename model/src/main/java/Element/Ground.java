package Element;

import model.Map;

public class Ground extends Element {
	
	Ground(){
		sprite = "Ground.jpg";
	}
	
	public void walk(int x, int y, char direction, Map map) {
		dead(x,y,map);
		
		
		
	}
	public void dead(int x, int y,Map map) {
		map.setOnTheMapXY(new Empty(), x, y);

}
}

