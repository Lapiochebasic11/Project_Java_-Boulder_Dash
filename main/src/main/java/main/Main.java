/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import view.View;
import view.ViewFrame;

/**
 * The Class Main.
 *
 * @author Jean-Aymeric Diet
 */
public abstract class Main 
{
    public static void main(final String[] args) 
    { 
    	View view = new View(); 	
        /*final Model model = new Model();
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        view.setController(controller);

        controller.control();
        controller.orderPerform(ControllerOrder.English);*/
    }
}
