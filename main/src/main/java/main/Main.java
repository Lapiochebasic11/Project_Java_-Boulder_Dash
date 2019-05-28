/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;


import java.sql.SQLException;

import model.Model;
import view.View;



/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main 
{
    public static void main(final String[] args) throws SQLException 
    { 
    	Model model = new Model();
    	View view = new View();
       
    	/*final Model model = new Model();
    	View view = new View(); 	
        /*final Model model = new Model();
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        view.setController(controller);

        controller.control();
        controller.orderPerform(ControllerOrder.English);*/
    }
}
