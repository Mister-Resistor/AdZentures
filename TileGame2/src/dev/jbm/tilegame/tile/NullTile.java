package dev.jbm.tilegame.tile;

import dev.jbm.tilegame.gfx.Assets;

public class NullTile extends Tile{

	public NullTile(int id) {
		super(Assets.null_, id, TILEWIDTH, TILEHEIGHT);
		
	}
	
	public boolean isSolid() {
		return true;
	}
	
}
