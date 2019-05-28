package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * <h1>The Class ElementDAO.</h1>
 * 
 * @author Hugo Routy
 * @version 1.0
 */
public abstract class ElementDAO extends AbstractDAO {
	/**
	 * Gets the elements of a row in map of lv1
	 */
	private static String sqlMapElementLv1 = "{call findMapElementLv1(?)}";
	/**
	 * Gets the elements of a row in map of lv2
	 */
	private static String sqlMapElementLv2 = "{call findMapElementLv2(?)}";
	/**
	 * Gets the elements of a row in map of lv3
	 */
	private static String sqlMapElementLv3 = "{call findMapElementLv3(?)}";
	/**
	 * Gets the elements of a row in map of lv4
	 */
	private static String sqlMapElementLv4 = "{call findMapElementLv4(?)}";
	/**
	 * Gets the elements of a row in map of lv5
	 */
	private static String sqlMapElementLv5 = "{call findMapElementLv5(?)}";
	
	/**
	 * Gets the elements of a row in map of lv1
	 * @param row needed
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	private static ArrayList<String> getMapElementLv1(int row) throws SQLException {
		row += 1;
		final ArrayList<String> elementsList = new ArrayList<String>(); 
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapElementLv1);
		callStatement.setInt(1, row);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			if (result.next()){
				for (int i = 1; i < 11; i++) {
					elementsList.add(result.getString(i+1));
				}
			}
			result.close();
		}
		//System.out.println(elementsList);
		return elementsList;
	}
	
	/**
	 * Gets the elements of a row in map of lv2
	 * @param row needed
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	private static ArrayList<String> getMapElementLv2(int row) throws SQLException {
		row += 1;
		final ArrayList<String> elementsList = new ArrayList<String>(); 
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapElementLv2);
		callStatement.setInt(1, row);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			if (result.next()){
				for (int i = 1; i < 16; i++) {
					elementsList.add(result.getString(i+1));
				}
			}
			result.close();
		}
		return elementsList;
	}

	/**
	 * Gets the elements of a row in map of lv3
	 * @param row needed
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	private static ArrayList<String> getMapElementLv3(int row) throws SQLException {
		row += 1;
		final ArrayList<String> elementsList = new ArrayList<String>(); 
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapElementLv3);
		callStatement.setInt(1, row);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			if (result.next()){
				for (int i = 1; i < 21; i++) {
					elementsList.add(result.getString(i+1));
				}
			}
			result.close();
		}
		return elementsList;
	}
	
	/**
	 * Gets the elements of a row in map of lv4
	 * @param row needed
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	private static ArrayList<String> getMapElementLv4(int row) throws SQLException {
		row += 1;
		final ArrayList<String> elementsList = new ArrayList<String>(); 
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapElementLv4);
		callStatement.setInt(1, row);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			if (result.next()){
				for (int i = 1; i < 31; i++) {
					elementsList.add(result.getString(i+1));
				}
				result.close();
			}
		}
		return elementsList;
	}
	
	/**
	 * Gets the elements of a row in map of lv5
	 * @param row needed
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	private static ArrayList<String> getMapElementLv5(int row) throws SQLException {
		row += 1;
		final ArrayList<String> elementsList = new ArrayList<String>(); 
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapElementLv5);
		callStatement.setInt(1, row);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			if (result.next()){
				for (int i = 1; i < 41; i++) {
					elementsList.add(result.getString(i+1));
				}
				result.close();
			}
		}
		return elementsList;
	}
	
	/**
	 * Gets the list of elements of a row and return the element of a column of the row
	 * @param idLevel,row , column 
	 * @return  the elements of a row 
	 * @throws SQLException the SQL exception
	 */
	public static String getElement (int idLevel, int column, int row) throws SQLException{
		//System.out.println(column);
		String element = "";
		//System.out.println(column);
		ArrayList<String> elementsRow = new ArrayList<String>(); 
		switch (idLevel){
			case 1 : 
				elementsRow = getMapElementLv1(row);
				break;
			case 2 :
				elementsRow = getMapElementLv2(row);
				break;
			case 3 :
				elementsRow = getMapElementLv3(row);
				break;
			case 4 :
				elementsRow = getMapElementLv4(row);
				break;
			case 5 : 
				elementsRow = getMapElementLv5(row);
				break;
		}
		int elementsRowSize = elementsRow.size();
		if (column <= elementsRowSize){
			element = elementsRow.get(column);
		}
		//System.out.println(element);
		return element;
	}
	
}
