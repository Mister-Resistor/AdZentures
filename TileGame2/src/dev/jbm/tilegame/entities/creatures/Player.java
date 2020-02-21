package dev.jbm.tilegame.entities.creatures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.entities.Entity;
import dev.jbm.tilegame.entities.EntityManager;
import dev.jbm.tilegame.gfx.Animation;
import dev.jbm.tilegame.gfx.Assets;
import dev.jbm.tilegame.ui.UIManager;
import dev.jbm.tilegame.ui.UIText;

public class Player extends Creature {
	
	private Animation animRight, animLeft;
	private UIManager uiManager;
	private int upgradePoints;
	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		bounds.x = 5;
		bounds.y = 9;
		bounds.width = 23;
		bounds.height = 20;
		
		//Animations
		animRight = new Animation(100, Assets.player_right);
		animLeft = new Animation(100, Assets.player_left);
	}

	@Override
	public void tick() {
		animRight.tick();
		animLeft.tick();
		getInput();
		move();
		handler.getGameCamera().centerOnEntity(this);
		canFall();
	}
	
	public void die() {
		System.out.println("you lose");
	}
	
	private void getInput(){
		xMove = 0;
		
		if(handler.getKeyManager().up)
			if(canJump) {
				yMove = -10;		
				canJump = false;
			}
		if(handler.getKeyManager().left)
			xMove = -speed;
		if(handler.getKeyManager().right)
			xMove = speed;
		if(handler.getKeyManager().interact && getCollisionType(0f,0f,4)) {
			System.out.println("sign");
		}
			
	}
	
	public void canFall(){
		if(!canJump)
			yMove = yMove + DEFAULT_FALLING_SPEED;
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
	//show hitbox	
	//g.setColor(Color.red);
	//g.fillRect((int) (x+bounds.x - handler.getGameCamera().getxOffset()), (int) (y+bounds.y - handler.getGameCamera().getyOffset()), bounds.width, bounds.height);
	}

	private BufferedImage getCurrentAnimationFrame() {
		if(xMove < 0) {
			return animLeft.getCurrentFrame();
		}else if(xMove > 0) {
			return animRight.getCurrentFrame();
		}else{
			if(handler.getLastKey() == 0) {
				return Assets.player_left[0];
			}else{ 
				return Assets.player_right[4];
			}
		}
		//to add jumping anim, add else if (ymove > 0) or whatever
	}
	
	public int getType() {
		return 0;
	}

	public int getUpgradePoints() {
		return upgradePoints;
	}

	public void setUpgradePoints(int upgradePoints) {
		this.upgradePoints = upgradePoints;
	}

	@Override
	public void interact() {
		// TODO Auto-generated method stub
		
	}
	
}
