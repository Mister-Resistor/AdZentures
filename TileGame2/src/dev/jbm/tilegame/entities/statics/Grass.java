package dev.jbm.tilegame.entities.statics;

import java.awt.Graphics;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.gfx.Assets;
import dev.jbm.tilegame.tile.Tile;

public class Grass extends StaticEntity{

	private final int inf;
	
	public Grass(Handler handler, float x, float y, int inf) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.inf = inf;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		if(inf == 1)
			g.drawImage(Assets.lightGrass, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		else
			g.drawImage(Assets.darkGrass, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	@Override
	public void die() {
		
	}
	
	public boolean isSolid() {
		return false;
	}
	
	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}
}
