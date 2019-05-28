package Element;

import model.Map;

public class Exit extends Element {
	
	Exit(){
		sprite = "Exit.jpg";
	}

	public void walk(int x, int y, Map map) {
		map.setWin(true);
	}
}
