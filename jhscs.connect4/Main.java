package jhscs.connect4;

import processing.core.PApplet;

public class Main extends PApplet {

	public static final int WINDOW_WIDTH = 800;
	public static final int WINDOW_HEIGHT = 600;
	
	public static void main(String[] args) {
		PApplet.main("jhscs.connect4.Main");
	}
	
	public void settings()
	{
		size(WINDOW_WIDTH, WINDOW_HEIGHT);
	}
	
	public void setup()
	{
		
	}
	
	public void draw()
	{
		background(51);
		noFill();
		strokeWeight(4);
		stroke(255);
		ellipse(mouseX, mouseY, 50, 50);
	}
}
