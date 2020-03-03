package dev.jbm.tilegame.tile;

import java.lang.Math;

import dev.jbm.tilegame.gfx.Assets;

public class BouncerTile extends Tile{

	private static int bounceWidth = TILEWIDTH;
	private static int bounceHeight = TILEHEIGHT/2;
	
	public BouncerTile(int id) {
		super(Assets.bouncer, id, bounceWidth, bounceHeight);
	}
	
	@Override
	public void interact() {
		bounceWidth++;
		System.out.println("boing");
	}
	
}

