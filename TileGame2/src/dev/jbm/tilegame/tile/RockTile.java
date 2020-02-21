package dev.jbm.tilegame.tile;

import dev.jbm.tilegame.gfx.Assets;

public class RockTile extends Tile{

	public RockTile(int id) {
		super(Assets.stone, id, TILEWIDTH, TILEHEIGHT);
	}
}
