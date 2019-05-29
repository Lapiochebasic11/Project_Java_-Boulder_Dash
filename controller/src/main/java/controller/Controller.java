package controller;

import view.View;
import view.ViewFrame;
import model.* ;

public class Controller
{

	private Model model;
	private ViewFrame view;
	public static int frameRate = 10;
	private int num = 0;
	
	public void play() 
	{
		view.Windows(model.getMap().getWidth() , model.getMap().getHeight() );
		while (model.getMap().getWin() == false){
			
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			num = view.ViewFrame();
			for(int y = model.getMap().getHeight() -1 ; y >= 0 ; y--){
				for(int x = 0; x < model.getMap().getWidth()  ; x++){
					//System.out.println(model.getMap().getOnTheMapXY(x, y).getSprite());
					
					
					if (model.getMap().getOnTheMapXY(x,y).getSprite()=="PLAYER.png"){
						model.getMap().getOnTheMapXY(x, y).move(x, y ,/*view.KeyUser()*/num , model.getMap());
						num = 0;
					}
					else{
						model.getMap().getOnTheMapXY(x, y).move(x, y ,/*view.KeyUser()*/(int) (Math.random() * 4 ), model.getMap());
					}
					
					if (model.getMap().getScoreNeed() == model.getMap().getScore() ){
						if (model.getMap().getOnTheMapXY( model.getMap().getDoorX(),model.getMap().getDoorY()).getSprite() =="PLAYER.png")  {
							model.getMap().setLevelEnded(true );
						}
						model.getMap().spawnDoor();
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
						case "ROCK.png":
							System.out.print("O ");
							break;

						case "BORDER.png":
							System.out.print("[]");
							break;
						
						case "DIAMOND.png":
							System.out.print("V ");
							break;
						
						case "DESTRUCTIBLEWALL.png":
							System.out.print("[]");
							break;
						
						case "DOOR.png":
							System.out.print("D ");
							break;
						
						case "SOIL.png":
							System.out.print("* ");
							break;
						
						case "PLAYER.png":
							System.out.print("P ");
							break;

						case "ENEMY.png":
							System.out.print("X ");
							break;

						case "ENEMY2.png":
							System.out.print("");
							break;

						case "VOID.png":
							System.out.print("_ ");
							break;
					}
				}
				System.out.println("");
				
			}
			System.out.println("");
			
		}
		if (model.getMap().getLevelLost() == false ){
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

	/**
	 * 
	 * @param view
	 * @param model
	 */
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	/**
	 * 
	 * @param model
	 */
	public void setModel(Model model) {
		this.model = model;
	}

	/**
	 * 
	 * @param view
	 */
	public void setView(View view) {
		this.view = view;
	}

}