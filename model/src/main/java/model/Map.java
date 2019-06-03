package model;

import java.sql.SQLException;
import model.dao.ElementDAO;
import model.dao.MetadataDAO;
import model.Element.ElementFactory;

/**
 * 
 * @author Lilian Schneider
 * @version 1.0
 */
public class Map  {

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

	/**
	 * Initialize all variables from the Database and launch the fill of the map

	 * @throws SQLException
	 */
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
	
	/**
	 * Fill the map of element, using the factory to transform Database strings into Element
	 * @throws SQLException
	 */
	public void fillOnTheMap() throws SQLException {
		int x,y;
		int ID = tableID;
		for(y=0; y <height;y++){
			for (x=0; x<width; x++){
				setOnTheMapXY(ElementFactory.getObject(ElementDAO.getElement(ID,x,y)), x, y);
			}
		}
	}
	
	/**
	 * Spawn exit
	 */
	public void spawnExit() {
		setOnTheMapXY(ElementFactory.getObject("DOOR"), exitX, exitY);

	}
	
	/**
	 * give the element location 
	 * @param x
	 * @param y
	 * @return the position of the element 
	 */
	public model.Element.Element getOnTheMapXY(int x, int y) {

		return onTheMap[x][y];
	}
	
	/**
	 * put an element in the map
	 * @param element
	 * @param x
	 * @param y
	 */
	public void setOnTheMapXY(model.Element.Element element, int x, int y) {
		this.onTheMap[x][y] = element;
	}
	
	/**
	 * return the width
	 * @return width
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * set the width 
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * return the height
	 * @return height
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * set the height
	 * @param height
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * 
	 * @return win
	 */
	public boolean getWin() {
		return win;
	}

	/**
	 * set win
	 * @param win
	 */
	public void setWin(boolean win) {
		this.win = win;
	}

	/**
	 * 
	 * @return lose
	 */
	public boolean getLose() {
		return lose;
	}

	/**
	 * set lose
	 * @param lose
	 */
	public void setLose(boolean lose) {
		this.lose = lose;
	}


	/**
	 * 
	 * @return score
	 */
	public int getScore() {
		return score;
	}


	/**
	 * set score
	 * @param score
	 */
	public void setScore(int score) {
		this.score = score;
	}


	/**
	 * 
	 * @return scoreNeeded
	 */
	public int getScoreNeeded() {
		return scoreNeeded;
	}


	/**
	 * set score needed
	 * @param scoreNeeded
	 */
	public void setScoreNeeded(int scoreNeeded) {
		this.scoreNeeded = scoreNeeded;
	}


	/**
	 * 
	 * @return exit position x
	 */
	public int getExitX() {
		return exitX;
	}


	/**
	 * set exit position x
	 * @param exitX
	 */
	public void setExitX(int exitX) {
		this.exitX = exitX;
	}


	/**
	 * 
	 * @return exit position y
	 */
	public int getExitY() {
		return exitY;
	}


	/**
	 * set exit position y
	 * @param exitY
	 */
	public void setExitY(int exitY) {
		this.exitY = exitY;
	}

}
