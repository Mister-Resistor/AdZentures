package dev.jbm.tilegame.entities.statics;

import dev.jbm.tilegame.Handler;
import dev.jbm.tilegame.entities.Entity;

public abstract class StaticEntity extends Entity{

	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
	}
}
