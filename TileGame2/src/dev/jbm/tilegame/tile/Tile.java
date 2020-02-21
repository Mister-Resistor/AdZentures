package dev.jbm.tilegame.tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.jbm.tilegame.Handler;

public class Tile {
	
	public static Tile[] tiles = new Tile[256];
	public static Tile grassTile = new GrassTile(0);
	public static Tile rockTile = new RockTile(1);
	public static Tile dirtTile = new DirtTile(2);
	public static Tile airTile = new AirTile(3);
	public static Tile bouncerTile = new BouncerTile(4);
	public static Tile nullTile = new NullTile(200);
	
	public static final int TILEWIDTH = 32;
	public static final int TILEHEIGHT = 32;
	
	protected final int id;
	protected BufferedImage texture;
	protected int width;
	protected int height;

	public Tile(BufferedImage texture, int id, int width, int height) {
		this.texture = texture;
		this.id = id;
		this.width = width;
		this.height = height;
		
		tiles[id] = this;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y, int width, int height) {
		g.drawImage(texture,x,y, width, height, null);
	}
	
	public boolean isSolid() {
		return true;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getId() {
		return id;
	}
	
	public void bounce() {
		width++;
		height++;
		
	}
}
