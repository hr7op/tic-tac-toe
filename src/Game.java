import java.util.Scanner;

public class Game {

    static Scanner in = new Scanner(System.in);

    private static String color(char ch) {
        if (ch == 'X')
            return "\033[31m" + ch + "\033[0m";
        return "\033[34m" + ch + "\033[0m";
    }

    private static void render(char[][] board) {

        for (int i = 0; i < 3; i++) {
            System.out.printf(" %s | %s | %s\n", color(board[i][0]), color(board[i][1]), color(board[i][2]));
            if (i < 2)
                System.out.println("---+---+---");
        }
    }

    private static boolean check(int userRow, int userCol, char user, char matrix[][]) {
        // Check row
        if (matrix[userRow][0] == user && matrix[userRow][1] == user && matrix[userRow][2] == user)
            return true;
        // Check column
        if (matrix[0][userCol] == user && matrix[1][userCol] == user && matrix[2][userCol] == user)
            return true;
        // Check main diagonal
        if (userRow == userCol) {
            if (matrix[0][0] == user && matrix[1][1] == user && matrix[2][2] == user)
                return true;
        }
        // Check anti-diagonal
        if (userRow + userCol == 2) {
            if (matrix[0][2] == user && matrix[1][1] == user && matrix[2][0] == user)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        char[][] board = {
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' },
                { ' ', ' ', ' ' }
        };

        ClearScreen.clearConsole();
        System.out.println("\033[93mTIC TAC TOE\033[0m" + "\n");
        render(board);

        int moves = 0;
        char currentPlayer = 'X';
        boolean win = false;

        while (moves < 9 && !win) {
            if (currentPlayer == 'X') {
                User1.input(in);
                int row = User1.user1Row - 1;
                int col = User1.user1Col - 1;
                if (board[row][col] == ' ') {
                    board[row][col] = 'X';
                    moves++;
                    ClearScreen.clearConsole();
                    System.out.println("\033[93mTIC TAC TOE\033[0m" + "\n");
                    render(board);
                    win = check(row, col, 'X', board);
                    if (win) {
                        System.out.println("\n\033[31mX ~ WINS\033[0m");
                        break;
                    }
                    currentPlayer = 'O';
                }
            } else {
                User2.input(in);
                int row = User2.user2Row - 1;
                int col = User2.user2Col - 1;
                if (board[row][col] == ' ') {
                    board[row][col] = 'O';
                    moves++;
                    ClearScreen.clearConsole();
                    System.out.println("\033[93mTIC TAC TOE\033[0m" + "\n");
                    render(board);
                    win = check(row, col, 'O', board);
                    if (win) {
                        System.out.println("\n\033[34mO ~ WINS\033[0m");
                        break;
                    }
                    currentPlayer = 'X';
                }
            }
        }
        if (!win) {
            System.out.println("\n~ DRAW ~");
        }
    }
}