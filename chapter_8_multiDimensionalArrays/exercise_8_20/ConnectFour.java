/*
 * Players drop coloured disks into a seven column, six row vertically
 * suspended grid.
 *
 * The program prompts two players to drop a red or yellow disk alternately.
 * Whenever a disk is dropped, the program redisplays the board
 * on the console and determines the status of the game.
 */

import java.util.Scanner;

public class ConnectFour {

	public static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int[][] board = new int[6][7];
		final int MATCH = 4;
		// 1 = red, -1 = yellow, 0 = undecided or draw
		int player = 1;
		printBoard(board);
		do {
			playerTurn(board, player);
			player = -player;
		} while (!isBoardFull(board) && (checkWinner(board, MATCH) != 0));
	}

	/**
	 * Checks whether the board is full. Returns true if it is.
	 * 
	 * @param board
	 * @return boolean
	 */
	public static boolean isBoardFull(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0)
					return false;
			}
		}
		return true;
	}

	/**
	 * prints the board to console.
	 * 
	 * @param board
	 */
	public static void printBoard(int[][] board) {
		char disk = ' ';
		for (int i = 0; i < board.length; i++) {
			System.out.print("|");
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 0)
					disk = ' ';
				else if (board[i][j] == 1)
					disk = 'R';
				else
					disk = 'Y';
				System.out.printf("%c|", disk);
			}
			System.out.print("\n");
		}
		for (int i = 0; i < board[0].length * 2 + 1; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

	/**
	 * Checks the winner by checking horizontal, vertical and all diagonals for 4
	 * hits.
	 * 
	 * @param board
	 * @param MATCH
	 * @return
	 */
	public static int checkWinner(int[][] board, int MATCH) {
		int horizontalCheck = checkHorizontal(board, MATCH);
		if (horizontalCheck != 0)
			return horizontalCheck;
		int verticalCheck = checkVertical(board, MATCH);
		if (verticalCheck != 0)
			return verticalCheck;
		int acrossCheck = checkAcross(board, MATCH);
		if (acrossCheck != 0)
			return acrossCheck;

		return 0;
	}

	/**
	 * 
	 * @param board
	 * @param MATCH
	 * @return
	 */
	public static int checkHorizontal(int[][] board, int MATCH) {
		return 0;
	}

	/**
	 * 
	 * @param board
	 * @param MATCH
	 * @return
	 */
	public static int checkVertical(int[][] board, int MATCH) {
		return 0;
	}

	/**
	 * 
	 * @param board
	 * @param MATCH
	 * @return
	 */
	public static int checkAcross(int[][] board, int MATCH) {
		int diagonalCheck = checkDiagonal(board, MATCH);
		if (diagonalCheck != 0)
			return diagonalCheck;
		else
			return checkAntidiagonal(board, MATCH);
	}

	/**
	 * 
	 * @param board
	 * @param MATCH
	 * @return
	 */
	public static int checkDiagonal(int[][] board, int MATCH) {
		return 0;
	}

	/**
	 * 
	 * @param board
	 * @param MATCH
	 * @return
	 */
	public static int checkAntidiagonal(int[][] board, int MATCH) {
		return 0;
	}

	/**
	 * 
	 * @param board
	 * @param player
	 */
	public static void playerTurn(int[][] board, int player) {
		String playerColour = player == 1 ? "red" : "yellow";
		boolean diskDropped = false;
		do {
			System.out.printf("Drop a %s disk at column (0 - %d)\n", playerColour, board[0].length);
			diskDropped = dropDisk(board, player, input.nextInt());
		} while (!diskDropped);

		printBoard(board);
	}

	public static boolean dropDisk(int[][] board, int player, int column) {
		if (column > board.length) {
			System.out.printf("Column %d does not exist.\n");
			return false;
		} else if (checkColumnFilled(board, column)) {
			System.out.printf("Column %d is filled.\n");
			return false;
		}

		for (int i = 0; i < board[0].length; i++) {
			for (int j = board.length - 1; j >= 0; j--) {
				if (board[j][i] == 0) {
					board[j][i] = player;
					return true;
				}
			}
		}
		return false;
	}

	public static boolean checkColumnFilled(int[][] board, int column) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {

			}
		}
		return false;
	}

}
