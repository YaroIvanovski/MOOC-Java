
package ticTacToe;
 
public class TicTacToeLogic {
 
    private String array[][];
    private int turn;
 
    public TicTacToeLogic() {
        array = new String[3][3];
 
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                array[x][y] = " ";
            }
        }
    }
 
    public void setString(int x, int y) {
        if (turn % 2 == 0) {
            array[x][y] = "X";
        } else {
            array[x][y] = "O";
        }
    }
 
    public String turn() {
        if (turn < 10 && turn > -1) {
            if (turn % 2 == 0 || turn == 0) {
                turn++;
                return "X";
            } else {
                turn++;
                return "O";
            }
        }
 
        return " ";
    }
 
    public void getData() {
        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
            }
        }
    }
 
    public String getTurn() {
        if (turn < 10 && turn > -1) {
            if (turn % 2 == 0 || turn == 0) {
                return "X";
            } else {
                return "O";
            }
        }
 
        return " ";
    }
 
    public String checkIfWin() {
 
        for (int i = 0; i < 3; i++) {
            if (array[i][0].equals("X") && array[i][1].equals("X") && array[i][2].equals("X")) {
                return "The end!";
            }
 
            if (array[i][0].equals("O") && array[i][1].equals("O") && array[i][2].equals("O")) {
                return "The end!";
            }
 
            if (array[0][i].equals("O") && array[1][i].equals("O") && array[2][i].equals("O")) {
                return "The end!";
            }
 
            if (array[0][i].equals("X") && array[1][i].equals("X") && array[2][i].equals("X")) {
                return "The end!";
            }
 
            if (array[0][0].equals("X") && array[1][1].equals("X") && array[2][2].equals("X")) {
                return "The end!";
            }
 
            if (array[2][0].equals("X") && array[1][1].equals("X") && array[0][2].equals("X")) {
                return "The end!";
            }
 
            if (array[0][0].equals("O") && array[1][1].equals("O") && array[2][2].equals("O")) {
                return "The end!";
            }
 
            if (array[2][0].equals("O") && array[1][1].equals("O") && array[0][2].equals("O")) {
                return "The end!";
            }
        }
        return " ";
    }
}