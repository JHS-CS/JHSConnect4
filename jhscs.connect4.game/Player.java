package jhscs.connect4.game;

/**
 * Abstract player, holding the basics for how players 
 * will behave in the game 
 * @author Cameron White
 *
 */
public abstract class Player {

	private AbstractPlayerController brain;
	private char marker;
	
	public Player(char marker)
	{
		this.marker = marker;
	}
	
	/**
	 * Gets the next move from the player using the brain.getMove() function
	 * @return - an int representing the column index of the player's move
	 */
	public int getMove()
	{
		return brain.getMove();
	}

	public AbstractPlayerController getBrain() {
		return brain;
	}

	public void setBrain(AbstractPlayerController brain) {
		this.brain = brain;
	}

	public char getMarker() {
		return marker;
	}

	public void setMarker(char marker) {
		this.marker = marker;
	}
	
}
