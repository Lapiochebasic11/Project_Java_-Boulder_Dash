package  model.Element;

import model.Map;

public class Ground extends Element {
	
	public static String sprite = "Ground.jpg";
	
	Ground(){
		super(sprite);
}

	
	public void walk(int x, int y, char direction, Map map) {
		dead(x,y,map);
		
		
		
	}
	public void dead(int x, int y,Map map) {
		map.setOnTheMapXY(new Empty(), x, y);

}
}

