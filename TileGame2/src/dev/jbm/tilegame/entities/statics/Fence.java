package dev.jbm.tilegame.entities.statics;

import java.awt.Graphics;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.gfx.Assets;
import dev.jbm.tilegame.tile.Tile;

public class Fence extends StaticEntity{

	public Fence(Handler handler, float x, float y) {
		super(handler, x, y, 12, Tile.TILEHEIGHT);
	}

	@Override
	public void tick() {
		
	}

	public void die() {
			
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.fence, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}
	
	public boolean isSolid() {
		return true;
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}
	
}
