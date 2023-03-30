package tictactoe;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // write your code here
       Board gameBoard = new Board();
       Scanner sc = new Scanner(System.in);
       char[] userMoves = sc.next().toCharArray();

       gameBoard.setValues(userMoves);
       gameBoard.printBoard();
    }
}
