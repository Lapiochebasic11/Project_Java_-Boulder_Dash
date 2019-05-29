package main;

import java.sql.SQLException;

import controller.Controller;
import model.Model;
import view.View;

public abstract class Main 
{
    public static void main(final String[] args) throws SQLException 
    { 
   	
    	Model model = new Model();
		View view = new View(model);
		Controller ctrl = new Controller(view, model);
		ctrl.play();
    }
}
