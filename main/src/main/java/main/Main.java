package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.Controller;
import model.Model;
import view.View;

/**
 * 
 * @author Lilian
 * @version 1.0
 */
public abstract class Main 
{

/**
 * 
 * @param args main parameter
 * @throws SQLException An exception that provides information on a database accesserror or other errors
 * @throws IOException Signals that an I/O exception of some sort has occurred
 */
    public static void main(final String[] args) throws SQLException, IOException
    {    	
    	Model model = new Model();
		View view = new View(model);
		Controller ctrl = new Controller(view, model);
		ctrl.play();
    }
}
