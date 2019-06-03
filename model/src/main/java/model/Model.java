package model;

import java.sql.SQLException;
import model.Element.*;

/**
 * 
 * @author Lilian Schneider
 * @version 1.0
 */
public class Model {
	
	private Map map;

	/**
	 * create the map
	 * @throws SQLException An exception that provides information on a database accesserror or other errors
	 */
	public Model() throws SQLException {
		map = new Map();

	}

/**
 * 
 * @return map
 */
	public Map getMap() {
		return this.map;
		
	}

/**
 * 
 * @param map call map
 */
	public void setMap(Map map) {
		this.map = map;
	}

/**
 * Calls the sound playerwin from Soundbox
 * 
 */
	public void winsound()
	{
		SoundBox.playerwin();
	}
	
/**
 * Calls the sound playerdie from Soundbox
 * 
*/
	public void losesound()
	{
		SoundBox.playerdie();
	}

/**
 * Calls the sound themestart from Soundbox
 * 
 */
	public void gamethemestart()
	{
		SoundBox.themestart();
	}

/**
 * Calls the sound themestop from Soundbox
 * 
 */
	public void gamethemestop()
	{
		SoundBox.themestop();
	}
}