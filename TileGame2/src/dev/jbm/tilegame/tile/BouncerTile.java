package dev.jbm.tilegame.tile;

import java.awt.image.BufferedImage;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.gfx.Assets;

public class BouncerTile extends Tile{

	private static Handler handler;
	private static int bounceWidth = TILEWIDTH;
	private static int bounceHeight = TILEHEIGHT/2;
	
	public BouncerTile(int id) {
		super(Assets.bouncer, id, bounceWidth, bounceHeight);
	}
}

