package model.dao;

/**

 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * 
 */
public abstract class AbstractDAO {

	/**
	 * Execute query.
	 * @param query the query
	 * @return the result set
	 */
	protected static java.sql.ResultSet executeQuery(final String query) {
		return BoulderDashBDDConnector.getInstance().executeQuery(query);
		
	}

	/**
	 * Execute update.
	 * @param query the query
	 * @return the int
	 */
	protected static int executeUpdate(final String query) {
		return BoulderDashBDDConnector.getInstance().executeUpdate(query);
	}

	/**
	 * Prepare call.
	 * @param query the query
	 * @return the callable statement
	 */
	protected static java.sql.CallableStatement prepareCall(final String query) {
		return BoulderDashBDDConnector.getInstance().prepareCall(query);
	}

}