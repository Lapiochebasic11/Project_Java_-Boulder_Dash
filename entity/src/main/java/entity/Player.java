package entity;

public class Player extends Element {
	
	private int x;
	private int y;
	private boolean alive = true;
	private static String sprite = "player.png";
	
	
	
	private Player() {
		super(sprite);
		
	}
	public void moveUp(int y) {
		this.y = this.y+1;
	}
	
	public void moveLeft(int x) {
		this.x = this.x-1;
	}
	
	public void moveRight(int x) {
		this.x = this.x+1;
	}
	
	public void moveDown(int y) {
		this.y = this.y-1;
	}
	
	public void dead() {
		
	}
	
}
