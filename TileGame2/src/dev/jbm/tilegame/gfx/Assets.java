package dev.jbm.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 64, height = 64;
	private static final int playerwidth = 72;

	public static BufferedImage grass, dirt, stone, air, null_, fence, sign, title, lightGrass, darkGrass, crystal, bouncer,
		black_hole, anvil, dBlock;
	public static BufferedImage[] player_left, player_right, btn_start, alphabet, numbersAndChars;
	
	public static void init() {
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/spritesheet.png"));
		
		player_left = new BufferedImage[5];
		player_right = new BufferedImage[5];
		btn_start = new BufferedImage[2];
		alphabet = new BufferedImage[27];
		
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
		
		alphabet[0] = sheet.crop(width*5 + 4, height*3 + 28, 12, 20); //?
		alphabet[1] = sheet.crop(width*4 + 4, height*3 + 4, 12, 20); //a
		alphabet[2] = sheet.crop(width*4 + 20, height*3 + 4, 12, 20); //b
		alphabet[3] = sheet.crop(width*4 + 36, height*3 + 4, 12, 20); //c
		alphabet[4] = sheet.crop(width*4 + 52, height*3 + 4, 12, 20); //d
		alphabet[5] = sheet.crop(width*5 + 4, height*3 + 4, 12, 20); //e
		alphabet[6] = sheet.crop(width*5 + 20, height*3 + 4, 12, 20); //f
		alphabet[7] = sheet.crop(width*5 + 36, height*3 + 4, 12, 20); //g
		alphabet[8] = sheet.crop(width*5 + 52, height*3 + 4, 12, 20); //h
		alphabet[9] = sheet.crop(width*6 + 4, height*3 + 4, 12, 20); //i
		alphabet[10] = sheet.crop(width*6 + 20, height*3 + 4, 12, 20); //j
		alphabet[11] = sheet.crop(width*6 + 36, height*3 + 4, 12, 20); //k
		alphabet[12] = sheet.crop(width*6 + 52, height*3 + 4, 12, 20); //l
		alphabet[13] = sheet.crop(width*7 + 4, height*3 + 4, 12, 20); //m
		alphabet[14] = sheet.crop(width*7 + 20, height*3 + 4, 12, 20); //n
		alphabet[15] = sheet.crop(width*7 + 36, height*3 + 4, 12, 20); //o
		alphabet[16] = sheet.crop(width*7 + 52, height*3 + 4, 12, 20); //p
		alphabet[17] = sheet.crop(width*8 + 4, height*3 + 4, 12, 20); //q
		alphabet[18] = sheet.crop(width*8 + 20, height*3 + 4, 12, 20); //r
		alphabet[19] = sheet.crop(width*8 + 36, height*3 + 4, 12, 20); //s
		alphabet[20] = sheet.crop(width*8 + 52, height*3 + 4, 12, 20); //t
		alphabet[21] = sheet.crop(width*9 + 4, height*3 + 4, 12, 20); //u
		alphabet[22] = sheet.crop(width*9 + 20, height*3 + 4, 12, 20); //v
		alphabet[23] = sheet.crop(width*9 + 36, height*3 + 4, 12, 20); //w
		alphabet[24] = sheet.crop(width*9 + 52, height*3 + 4, 12, 20); //x
		alphabet[25] = sheet.crop(width*10 + 4, height*3 + 4, 12, 20); //y
		alphabet[26] = sheet.crop(width*10 + 20, height*3 + 4, 12, 20); //z
		
		grass = sheet.crop(width*3, 0, width, height);
		dirt = sheet.crop(width*4, 0, width, height);
		stone = sheet.crop(width*5, 0, width, height);
		air = sheet.crop(0, height, width, height);
		null_ = sheet.crop(0,0,width,height);
		fence = sheet.crop(width*2 +20, 0, 24, height);
		sign = sheet.crop(width, 0, width, height);
		title = sheet.crop(width*5, height*2, width*4 + 40, height);
		crystal = sheet.crop(width*2+20, height, 24, height);
		lightGrass = sheet.crop(width, height*2, width, height);
		darkGrass = sheet.crop(width*2, height*2, width, height);
		bouncer = sheet.crop(width, height + (height/2), width, height/2);
	}
	
}
