package dev.jbm.tilegame.worlds;

import java.awt.Graphics;
import java.util.Random;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.entities.EntityManager;
import dev.jbm.tilegame.entities.creatures.Player;
import dev.jbm.tilegame.entities.statics.Fence;
import dev.jbm.tilegame.entities.statics.Sign;
import dev.jbm.tilegame.tile.Tile;
import dev.jbm.tilegame.utils.Utils;

public class World {

	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	
	private EntityManager entityManager;
	
	public World(Handler handler, String path){
		this.handler = handler;
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));
		//Put entities here
		entityManager.addEntity(new Fence(handler, 0, 128));
		entityManager.addEntity(new Sign(handler, 200, 128));
		
		//loadHardcodedWorld(path);
		loadRandomWorld();
		
		entityManager.getPlayer().setX(spawnX);
		entityManager.getPlayer().setY(spawnY);
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void tick(){
		entityManager.tick();
	}
	
	public void render(Graphics g){
		int xStart = (int) Math.max(0, handler.getGameCamera().getxOffset()/Tile.TILEWIDTH);
		int xEnd = (int) Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth()) / Tile.TILEWIDTH + 1);
		int yStart = (int) Math.max(0, handler.getGameCamera().getyOffset()/Tile.TILEHEIGHT);
		int yEnd = (int) Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight()) / Tile.TILEHEIGHT + 1);
		
		
		for(int y = yStart;y < yEnd;y++){
			for(int x = xStart;x < xEnd;x++){
				getTile(x, y).render(g, (int)(x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()),
						(int) (y * Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		//Entities
		entityManager.render(g);
	}
	
	public Tile getTile(int x, int y){
		if (x < 0 || y < 0 || x >= width || y >= height)
			return Tile.grassTile;
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null)
			return Tile.nullTile;
		return t;
	}
	
	private void loadHardcodedWorld(String path){
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}
	
	private void loadRandomWorld() {
		Random r = new Random();
		int index = 0;
		width = 20;
		height = 20;
		spawnX = 100;
		spawnY = 510;
		
		tiles = new int[width][height];
		for(int y = 0;y < height;y++){
			for(int x = 0;x < width;x++){
				index = r.nextInt(100);
				if(index == 9)
					createIsland(x,y);
				else if(index == 8)
					tiles[x][y] = 0;
				else
					tiles[x][y] = 3;
			}
		}
		
		for(int x = 0; x < width; x++) {
			tiles[x][height - 1] = 1;
		}
		for(int x = 0; x < width; x++) {
			tiles[x][height - 2] = 3;
		}
	}
	
	private void createIsland(int x, int y) {
		int isleWidth = (int) ((Math.random() * ((5 - 2) + 1)) + 2);
		int isleHeight = (int) ((Math.random() * ((5 - 2) + 1)) + 2);
		for(int i = 0; i <= isleWidth; i++) {
			if((x-i) >= 0 && (x-i) < width) {
				tiles[x-i][y] = 2;
			}
			if((y - isleHeight) > 1 && (y - isleHeight) < height && (x-i) >= 0 && (x-i) < width) {
				tiles[x-i][y - isleHeight] = 0;
			}
		}
		for(int i = 1; i < isleHeight; i++) {
			if((y - i) > 1 && (y - i) < height) {
				tiles[x][y-i] = 2;
			}
			if((x-isleWidth) > 0 && (x-isleWidth) < width && (y - i) > 1 && (y - i) < height) {
				tiles[x-isleWidth][y-i] = 2;
			}
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
}
