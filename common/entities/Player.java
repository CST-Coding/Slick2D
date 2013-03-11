package entities;

import org.newdawn.slick.*;

public class Player {
	private final Image image;
	private float x;
	private float y;
	private final float width;
	private final float hight;
	
	public Player(Image image, float width, float hight) {
		this.image = image;
		this.width = width;
		this.hight = hight;
	
		
	}

	public void render() {
		image.draw(x, y);
		
	}

	public void update(GameContainer gamecontainer) {
		Input input = gamecontainer.getInput();
		if (input.isKeyDown(Input.KEY_D)||input.isKeyDown(Input.KEY_RIGHT)) {
			x += 0.5f;
		}
		
		if (input.isKeyDown(Input.KEY_A)||input.isKeyDown(Input.KEY_LEFT)) {
			x -= 0.5f;
		}
		
		if (input.isKeyDown(Input.KEY_W)||input.isKeyDown(Input.KEY_UP)) {
			y -= 0.5f;
		}
		
		if (input.isKeyDown(Input.KEY_S)||input.isKeyDown(Input.KEY_DOWN)) {
			y += 0.5f;
		}
		
	}

}