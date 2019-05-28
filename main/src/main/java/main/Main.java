/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package main;

import java.awt.Dimension;
import java.sql.SQLException;

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
    public static void main(final String[] args) throws SQLException 
    { 
<<<<<<< HEAD
   
    	Model model = new Model();

    	
    	/*
    	 * View view = new View();
    	javax.swing.SwingUtilities.invokeLater(new Runnable() 
    	{
    		public void run() 
    		{
    			ViewFrame frame = new ViewFrame();
                frame.setTitle("Boulder Dash");
                frame.setResizable(false);
                frame.setSize(1920, 1080);
                frame.setMinimumSize(new Dimension(1920, 1080));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(frame.draw);
                frame.pack();
                frame.setVisible(true);
    		}
    	});
    	
        final Model model = new Model();
=======
    	View view = new View(); 	
        /*final Model model = new Model();
>>>>>>> branch 'master' of https://github.com/Lapiochebasic11/Project_Java_-Boulder_Dash
        final View view = new View(model);
        final Controller controller = new Controller(view, model);
        view.setController(controller);

        controller.control();
        controller.orderPerform(ControllerOrder.English);*/
    }
}
