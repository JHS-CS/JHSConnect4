package jhscs.connect4.game;

/**
 * Lets describe what the point of this class is for future reference,
 * that way we won't have to read code to understand what's going on.
 */
public class GameBoard {
    // where are the access modifiers? (remember encapsulation)
    char[][] board;
    // what is skip amount?
    int SKIP_AMOUNT, COLUMNS, ROWS; // <-- these are instance variables, but labeled as constants (All caps)
                                    // 
    char PLAYER1, PLAYER2; // <-- these are instance variables, but labeled as constants
    
    /**
     * If this class is to be used for different sized boards,
     * have static row and col variables to generate a blank
     * 2D array programmatically as the default array.
     */
    char[][] DEFAULT_BOARD = {{'N', 'N', 'N', 'N', 'N', 'N', 'N'}, // This should be static
                              {'N', 'N', 'N', 'N', 'N', 'N', 'N'},
                              {'N', 'N', 'N', 'N', 'N', 'N', 'N'},
                              {'N', 'N', 'N', 'N', 'N', 'N', 'N'},
                              {'N', 'N', 'N', 'N', 'N', 'N', 'N'},
                              {'N', 'N', 'N', 'N', 'N', 'N', 'N'}};
                              
    /**
     * Consider using the overloaded constructors using this()
     * You have redundant code in the multiple constructors, although I
     * appreciate allowing for different ways to create a game board
     */ 
    public GameBoard() {
        SKIP_AMOUNT = 4;
        board = DEFAULT_BOARD;
        ROWS = 6; // <-- Maybe static variables to hold Connect4 dimensions
        COLUMNS = 7;
        PLAYER1 = '1'; // <-- maybe the default values should be static variables
        PLAYER2 = '2';
    }
    
    public GameBoard(int cols, int rows, int skip) {
        SKIP_AMOUNT = skip;
        board = new char[rows][cols];
        ROWS = rows;
        COLUMNS = cols;
        PLAYER1 = '1';
        PLAYER2 = '2';
        reset();
    }
    
    public GameBoard(int cols, int rows, int skip, char p1, char p2) {
        SKIP_AMOUNT = skip;
        board = new char[rows][cols];
        ROWS = rows;
        COLUMNS = cols;
        PLAYER1 = p1;
        PLAYER2 = p2;
        reset();
    }
    
    public GameBoard(char p1, char p2) {
        SKIP_AMOUNT = 4;
        board = DEFAULT_BOARD;
        ROWS = 6;
        COLUMNS = 7;
        PLAYER1 = p1;
        PLAYER2 = p2;
    }
    
    public void reset() {
        for(int row = ROWS; row > 0; row--) {
            for(int col = 0; col < COLUMNS; col++) {
                board[row][col] = 'N';
            }
        }
    }
    
    public boolean addMove(int col, String player) {
        try {
            for(int row = 0; ROWS > row; row--) {
                if(board[row][col] == 'N') {
                    board[row][col] = player.equalsIgnoreCase("player1")? PLAYER1: PLAYER2;
                }
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return true;
    }
    
    public boolean checkWin(int col, int row) {
        return true;
    }
}
