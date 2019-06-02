package model.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * 
 */
final class BoulderDashBDDConnector {

	/**
	 * The login.
	 */
	private static String user = "root";
	/**
	 * The password.
	 */
	private static String password = "";
	/**
	 * The url.
	 */
	private static String url = "jdbc:mysql://localhost/boulderdash?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
	/**
	 * The connection.
	 */
	private java.sql.Connection connection;
	/**
	 * The statement.
	 */
	private java.sql.Statement statement;
	/**
	 * The instance.
	 */
	private static BoulderDashBDDConnector instance;

	/**
	 * Instantiates a new boulder dash BDD connector.
	 */
	private BoulderDashBDDConnector() {
		this.open();
	}
	
	/**
	 * Gets the single instance of BoulderDashBDDConnector.
	 * @return single instance of BoulderDashBDDConnector
	 */
	public static BoulderDashBDDConnector getInstance() {
		if (instance == null){
			setInstance(new BoulderDashBDDConnector());
		}
		return instance;
	}


	/**
	 * Sets the instance.
	 * @param instance the new instance
	 */
	private static void setInstance(final BoulderDashBDDConnector instance) {
		BoulderDashBDDConnector.instance = instance;
	}

	/**
	 * Open.
	 * @return true, if successful
	 */
	private boolean open() {
		try {
			this.connection = DriverManager.getConnection(BoulderDashBDDConnector.url, BoulderDashBDDConnector.user, BoulderDashBDDConnector.password);
	        this.statement = this.connection.createStatement();
	            return true;
	        } catch (final SQLException exception) {
	            exception.printStackTrace();
	        }
	        return false;
	}

	/**
	 * Execute query.
	 * @param query the query
	 * @return the result set
	 */
	public java.sql.ResultSet executeQuery(final String query) {
		 try {
	            return this.getStatement().executeQuery(query);
	        } catch (final SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	}

	/**
	 * Prepare call.
	 * @param query the query
	 * @return the java.sql. callable statement
	 */
	public java.sql.CallableStatement prepareCall(final String query) {
		  try {
	            return this.getConnection().prepareCall(query);
	        } catch (final SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	}

	/**
	 * Execute update.
	 * @param query the query
	 * @return the int
	 */
	public int executeUpdate(final String query) {
	    try {
            return this.statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        } catch (final SQLException e) {
            e.printStackTrace();
        }
        return 0;
	}

	/**
	 * Gets the connection.
	 * @return the connection
	 */
	public java.sql.Connection getConnection() {
		return this.connection;
	}

	/**
	 * Sets the connection.
	 * @param connection the new connection
	 */
	public void setConnection(final java.sql.Connection connection) {
		this.connection = connection;
	}

	/**
	 * Gets the statement.
	 * @return the statement
	 */
	public java.sql.Statement getStatement() {
		return this.statement;
	}

	/**
	 * Sets the statement.
	 * @param statement the new statement
	 */
	public void setStatement(final java.sql.Statement statement) {
		this.statement = statement;
	}

}