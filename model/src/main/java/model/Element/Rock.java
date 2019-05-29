package model.Element;

import model.Map;

public class Rock extends Motion implements Moves {

	private static String SPRITE = "ROCK.jpg";

	public Rock() {
		super(SPRITE);
	}


	public void walkOver(int x, int y, char direction,Map map) {

		
		
		switch (direction){
		
		case 'r':
			if(map.getOnTheMapXY(x+1, y+1).getSprite()!="VOID.png" && map.getOnTheMapXY(x+2, y).getSprite()=="VOID.png"){
			map.getOnTheMapXY(x+2, y).walkOver(x+1, y, direction,map);
			map.getOnTheMapXY(x+1, y).walkOver(x, y, direction,map);
			}
			break;
			
		case 'l':
			if(map.getOnTheMapXY(x-1, y+1).getSprite()!="VOID.png" && map.getOnTheMapXY(x-2, y).getSprite()=="VOID.png"){
				map.getOnTheMapXY(x-2, y).walkOver(x-1, y, direction,map);
				map.getOnTheMapXY(x-1, y).walkOver(x, y, direction,map);
				}
			break;
			
		}
	}
	
}