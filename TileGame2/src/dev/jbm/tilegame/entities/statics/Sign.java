package dev.jbm.tilegame.entities.statics;

import java.awt.Graphics;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.gfx.Assets;
import dev.jbm.tilegame.tile.Tile;
import dev.jbm.tilegame.ui.UIText;

public class Sign extends StaticEntity{
	
	private String message;
	
	public Sign(Handler handler, float x, float y, String message) {
		super(handler, x, y, Tile.TILEWIDTH, Tile.TILEHEIGHT);
		this.message = message;
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
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
	
	public int getType() {
		return 4;
	}
	
	public void interact() {
		uiManager.addObject(new UIText(100f, 200f, message));
	}
}
