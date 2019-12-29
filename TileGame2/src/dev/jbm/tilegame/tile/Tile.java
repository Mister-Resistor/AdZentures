package dev.jbm.tilegame.tile;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	
	public static Tile[] tiles = new Tile[256];
	public static Tile grassTile = new GrassTile(0);
	public static Tile rockTile = new RockTile(1);
	public static Tile dirtTile = new DirtTile(2);
	public static Tile airTile = new AirTile(3);
	public static Tile nullTile = new NullTile(200);
	
	public static final int TILEWIDTH = 32;
	public static final int TILEHEIGHT = 32;
	
	protected final int id;
	protected BufferedImage texture;

	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		g.drawImage(texture,x,y, TILEWIDTH, TILEHEIGHT, null);
	}
	
	public boolean isSolid() {
		return false;
	}
	
	public int getId() {
		return id;
	}
}
