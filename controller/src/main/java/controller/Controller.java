package controller;

import java.io.IOException;

import model.* ;
import view.View; 

public class Controller{

	private Model model;
	private View view;
	public static int frameRate = 10;
	private int num = 0;
	
	public void play() throws IOException {
		
		while (model.getMap().getWin() == false){
			view.show(model.getMap().getWidth(), model.getMap().getHeight());
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num = view.KeyUser();
			for(int y = model.getMap().getHeight() -1 ; y >= 0 ; y--){
				for(int x = 0; x < model.getMap().getWidth()  ; x++){
					
					
					if (model.getMap().getOnTheMapXY(x,y).getSprite()=="PLAYER.jpg"){
						model.getMap().getOnTheMapXY(x, y).move(x, y , num , model.getMap());
						num = 0;
					}
					else{
						model.getMap().getOnTheMapXY(x, y).move(x, y , (int) (Math.random() * 4 ), model.getMap());
					}
					
					if (model.getMap().getScoreNeeded() == model.getMap().getScore() ){
						if (model.getMap().getOnTheMapXY( model.getMap().getExitX(),model.getMap().getExitY()).getSprite() =="PLAYER.jpg")  {
							model.getMap().setWin(true);
						}
						model.getMap().spawnExit();
					}
				}
				
			}
			
			for(int y = 0 ; y < model.getMap().getHeight() ; y++){
				for(int x = 0; x < model.getMap().getWidth()  ; x++){
				  model.getMap().getOnTheMapXY(x, y).setWalk(0); 
				}	
			}
			
			for(int y = 0 ; y < model.getMap().getHeight() ; y++){
				for(int x = 0; x < model.getMap().getWidth()  ; x++){
					
					switch (model.getMap().getOnTheMapXY(x, y).getSprite())
					{
						case "ROCK.jpg":
							System.out.print("O ");
							break;

						case "BORDER.jpg":
							System.out.print("[]");
							break;
						
						case "DIAMOND.jpg":
							System.out.print("V ");
							break;
						
						case "DESTRUCTIBLEWALL.jpg":
							System.out.print("[]");
							break;
						
						case "DOOR.jpg":
							System.out.print("D ");
							break;
						
						case "SOIL.jpg":
							System.out.print("* ");
							break;
						
						case "PLAYER.jpg":
							System.out.print("P ");
							break;

						case "ENEMY.jpg":
							System.out.print("X ");
							break;

						case "ENEMY2.jpg":
							System.out.print("");
							break;

						case "VOID.jpg":
							System.out.print("_ ");
							break;
					}
				}
				System.out.println("");
				
			}
			System.out.println("");
			
		}
		if (model.getMap().getLose() == false ){
			System.out.println("Success");
		}
		else{
			System.out.println("Loose");
		}
	}

	public Model getModel() {
		return this.model;
	}

	public View getView() {
		return this.view;
	}

	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public void setView(View view) {
		this.view = view;
	}

}