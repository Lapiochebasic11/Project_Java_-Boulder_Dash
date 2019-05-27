package model;

import Element.Element;

public class Map {
	
	private int mapID = 1;
	private int height;
	private int widht;
	private Element[][] onTheMap;
	private int score;
	private int scoreNeed;
	private int time;
	private int endtime;
	

	
	
	public int getMapID() {
		return mapID;
	}

	public int getHeight() {
		return height;
	}

	public int getWidht() {
		return widht;
	}

	public Element[][] getOnTheMap() {
		return onTheMap;
	}

	public int getScore() {
		return score;
	}

	public int getScoreNeed() {
		return scoreNeed;
	}

	public int getTime() {
		return time;
	}

	public int getEndtime() {
		return endtime;
	}

}
