package com.cst.kurruk;

import org.newdawn.slick.*;
import entities.Player;

public class Slick2D extends BasicGame {
	private Image background;
	private Player player;
	
	public Slick2D() {
		super("Side Scroller");
	}
	
	@Override
	public void init(GameContainer gamecontainer) throws SlickException {
		background = new Image("background.jpg");
		player = new Player(new Image("player.jpg"), 236, 160);
	}
	
	@Override
	public void update(GameContainer gamecontainer, int i) throws SlickException {
		player.update();
	}
	
	@Override
	public void render(GameContainer gamecontainer, Graphics graphics) throws SlickException {
		background.draw();
		player.render();
	}
	
	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new Slick2D());
		
		app.setMinimumLogicUpdateInterval(5);
		app.setMaximumLogicUpdateInterval(5);
		app.setDisplayMode(1280, 720, false);
		app.setShowFPS(false);
		app.start();
	}
	

}
