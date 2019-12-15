package dev.jbm.tilegame.tile;

import dev.jbm.tilegame.gfx.Assets;

public class DirtTile extends Tile{

	public DirtTile(int id) {
		super(Assets.dirt, id);
		
	}
	
	public boolean isSolid() {
		return true;
	}

}
