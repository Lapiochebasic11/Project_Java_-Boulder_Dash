package model.Element;

import model.Map;

public abstract class Element implements IElement{

	String sprite;
	int walk = 0;
	
	public Element(String sprite) {
		this.sprite = sprite;

	}

	public String getSprite() {
		return this.sprite;
	}

	
	public void destruction(int x, int y, Map map) {

	}

	
	public void walkOver(int x, int y, char direction, Map map) {

	}

	
	public void move(int x, int y, int direction, Map map) {

	}

	public int isWalk() {
		return walk;
	}

	public void setWalk(int walk) {
		this.walk = walk;
	}

}