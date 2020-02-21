package dev.jbm.tilegame.tile;

import dev.jbm.tilegame.gfx.Assets;

public class GrassTile extends Tile{

	public GrassTile(int id) {
		super(Assets.grass, id, TILEWIDTH, TILEHEIGHT);
		
	}
	
	public boolean isSolid() {
		return true;
	}
	
}
