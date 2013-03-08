package entities;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;

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

	public void update(gamecontainer) {
		Input input = gamecontainer.getInput();
		if (input.isKeyDown(Input.KEY_D)) {
			x += 0.5f;
		}
		
		if (input.isKeyDown(Input.KEY_A)) {
			x -= 0.5f;
		}
		
		if (input.isKeyDown(Input.KEY_W)) {
			y += 0.2f;
		}
		
		if (input.isKeyDown(Input.KEY_S)) {
			y -= 0.2f;
		}
		
	}

}
