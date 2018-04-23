package jhscs.connect4.game;

/**
 * Interface to design how a controller for a player 
 * will function
 * 
 * @author Cameron White
 *
 */
public interface AbstractPlayerController {

	/**
	 * Get the next move
	 * @return - an int representing the column index of the player's move
	 */
	public abstract int getMove();
	
	/**
	 * @return - a general description on how this controller controls the player
	 */
	public default String getDescription()
	{
		return "Generic Player Controller.";
	}
	
}
