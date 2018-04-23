package jhscs.connect4;

import jhscs.connect4.game.Game;
import jhscs.connect4.gui.GUIManager;
import processing.core.PApplet;

public class Main extends PApplet {

	public static final int WINDOW_WIDTH = 800; 
	public static final int WINDOW_HEIGHT = 600;
	
	GUIManager gui;
	Game game;
	
	public static void main(String[] args) {
		System.out.println("MAIN");
		PApplet.main("jhscs.connect4.Main");
	}
	
	public void settings()
	{
		size(WINDOW_WIDTH, WINDOW_HEIGHT);
	}
	
	public void setup()
	{
		System.out.println("ENUM: " + GameState.START_MENU);
		gui = new GUIManager(game, WINDOW_WIDTH, WINDOW_HEIGHT);
	}
	
	public void draw()
	{
//		background(51);
//		noFill();
//		strokeWeight(4);
//		stroke(255);
//		ellipse(mouseX, mouseY, 50, 50);
		//gui.show(this);
	}
}
