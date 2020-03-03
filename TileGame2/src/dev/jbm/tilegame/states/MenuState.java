package dev.jbm.tilegame.states;

import java.awt.Graphics;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.gfx.Assets;
import dev.jbm.tilegame.ui.ClickListener;
import dev.jbm.tilegame.ui.UIImage;
import dev.jbm.tilegame.ui.UIImageButton;
import dev.jbm.tilegame.ui.UIManager;
import dev.jbm.tilegame.ui.UIText;

public class MenuState extends State{

	private UIManager uiManager;
	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
		uiManager.addObject(new UIImageButton(200, 200, 128, 64, Assets.btn_start, new ClickListener() {

			@Override
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}
		}));
		uiManager.addObject(new UIImage(100f, 100f, 296, 64, Assets.title));
		uiManager.addObject(new UIText(100f, 200f, "test"));
	}
	
	public void tick() {
		uiManager.tick();
	}

	
	public void render(Graphics g) {
		uiManager.render(g); 
	}

}
