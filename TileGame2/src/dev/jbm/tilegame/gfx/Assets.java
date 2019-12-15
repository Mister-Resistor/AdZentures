package dev.jbm.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 64, height = 64;
	private static final int playerwidth = 72;

	public static BufferedImage grass, dirt, stone, air, null_, fence, sign;
	public static BufferedImage[] player_left, player_right, btn_start;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet.png"));
		
		player_left = new BufferedImage[5];
		player_right = new BufferedImage[5];
		btn_start = new BufferedImage[2];
		
		btn_start[0] = sheet.crop(width*3, height, width*2, height);
		btn_start[1] = sheet.crop(width*3, height*2, width*2, height);
		
		player_left[0] = sheet.crop(width*6, 0, playerwidth, height);
		player_left[1] = sheet.crop(width*6 + playerwidth,0, playerwidth, height);
		player_left[2] = sheet.crop(width*6 + playerwidth*2, 0, playerwidth, height);
		player_left[3] = sheet.crop(width*6 + playerwidth*3, 0, playerwidth, height);
		player_left[4] = sheet.crop(width*6+ playerwidth*4, 0, playerwidth, height);
		
		player_right[0] = sheet.crop(width*6, height, playerwidth, height);
		player_right[1] = sheet.crop(width*6 + playerwidth, height, playerwidth, height);
		player_right[2] = sheet.crop(width*6 + playerwidth*2, height, playerwidth, height);
		player_right[3] = sheet.crop(width*6 + playerwidth*3, height, playerwidth, height);
		player_right[4] = sheet.crop(width*6 + playerwidth*4, height, playerwidth, height);
		
		grass = sheet.crop(width*3, 0, width, height);
		dirt = sheet.crop(width*4, 0, width, height);
		stone = sheet.crop(width*5, 0, width, height);
		air = sheet.crop(0, height, width, height);
		null_ = sheet.crop(0,0,width,height);
		fence = sheet.crop(width*2, 0, width, height);
		sign = sheet.crop(width, 0, width, height);
	}
	
}
