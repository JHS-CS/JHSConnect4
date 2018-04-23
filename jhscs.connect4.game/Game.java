package jhscs.connect4.game;

/**
 * Class representing one game running, containing references to the players
 * and general functionality for progressing the game.
 * @author Cameron White
 *
 */
public class Game
{	
	private GameBoard board;
	// Note: the order of these don't matter
	private Player player1;
	private Player player2;
	
	// should be true only when it is player1's turn, false for player2
	private boolean player1Turn;
	
	/**
	 * Constructs a new Game, using references to the player objects
	 * @param player1 - first player
	 * @param player2 - first player
	 */
	public Game(Player player1, Player player2)
	{
		this.player1 = player1;
		this.player2 = player2;
		
		// initialize board
		board = new GameBoard();
	}
	
	/** ADD FUNCTIONS */
	/**
	 * Applies the next move to the game
	 * @return - true if the move was successfully applied to the board
	 */
	public boolean nextMove()
	{
		Player next = player1;
		if (!player1Turn)
		{
			next = player2;
		}
		
		int move = next.getMove();
		// return board.addMove(move, next);
		return false;
	}

	public GameBoard getBoard() {
		return board;
	}

	public void setBoard(GameBoard board) {
		this.board = board;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
}
