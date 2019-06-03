package model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Lilian Schneider
 * @version 1.0
 */
public abstract class MetadataDAO extends AbstractDAO {

	/**
	 * Gets the height of the map
	 */
	private static String sqlMapMetadataHeight = "{call findMapMetadataHeight(?)}";
	/**
	 * Gets the width of the map
	 */
	private static String sqlMapMetadataWidth = "{call findMapMetadataWidth(?)}";
	/**
	 * Gets the diamonds needed on the map
	 */
	private static String sqlMapMetadataDiamondsNeeded = "{call findMapMetadataDiamondsNeeded(?)}";

	private static String sqlMapMetadataDoorX = "{call findMapMetadataDoorX(?)}";
	/**
	 * Gets the door Y coordinate of the map
	 */
	private static String sqlMapMetadataDoorY = "{call findMapMetadataDoorY(?)}";
	/**
	 * Gets the height of the map
	 * @param idLevel 
	 * @return the height of the map
	 * @throws SQLException the SQL exception
	 */
	public static int getMapMetadataHeight(final int idLevel) throws SQLException {
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapMetadataHeight);
		int height = 0;
		callStatement.setInt(1, idLevel);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			if (result.next()){
				if (result.first()){
					height = result.getInt(1);
				}
			}
			result.close();
		}
		return height;
	}
	
	public static int getMapMetadataWidth(final int idLevel) throws SQLException {
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapMetadataWidth);
		int width = 0;
		callStatement.setInt(1, idLevel);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			if (result.next()){
				if (result.first()){
					width = result.getInt(1);
				}
			}
			result.close();
		}
		return width;
	}

	public static int getMapMetadataScoreNeed(final int idLevel) throws SQLException {
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapMetadataDiamondsNeeded);
		int diamondsNeeded = 0;
		callStatement.setInt(1, idLevel);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			if (result.next()){
				if (result.first()){
					diamondsNeeded = result.getInt(1);
				}
			}
			result.close();
		}
		return diamondsNeeded;
	}

	/**
	 * Gets the door X coordinate of the map
	 * @param idLevel
	 * @return  the door X coordinate
	 * @throws SQLException the SQL exception
	 */
	public static int getMapMetadataDoorX(final int idLevel) throws SQLException {
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapMetadataDoorX);
		int doorX = 0;
		callStatement.setInt(1, idLevel);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			if(result.next()){
				if (result.first()){
					doorX = result.getInt(1);
				}
			}
			result.close();
		}
		return doorX;
	}

	/**
	 * Gets the door Y coordinate of the map
	 * @param idLevel
	 * @return the the door Y
	 * @throws SQLException the SQL exception
	 */
	public static int getMapMetadataDoorY(final int idLevel) throws SQLException {
		final java.sql.CallableStatement callStatement = prepareCall(sqlMapMetadataDoorY);
		int doorY = 0;
		callStatement.setInt(1, idLevel);
		if (callStatement.execute()){
			final ResultSet result = callStatement.getResultSet();
			if (result.next()){
				if (result.first()){
					doorY = result.getInt(1);
				}
			}
			result.close();
		}
		return doorY;
	}
}