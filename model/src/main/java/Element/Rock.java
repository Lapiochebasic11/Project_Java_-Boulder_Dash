package Element;

import model.Map;

public class Rock extends ElementMobile{
	
	
	boolean movement = false;
	Rock(){
		sprite = "Rock.jpg";
	}
	

	
	public void walk(int x, int y,char direction, Map map) {
switch (direction){
		
		case 'r':
			if(map.getOnTheMapXY(x+1, y+1).getSprite()!="VOID.png" && map.getOnTheMapXY(x+2, y).getSprite()=="VOID.png"){
			map.getOnTheMapXY(x+2, y).walk(x+1, y, direction,map);
			map.getOnTheMapXY(x+1, y).walk(x, y, direction,map);
			}
			break;
			
		case 'l':
			if(map.getOnTheMapXY(x-1, y+1).getSprite()!="VOID.png" && map.getOnTheMapXY(x-2, y).getSprite()=="VOID.png"){
				map.getOnTheMapXY(x-2, y).walk(x-1, y, direction,map);
				map.getOnTheMapXY(x-1, y).walk(x, y, direction,map);
				}
			break;
			
		}
	
	}
	

	public boolean freePlace(int x, int y,Map map){
	if(map.getOnTheMapXY(x, y).getSprite()=="Empty.png" || (map.getOnTheMapXY(x, y).getSprite()=="PLAYER.png"&& movement ) || (map.getOnTheMapXY(x, y).getSprite()=="ENEMY.png" && movement)){
		return true;
		}
	else {
		return false;
	}
	}
	
	public void move(int x, int y, char direction,Map map) {
		if (freePlace(x,y+1,map)){
			moveDown(x,y,map);

			
		}
		else{
			movement = false;
			
		}
		
		
		if (freePlace(x-1, y,map) && freePlace(x-1, y+1,map) && ((map.getOnTheMapXY(x, y+1).getSprite()=="ROCK.png") || (map.getOnTheMapXY(x, y+1).getSprite()=="DIAMOND.png"))){
			moveLeft(x,y,map);
		}
		
		if (freePlace(x+1, y,map) && freePlace(x+1, y+1,map) && ((map.getOnTheMapXY(x, y+1).getSprite()=="ROCK.png") || (map.getOnTheMapXY(x, y+1).getSprite()=="DIAMOND.png"))){
			moveRight(x,y,map);

		}
	}
}
