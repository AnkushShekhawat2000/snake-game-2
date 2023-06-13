import javax.swing.*;

public class SnakeGame extends JFrame {
    Board board;

    SnakeGame(){
        board = new Board();
        add(board);
        pack();
        setResizable(false);
        setVisible(true);
    }

    private void add(Board board) {
    }

    public static void main(String[] args) {
    // Intialize snake game
        SnakeGame snakeGame = new SnakeGame();
    }
}
