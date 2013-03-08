package entities;

import org.newdawn.slick.Image;

public class player {
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

}
