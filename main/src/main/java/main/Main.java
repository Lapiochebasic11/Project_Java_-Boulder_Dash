package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.Controller;
import model.Model;
import view.View;

public abstract class Main 
{
    public static void main(final String[] args) throws SQLException, IOException
    {    	
    	Model model = new Model();
		View view = new View(model);
		Controller ctrl = new Controller(view, model);
		ctrl.play();
    }
}
