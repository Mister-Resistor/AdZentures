package dev.jbm.tilegame.entities.statics;

import java.awt.Graphics;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.gfx.Assets;
import dev.jbm.tilegame.tile.Tile;
import dev.jbm.tilegame.ui.UIManager;
import dev.jbm.tilegame.ui.UIText;

public class Sign extends StaticEntity{
	
	private UIManager uiManager;
	
	private String message;
	private int messageTimer = 0;
	
	public Sign(Handler handler, float x, float y, String message) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.message = message;
		uiManager = new UIManager(handler);
		uiManager.addObject(new UIText(10f, 10f, message));
	}

	@Override
	public void tick() {
		uiManager.tick();
		if(messageTimer > 0) {
			messageTimer--;
		}	
	}

	@Override
	public void render(Graphics g) {	
		if(messageTimer > 0)
			uiManager.render(g);
		g.drawImage(Assets.sign, (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
	}

	@Override
	public void die() {
		
	}
	
	@Override
	public boolean isSolid() {
		return false;
	}

	public String getMessage() {
		return message;
	}
	
	public void interact() {
		messageTimer = 500;
	}
}
