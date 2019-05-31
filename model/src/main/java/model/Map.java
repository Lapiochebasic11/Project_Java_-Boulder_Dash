package model;

import java.sql.SQLException;

import model.IMap;
import model.dao.ElementDAO;
import model.dao.MetadataDAO;
import model.Element.ElementFactory;

public class Map implements IMap {

	private int width;
	private int height;
	private model.Element.Element[][] onTheMap;
	private int score = 0;
	private int scoreNeeded;
	private int exitX;
	private int exitY;
	private boolean win = false;
	private boolean lose = false;
	public int tableID = 2;

	public Map() throws SQLException 
	{
		setWidth(MetadataDAO.getMapMetadataWidth(tableID));
		setHeight(MetadataDAO.getMapMetadataHeight(tableID));
		setExitX(MetadataDAO.getMapMetadataDoorX(tableID));
		setExitY(MetadataDAO.getMapMetadataDoorY(tableID));
		setScoreNeeded(MetadataDAO.getMapMetadataScoreNeed(tableID));
		this.onTheMap = new model.Element.Element[width][height];
		fillOnTheMap();		
	}
	
	public void fillOnTheMap() throws SQLException {
		int x,y;
		int ID = tableID;
		for(y=0; y <height;y++){
			for (x=0; x<width; x++){
				setOnTheMapXY(ElementFactory.getObject(ElementDAO.getElement(ID,x,y)), x, y);
			}
		}
	}
	
	
	public void spawnExit() {
		setOnTheMapXY(ElementFactory.getObject("DOOR"), exitX, exitY);

	}
	
	public model.Element.Element getOnTheMapXY(int x, int y) {

		return onTheMap[x][y];
	}

	public void setOnTheMapXY(model.Element.Element element, int x, int y) {
		this.onTheMap[x][y] = element;
	}
	
	
	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean getWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}

	public boolean getLose() {
		return lose;
	}

	public void setLose(boolean lose) {
		this.lose = lose;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public int getScoreNeeded() {
		return scoreNeeded;
	}


	public void setScoreNeeded(int scoreNeeded) {
		this.scoreNeeded = scoreNeeded;
	}


	public int getExitX() {
		return exitX;
	}


	public void setExitX(int exitX) {
		this.exitX = exitX;
	}


	public int getExitY() {
		return exitY;
	}


	public void setExitY(int exitY) {
		this.exitY = exitY;
	}

}
