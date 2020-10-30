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
		int counter = 2;
		//check horizontal win potentials
		for (int i = 0; i < board.length; i++) {
			for (int j = 1; j < board[i].length; j++) {
				if (board[i][0] == board[i][j])
					counter--;
				else
					break;
			}
			if (counter == 0)
				return board[i][0];
			counter = 2;
		}
		//check vertical win potentials
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 1; j < board.length; j++) {
				if (board[0][i] == board[j][i])
					counter--;
				else
					break;
			}
			if (counter == 0)
				return board[0][i];
			counter == 2;
		}
		//check diagonal win potentials
		for (int i = 1; i < board.length; i++) {
			if (board[i - 1][i - 1] == board[i][i])
				counter--;
			else
				break;
		}
		if (counter == 0)
			return board[0][i];
		counter == 2;
		for (int i = board.length - 1; i > 0; i--) {
			if (board[board.length - 1][board.length - 1]
				== board[board.length - 1 - i][board.length - 1 - i]) {
				counter --;
			} else
				break;
		}
		if (counter == 0)
			return board[board.length - 1][board.length - 1];
		counter == 2;
		return 0;
	}

	public static void makeMove(int[][] board, int player) {
		int row, column;
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.printf("Player %d's move!\n", player);
		boolean validMove = false;
		do {
			
		} while (!validMove)


	}

}
