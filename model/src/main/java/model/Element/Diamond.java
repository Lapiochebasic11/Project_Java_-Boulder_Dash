package  model.Element;

import model.Map;

public class Diamond extends Motion implements Moves{

	private static String SPRITE = "DIAMOND.jpg";

	public Diamond() {
		super(SPRITE);

	}


	public void walkOver(int x, int y, char direction, Map map) {
		map.setScore(map.getScore() + 1);
		map.setOnTheMapXY(new Empty(), x, y);
		
		switch (direction){
			case 'u':
				map.setOnTheMapXY(new Player(), x, y-1);
				break;
			case 'd':
				map.setOnTheMapXY(new Player(), x, y+1);
				break;
			case 'l':
				map.setOnTheMapXY(new Player(), x-1, y);
				break;
			case 'r':
				map.setOnTheMapXY(new Player(), x+1, y);
				break;
			
		}
		
	}

}
