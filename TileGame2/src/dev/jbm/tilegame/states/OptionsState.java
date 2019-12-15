package dev.jbm.tilegame.states;

import java.awt.Graphics;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.gfx.Assets;

public class OptionsState extends State{

	public OptionsState(Handler handler) {
		super(handler);
	}
	
	public void tick() {
		
		
	}

	
	public void render(Graphics g) {
		g.drawImage(Assets.dirt, 0,0,null);
	}

}
