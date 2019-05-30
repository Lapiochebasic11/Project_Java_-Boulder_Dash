package model.Element;

import model.Map;

public class Exit extends Element {

	private static String SPRITE = "DOOR.jpg";

	public Exit() {
		super(SPRITE);

	}

	/**
	 * Determine the action when you walk on the Door
	 * @param position, direction of the object which launched the method and map pointer
	 */
	public void walkOver(int x, int y, char direction, Map map) {
		map.setWin(true);
	}

}