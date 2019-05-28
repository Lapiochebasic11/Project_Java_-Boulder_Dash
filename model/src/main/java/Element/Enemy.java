package Element;

import model.Map;

public class Enemy extends ElementMobile {
	
	Enemy(){
		sprite = "Enemy.jpg";
	}
	
	
	public void createDiamond(int x, int y, Map map){
		
		int i,j;
		
		for (i=0; i<3;i++){
			for(j=0; j<3;j++)
			{
				map.getOnTheMapXY(x-1+j, y-1+i).dead(x-1+j, y-1+i,map);
				if (map.getOnTheMapXY(x-1+j, y-1+i).getSprite()=="Empty.png"){
					map.setOnTheMapXY(new Diamond(),x-1+j, y-1+i);			}
			}
		
	}
}
}
