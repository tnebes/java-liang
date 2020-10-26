/* The Eight Queens puzzle is to place
 * eight queens on a chessboard
 * such that no two queens can attack each other
 * (no two queens are on the same row, same column, same diagonal)
 * There are many possible solutions.
 * Write a program that displays one such solution.
 *
 * Notes: chessboard is 8x8
 */

/* program is called five queens because it only outputs five
 * and it should output 8 queens.
 */

public class FiveQueens {


	public static void main(String[] args) {

		int[][] board = new int[8][8];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				placeQueen(board, j, i);
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print("|");
				if (board[i][j] == 1)
					System.out.print("Q");
				else if (board[i][j] == -1)
					System.out.print("_");
				else
					System.out.print(" ");
			}
			System.out.print("|\n");
		}

	}

	public static void placeQueen(int[][] board, int x, int y) {
	/** method checks whether the board at coordinates is 0. If true,
	 * places the queen and populates the board with her paths. */

		if (board[x][y] == 0) {
			populatePaths(board, x, y);
			board[x][y] = 1;
			System.out.print("Placed a queen!\n");
		}
	}

	public static void populatePaths(int[][] board, int x, int y) {
		/** populates the paths that the queen can take.*/

		// diagonal population
		populateXLeftYUp(board, x, y);
		populateXRightYUp(board, x, y);
		populateXLeftYDown(board, x, y);
		populateXRightYDown(board, x, y);

		//horizontal and vertical population
		populateX(board, y);
		populateY(board, x);
	}

	public static void populateXLeftYUp(int[][] board, int x, int y) {
		
		while (x >= 0 && y >= 0) {
			board[x--][y--] = -1;
		}

	}

	public static void populateXRightYUp(int[][] board, int x, int y) {
		
		while (x < board.length && y >= 0) {
			board[x++][y--] = -1;
		}

	}

	public static void populateXLeftYDown(int[][] board, int x, int y) {
	
		while (x >= 0 && y < board[x].length) {
			board[x--][y++] = -1;
		}

	}

	public static void populateXRightYDown(int[][] board, int x, int y) {
	
		while (x < board.length && y < board[x].length) {
			board[x++][y++] = -1;
		}

	}

	public static void populateX(int[][] board, int y) {
		for (int x = 0; x < board[y].length; x++) {
			board[x][y] = -1;
		}
	
	}

	public static void populateY(int[][] board, int x) {
		
		for (int y = 0; y < board.length; y++) {
			board[x][y] = -1;
		}
	}

}
