package dev.jbm.tilegame;

import dev.jbm.tilegame.gfx.GameCamera;
import dev.jbm.tilegame.input.KeyManager;
import dev.jbm.tilegame.input.MouseManager;
import dev.jbm.tilegame.worlds.World;

public class Handler {

	private Game game;
	private World world;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public GameCamera getGameCamera() {
		return game.getGameCamera();
	}
	
	public KeyManager getKeyManager() {
		return game.getKeyManager();
	}
	
	public MouseManager getMouseManager() {
		return game.getMouseManager();
	}
	
	public int getWidth() {
		return game.getWidth();
	}

	public int getHeight() {
		return game.getHeight();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}
	
	public int getLastKey() {
		return game.getKeyManager().getLastPressed();
	}
	
}
