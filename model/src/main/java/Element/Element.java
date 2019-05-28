package Element;

import model.Map;

public abstract class Element  {

	protected String sprite; 

	public void dead(int x, int y, Map map) {
		
	}
	
	public void walk(int x, int y,char direction, Map map) {

	}
	public String getSprite() {
		return sprite;
	}
	public void setSprite(String sprite) {
		this.sprite = sprite;
	}

	
}
