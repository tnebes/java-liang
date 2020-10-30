/* Create a program for playing a tic-tac-toe game.
 * The program prompts two players to alternately enter an X
 * token and O token. Whenever a token is entered, the
 * program redisplays the board on the console and
 * determines the status of the game.
 */

public class TicTacToe {
	public static void main(String[] args) {
		int[][] board = new int[3][3];
		int availableMoves = board.length * board[i].length;
		int playerTurn = 1;
		printBoard(board);
		// 1 is X, -1 is O
		while (availableMoves > 0 || findWinnner(board) != 0) {
			makeMove(board, playerTurn);
			availableMoves--;
			playerTurn = -playerTurn;
		}
	
	}

	/** prints the board */
	public static void printBoard(int[][] board) {
		char token;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j <= 12; j++) {
				System.out.print("-");
			}
			System.out.print("\n");
			System.out.print("|");
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 1)
					token = 'X';
				else if (board[i][j] == -1)
					token = 'O';
				else
					token = ' ';
				System.out.printf(" %c |", token);
			}
			System.out.print("\n");
		}
		for (int j = 0; j <= 12; j++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

	/* inefficient way of checking whether there's a winner
	 * A counter would be better.
	public static boolean boardFilled(board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0)
					return false;
			}
		}
		return true;
	}
	*/

	public static int findWinner(board) {
		int winner = 0;

	}
}
