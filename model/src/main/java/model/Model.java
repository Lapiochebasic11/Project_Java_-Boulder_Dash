package model;

import java.sql.SQLException;
import model.Element.*;

/**
 * 
 * @author Lilian Schneider
 *
 */
public class Model {
	
	private Map map;

	/**
	 * create the map
	 * @throws SQLException
	 */
	public Model() throws SQLException {
		map = new Map();

	}

	public Map getMap() {
		return this.map;
		
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public void winsound()
	{
		SoundBox.playerwin();
	}
	
	public void losesound()
	{
		SoundBox.playerdie();
	}
	
	public void gamethemestart()
	{
		SoundBox.themestart();
	}
	
	public void gamethemestop()
	{
		SoundBox.themestop();
	}
}