package view;

import coordinate.figure.Figure;
import coordinate.figure.Line;
import util.InputCoordinates;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class OutputView {

    private final InputCoordinates inputCoordinates;
    private final Figure figure;

    public OutputView(InputCoordinates inputCoordinates, Figure figure) {
        this.inputCoordinates = inputCoordinates;
        this.figure = figure;
    }

    public void print() {
        String[][] board = new String[26][26];
        for(int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                board[i][j] = " ";
            }
        }
        for (int i = 0; i < 24; i+=2) {
            board[i][0] = String.valueOf(24-i);
        }
        for (int i = 2; i < 26; i+=2) {
            board[25][i+1] = String.valueOf(i);
        }
        for (int i = 0; i < 25; i++) {
            board[i][1] = "|";
        }
        for (int i = 1; i < 26; i++) {
            board[24][i] = "ㅡ";
        }

        board[24][1] = "+";
        board[25][0] = "0";

        List<int[]> coordinatesInts = inputCoordinates.getCoordinatesInts();
        for (int[] coordinatesInt : coordinatesInts) {
            int x = coordinatesInt[0];
            int y = coordinatesInt[1];
            board[24-y][x+1] = "*";
        }


        for(int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }

        System.out.println(figure.toString());
    }
}
