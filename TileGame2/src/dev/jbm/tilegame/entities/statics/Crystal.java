package dev.jbm.tilegame.entities.statics;

import java.awt.Graphics;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.gfx.Assets;
import dev.jbm.tilegame.tile.Tile;

public class Crystal extends StaticEntity{

	public Crystal(Handler handler, float x, float y) {
		super(handler, x, y, 12, Tile.TILEHEIGHT);
	}

	@Override
	public void tick() {
		
	}

	public void die() {
			
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.crystal, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}
	
	public boolean isSolid() {
		return true;
	}
	
	public int getType() {
		return 1;
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}
	
}
