import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        boolean gameOver = false;
        char currentPlayer = 'X';

        while (!gameOver) {
            // Display the current state of the board
            displayBoard(board);

            // Get the current player's move
            System.out.println("Player " + currentPlayer + ", enter your move (row and column):");
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;

            // Check if the chosen position is valid
            if (isValidMove(board, row, col)) {
                // Make the move
                board[row][col] = currentPlayer;

                // Check for a winner or a tie
                if (checkWinner(board, currentPlayer)) {
                    displayBoard(board);
                    System.out.println("Player " + currentPlayer + " wins! Game Over!");
                    gameOver = true;
                } else if (isBoardFull(board)) {
                    displayBoard(board);
                    System.out.println("It's a tie! Game Over!");
                    gameOver = true;
                } else {
                    // Switch to the other player
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move. Please choose an empty position.");
            }
        }

        scanner.close();
    }

    private static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    private static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    private static boolean checkWinner(char[][] board, char player) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }

        // Check diagonals
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
