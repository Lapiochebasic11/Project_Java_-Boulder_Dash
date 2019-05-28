package  model.Element;

import model.Map;

public class Exit extends Element {
	
	public static String sprite = "Exit.jpg";
	
	Exit(){
		super(sprite);
}


	public void walk(int x, int y, Map map) {
		map.setWin(true);
	}
}
