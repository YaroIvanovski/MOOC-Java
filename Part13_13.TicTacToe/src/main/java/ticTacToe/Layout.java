
package ticTacToe;
 
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
 
public class Layout {
 
    private GridPane grid;
    
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    
    private TicTacToeLogic logic;
    private Label top;
    private boolean game;
    private int count;
 
    public Layout(Label top) {
        grid = new GridPane();
 
        grid.setHgap(10);
        grid.setVgap(10);
        
        btn1 = new Button(" ");
        btn2 = new Button(" ");
        btn3 = new Button(" ");
        btn4 = new Button(" ");
        btn5 = new Button(" ");
        btn6 = new Button(" ");
        btn7 = new Button(" ");
        btn8 = new Button(" ");
        btn9 = new Button(" ");
        
        this.top = top;
        logic = new TicTacToeLogic();
        count = 0;
        game = true;
 
        setLayout();
        setAction();
    }
 
    public void setLayout() {
        btn1.setFont(Font.font("Monospaced", 40));
        btn2.setFont(Font.font("Monospaced", 40));
        btn3.setFont(Font.font("Monospaced", 40));
        btn4.setFont(Font.font("Monospaced", 40));
        btn5.setFont(Font.font("Monospaced", 40));
        btn6.setFont(Font.font("Monospaced", 40));
        btn7.setFont(Font.font("Monospaced", 40));
        btn8.setFont(Font.font("Monospaced", 40));
        btn9.setFont(Font.font("Monospaced", 40));
 
        grid.addRow(0, btn1, btn2, btn3);
        grid.addRow(1, btn4, btn5, btn6);
        grid.addRow(2, btn7, btn8, btn9);
 
    }
    
    public int getCount() {
        return this.count;
    }
 
    public GridPane getLayout() {
        return grid;
    }
 
    public String checkWinner() {
        if (logic.checkIfWin().equals("The end!") || logic.checkIfWin().equals("The end!")) {
            game = false;
            return logic.checkIfWin();
        }
        
        if (this.getCount() == 8) {
            return "The end!";
        }
        
         return "Turn: " + logic.getTurn();
    }
 
    public void setAction() {
        btn1.setOnMouseClicked((event) -> {
            if (btn1.getText().equals(" ") && game == true) {
                logic.setString(0, 0);
                btn1.setText(logic.turn());
               top.setText("Turn: " + logic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });
 
        btn2.setOnMouseClicked((event) -> {
            if (btn2.getText().equals(" ") && game == true) {
                logic.setString(0, 1);
                btn2.setText(logic.turn());
                top.setText("Turn: " + logic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });
 
        btn3.setOnMouseClicked((event) -> {
            if (btn3.getText().equals(" ") && game == true) {
                logic.setString(0, 2);
                btn3.setText(logic.turn());
                top.setText("Turn: " + logic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });
 
        btn4.setOnMouseClicked((event) -> {
            if (btn4.getText().equals(" ") && game == true) {
                logic.setString(1, 0);
                btn4.setText(logic.turn());
                top.setText("Turn: " + logic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });
 
        btn5.setOnMouseClicked((event) -> {
            if (btn5.getText().equals(" ") && game == true) {
                logic.setString(1, 1);
                btn5.setText(logic.turn());
                top.setText("Turn: " + logic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });
 
        btn6.setOnMouseClicked((event) -> {
            if (btn6.getText().equals(" ") && game == true) {
                logic.setString(1, 2);
                btn6.setText(logic.turn());
                top.setText("Turn: " + logic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });
 
        btn7.setOnMouseClicked((event) -> {
            if (btn7.getText().equals(" ") && game == true) {
                logic.setString(2, 0);
                btn7.setText(logic.turn());
                top.setText("Turn: " + logic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });
 
        btn8.setOnMouseClicked((event) -> {
            if (btn8.getText().equals(" ") && game == true) {
                logic.setString(2, 1);
                btn8.setText(logic.turn());
                top.setText("Turn: " + logic.getTurn());
                top.setText(checkWinner());
                count++;
            }
        });
 
        btn9.setOnMouseClicked((event) -> {
            if (btn9.getText().equals(" ") && game == true) {
                logic.setString(2, 2);
                btn9.setText(logic.turn());
                top.setText("Turn: " + logic.getTurn());
                top.setText(checkWinner());
                count++;
            }
 
            logic.getData();
        });
    }
}