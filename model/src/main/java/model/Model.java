package model;

import java.sql.SQLException;

public class Model {
	
	
	private Map map;

	public Model() throws SQLException {
		map = new Map();

	}

	public Map getMap() {
		return this.map;
		
	}

	/**
	 * 
	 * @param map
	 */
	public void setMap(Map map) {
		this.map = map;
	}


}