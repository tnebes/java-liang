/*
 * Players drop coloured disks into a seven column, six row vertically
 * suspended grid.
 *
 * The program prompts two players to drop a red or yellow disk alternately.
 * Whenever a disk is dropped, the program redisplays the board
 * on the console and determines the status of the game.
 */

public class ConnectFour {

	public static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			final int BOARD_X = 7;
			final int BOARD_Y = 6;
			int[][] board = new int[BOARD_Y][BOARD_X];
			final int MATCH = 4;
			// 1 = red, -1 = yellow, 0 = undecided or draw
			int player = 1, winner = 0;
			boolean boardFull = false;
			printBoard(board);
			do {
				playerTurn(board, player);
				player = -player;
				boardFull = !checkBoardFull(board);
				winner = checkWinner(board, MATCH);
			} while (boardFull && (winner == 0));

			if (winner != 0) {
				System.out.printf("Player %s won!\n", winner == 1 ? "red" : "yellow");
				System.out.printf("Rematch? Y/N ");
			} else {
				System.out.printf("Board filled. Retry? Y/N ");
			}
			if (input.next().toLowerCase().equals("n")) {
				System.out.print("Thanks for playing!\n");
				System.exit(0);
			}
		}
	}

	/**
	 * Checks whether the board is full. Returns true if it is.
	 * 
	 * @param board
	 * @return boolean
	 */
	public static boolean checkBoardFull(int[][] board) {
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
		System.out.print(" ");
		for (int i = 0; i < board[0].length; i++) {
			System.out.printf("%d ", i);
		}
		System.out.print("\n");
		for (int i = 0; i <= board[0].length * 2; i++) {
			System.out.printf("_", i);
		}
		System.out.print("\n");

		for (int i = 0; i < board.length; i++) {
			System.out.print("|");
			for (int j = 0; j < board[i].length; j++) {
				switch (board[i][j]) {
				case 1:
					disk = 'R';
					break;
				case -1:
					disk = 'Y';
					break;
				default:
					disk = ' ';
				}
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
	 * Checks all horizontal spots for winner
	 * 
	 * @param board
	 * @param MATCH
	 * @return playerid (int)
	 */
	public static int checkHorizontal(int[][] board, int MATCH) {
		int matched, player;
		for (int i = board.length - 1; i >= 0; i--) {
			player = board[i][0];
			matched = player != 0 ? 1 : 0;
			for (int j = 1; j < board[i].length; j++) {
				if (board[i][j] != 0) {
					if (player == board[i][j]) {
						matched++;
						if (matched == MATCH)
							return player;
					} else {
						player = board[i][j];
						matched = 1;
					}
				}
			}
		}
		return 0;
	}

	/**
	 * Checks all columns for winners
	 * 
	 * @param board
	 * @param MATCH
	 * @return playerid
	 */
	public static int checkVertical(int[][] board, int MATCH) {
		int matched, player;
		for (int i = 0; i < board[0].length; i++) {
			player = board[0][i];
			matched = player != 0 ? 1 : 0;
			for (int j = board.length - 1; j >= 0; j--) {
				if (board[j][i] == 0)
					break;
				if (board[j][i] != 0) {
					if (player == board[j][i]) {
						matched++;
						if (matched == MATCH)
							return player;
					} else {
						player = board[j][i];
						matched = 1;
					}
				}
			}
		}
		return 0;
	}

	/**
	 * Method calls two additional functions that check whether there is a winner to
	 * be found diagonally and antidiagonally.
	 * 
	 * @param board
	 * @param MATCH
	 * @return playerid
	 */
	public static int checkAcross(int[][] board, int MATCH) {
		int diagonalCheck = checkDiagonal(board, MATCH);
		if (diagonalCheck != 0)
			return diagonalCheck;
		else
			return checkAntidiagonal(board, MATCH);
	}

	/**
	 * Method checks diagonals for winners.
	 * 
	 * @param board
	 * @param MATCH
	 * @return playerid
	 */
	public static int checkDiagonal(int[][] board, int MATCH) {
		for (int i = 0; i < board.length - MATCH; i++) {
			for (int j = 0; j < board[0].length - MATCH; j++) {
				if (board[i][j] == -1)
					break;
				int player = board[i][j], matched = 1;
				for (int k = 1; k <= MATCH; k++) {
					try {
						if (player == board[i + k][j + k]) {
							matched++;
							if (matched == MATCH) {
								return player;
							}
						} else {
							player = board[i + k][j + k];
							matched = 1;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						break;
					}
				}
			}
		}
		return 0;
	}

	/**
	 * Method checks antidiagonals for winners.
	 * 
	 * @param board
	 * @param MATCH
	 * @return playerid
	 */
	public static int checkAntidiagonal(int[][] board, int MATCH) {
		for (int i = board.length - 1; i > board.length - MATCH; i--) {
			for (int j = 0; j < board[0].length - MATCH; j++) {
				if (board[i][j] == -1)
					break;
				int player = board[i][j], matched = 1;
				for (int k = 1; k <= MATCH; k++) {
					try {
						if (player == board[i - k][j + k]) {
							matched++;
							if (matched == MATCH) {
								return player;
							}
						} else {
							player = board[i - k][j + k];
							matched = 1;
						}
					} catch (ArrayIndexOutOfBoundsException e) {
						break;
					}
				}
			}
		}
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
			System.out.printf("Drop a %s disk at column (0 - %d)\n", playerColour, board[0].length - 1);
			diskDropped = dropDisk(board, player, input.nextInt());
		} while (!diskDropped);

		printBoard(board);
	}

	/**
	 * Drops a disk in the selected column for a player. Returns true if the disk
	 * has been dropped.
	 * 
	 * @param board
	 * @param player
	 * @param column
	 * @return boolean
	 */
	public static boolean dropDisk(int[][] board, int player, int column) {
		if (column > board.length || column < 0) {
			System.out.printf("Column %d does not exist.\n", column);
			return false;
		} else if (checkColumnFilled(board, column)) {
			System.out.printf("Column %d is filled.\n", column);
			return false;
		}

		for (int i = board.length - 1; i >= 0; i--) {
			if (board[i][column] == 0) {
				board[i][column] = player;
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks whether the selected column in the board is filled.
	 * 
	 * @param board
	 * @param column
	 * @return boolean
	 */
	public static boolean checkColumnFilled(int[][] board, int column) {
		for (int i = board.length - 1; i >= 0; i--) {
			if (board[i][column] == 0) {
				return false;
			}
		}
		return true;
	}

}
