package org.example;

public class TicTacToe {

    public static void printBoard(int[] board) {
        for (int i = 0; i < 9; i++) {
            if (board[i] == 0) {
                System.out.print(". ");
            } else if (board[i] == 1) {
                System.out.print("X ");
            } else if (board[i] == 2) {
                System.out.print("O ");
            }
            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[] board = {1, 2, 0, 2, 1, 1, 0, 0, 2};
        printBoard(board);
    }
}