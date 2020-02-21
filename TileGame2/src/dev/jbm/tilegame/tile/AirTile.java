package dev.jbm.tilegame.tile;

import dev.jbm.tilegame.gfx.Assets;

public class AirTile extends Tile {

	public AirTile(int id) {
		super(Assets.air, id, TILEWIDTH, TILEHEIGHT);
	}

	@Override
	public boolean isSolid() {
		return false;
	}
	
}
