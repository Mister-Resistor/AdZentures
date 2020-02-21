package dev.jbm.tilegame.ui;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.jbm.tilegame.gfx.Assets;

public class UIText extends UIObject{
	
	private String message;

	public UIText(float x, float y, String message) {
		super(x, y, 12, 20);
		this.message = message;
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		for(int i = 0; i < message.length(); i++) {
			char letter = message.toLowerCase().toCharArray()[i];
			switch(letter) {
			case 'a':
				g.drawImage(Assets.alphabet[1], (int) x  + i*16, (int) y, 12, 20, null);
			break;
			case 'b':
				g.drawImage(Assets.alphabet[2], (int) x  + i*16, (int) y, 12 , 20, null);
			break;
			case 'c':
				g.drawImage(Assets.alphabet[3], (int) x  + i*16, (int) y, 12 , 20, null);
			break;
			case 'd':
				g.drawImage(Assets.alphabet[4], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'e':
				g.drawImage(Assets.alphabet[5], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'f':
				g.drawImage(Assets.alphabet[6], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'g':
				g.drawImage(Assets.alphabet[7], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'h':
				g.drawImage(Assets.alphabet[8], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'i':
				g.drawImage(Assets.alphabet[9], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'j':
				g.drawImage(Assets.alphabet[10], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'k':
				g.drawImage(Assets.alphabet[11], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'l':
				g.drawImage(Assets.alphabet[12], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'm':
				g.drawImage(Assets.alphabet[13], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'n':
				g.drawImage(Assets.alphabet[14], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'o':
				g.drawImage(Assets.alphabet[15], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'p':
				g.drawImage(Assets.alphabet[16], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'q':
				g.drawImage(Assets.alphabet[17], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'r':
				g.drawImage(Assets.alphabet[18], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 's':
				g.drawImage(Assets.alphabet[19], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 't':
				g.drawImage(Assets.alphabet[20], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'u':
				g.drawImage(Assets.alphabet[21], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'v':
				g.drawImage(Assets.alphabet[22], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'w':
				g.drawImage(Assets.alphabet[23], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'x':
				g.drawImage(Assets.alphabet[24], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'y':
				g.drawImage(Assets.alphabet[25], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			case 'z':
				g.drawImage(Assets.alphabet[26], (int) x + i*16, (int) y, 12 , 20, null);
			break;
			
			}
		}
	}

	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		
	}

}
