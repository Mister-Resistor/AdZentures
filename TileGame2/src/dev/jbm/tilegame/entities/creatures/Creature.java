package dev.jbm.tilegame.entities.creatures;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.entities.Entity;
import dev.jbm.tilegame.tile.Tile;

public abstract class Creature extends Entity {
	
	public static final float DEFAULT_SPEED = 3.0f,
			DEFAULT_FALLING_SPEED = 0.5f;
	public static final int DEFAULT_CREATURE_WIDTH = 36,
							DEFAULT_CREATURE_HEIGHT = 32;
	
	protected float speed;
	protected float xMove, yMove;
	protected boolean canJump;

	public Creature(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = -10;
	}
	
	public void move(){
		if(!checkEntityCollisions(xMove, 0f))
			moveX();
		if(checkEntityCollisions(0f, yMove)) {
			canJump = true;
			yMove = 1;
		}
		if(!checkEntityCollisions(0f, yMove)) {
			moveY();
			checkGravity();
		}
	}
	
	//Collision detection going...
	
	public void moveX() {
		if (xMove > 0) {//right 
			int tx = (int) (x + xMove+bounds.x+bounds.width) / Tile.TILEWIDTH;
			
			if(!collisionWithTile(tx, (int) (y+bounds.y) /Tile.TILEHEIGHT) &&
					!collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT )) {
				x+= xMove;
			}else {
				x = tx * Tile.TILEWIDTH - bounds.x - bounds.width -1;
			}
		}else if(xMove < 0) {//left
			int tx = (int) (x + xMove+bounds.x) / Tile.TILEWIDTH;
			
			if(!collisionWithTile(tx, (int) (y+bounds.y) /Tile.TILEHEIGHT) &&
					!collisionWithTile(tx, (int) (y + bounds.y + bounds.height) / Tile.TILEHEIGHT )) {
				x+= xMove;
			}else {
				x = tx * Tile.TILEWIDTH + Tile.TILEWIDTH - bounds.x;
			}
		}
	}
	
	public void moveY() {
		if (yMove < 0) {//up
			int ty = (int) (y+yMove +bounds.y) / Tile.TILEHEIGHT;
			
			if(!collisionWithTile((int) (x+bounds.x) /Tile.TILEHEIGHT, ty) &&
					!collisionWithTile((int) (x+bounds.x + bounds.width) /Tile.TILEHEIGHT, ty)){
				y+=yMove;
			}else {
				y = ty * Tile.TILEHEIGHT + Tile.TILEHEIGHT - bounds.y;
				yMove = 1;
			}
		}
	}
	
	public void checkGravity() {
		if(yMove > 0) {//down
			int ty = (int) (y+yMove +bounds.y+bounds.height) / Tile.TILEHEIGHT;
			
			if(!collisionWithTile((int) (x+bounds.x) /Tile.TILEHEIGHT, ty) &&
					!collisionWithTile((int) (x+bounds.x + bounds.width) /Tile.TILEHEIGHT, ty)){
				y+=yMove;
				canJump = false;
			}else{
				y = ty * Tile.TILEHEIGHT - bounds.y - bounds.height - 1;
				yMove = 1;
				canJump = true;
			}
		}
	}
	
	public abstract void canFall();
	
	protected boolean collisionWithTile(int x, int y) {
		return handler.getWorld().getTile(x,y).isSolid();
	}
	
	//GETTERS SETTERS

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
}