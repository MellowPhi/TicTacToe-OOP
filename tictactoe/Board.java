package tictactoe;

import java.util.Random;
public class Board {
    private final BoardValue[][] gameBoard;
    Board(){
        this.gameBoard = new BoardValue[3][3];
    }
    Random rand = new Random();

    public void printBoard(){
        System.out.println("---------");
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < gameBoard[0].length; j++) {
                if (j == gameBoard[0].length - 1) {
                    System.out.println(gameBoard[i][j].getValue() + " |");
                } else {
                    System.out.print(gameBoard[i][j].getValue() + " ");
                }
            }
        }
        System.out.println("---------");
    }

    public void setMove(int x, int y, BoardValue value) {
        gameBoard[x][y] = value;
    }

    public void fillRandom() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                setMove(i, j, rand.nextBoolean() ? BoardValue.CROSS : BoardValue.NOUGHT);
            }
        }
    }

    public void setValues(char[] values) {
        int index = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                BoardValue value = convertCharToBoardValue(values[index]);
                setMove(i, j, value);
                index++;
            }
        }
    }

    private BoardValue convertCharToBoardValue(char value) {
        BoardValue convertedValue;
        if (BoardValue.CROSS.getValue() == value) {
            convertedValue = BoardValue.CROSS;
        } else if (BoardValue.NOUGHT.getValue() == value) {
            convertedValue = BoardValue.NOUGHT;
        } else {
            convertedValue = BoardValue.EMPTY;
        }
        return convertedValue;
    }

    public void clearBoard() {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                setMove(i, j, BoardValue.EMPTY);
            }
        }
    }

}
