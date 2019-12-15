package dev.jbm.tilegame.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener{

	private boolean[] keys;
	private int lastPressedKey;
	public boolean up,down,left,right;
	public boolean attack;
	
	public KeyManager() {
		keys = new boolean[256];
	}
	
	public void tick() {
		up = keys[KeyEvent.VK_W];
		down = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_A];
		right = keys[KeyEvent.VK_D];
		setLastPressed();
		attack = keys[KeyEvent.VK_SPACE];
	}
	
	public void setLastPressed() {
		if(right == true) {
			lastPressedKey = 1;
		}else if(left == true) {
			lastPressedKey = 0;
		}
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
		System.out.println("pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	public int getLastPressed() {
		return lastPressedKey;
	}
	
}
