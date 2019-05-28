package model;

import java.sql.SQLException;

import Element.Element;
import Element.ElementFactory;

public class Map {
	
	private int mapID = 1;
	private int height;
	private int widht;
	private Element[][] onTheMap;
	private int score = 0;
	private int scoreNeed;
	private int time;
	private int endtime;
	private boolean win = false;
	private boolean lose = false;
	
	public Map() throws SQLException{

		setWidht();
		setHeight();
		setScoreNeed();
		setEndTime();
		this.onTheMap = new Element[widht][height];
		putOnMap();
	}
	
	public void putOnMap() {
		int x,y;
		int ID = mapID;
		for(y=0; y <height;y++) {
			for (x=0; x<widht;x++) {
				setOnTheMapXY(ElementFactory..getFromTableSymbol(ElementDAO.getElement(ID,x,y)), x, y);
			}
		}
				
	}
		

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidht() {
		return widht;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}

	public int getScoreNeed() {
		return scoreNeed;
	}

	public void setScoreNeed(int scoreNeed) {
		this.scoreNeed = scoreNeed;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getEndtime() {
		return endtime;
	}

	public void setEndtime(int endtime) {
		this.endtime = endtime;
	}
	
	public Element getOnTheMapXY(int x, int y) {
		return onTheMap[x][y]; 
	}

	public void setOnTheMapXY(Element element, int x, int y) {
		this.onTheMap[x][y] = element;
	}

	public  int getScore() {
		return score;
	}

	public  void setScore(int score) {
		this.score = score;
	}
	
	public void setWin(boolean win) {
		this.win = win;
	}
	
	public void setLose(boolean lose) {
		this.lose = lose;
	}


}