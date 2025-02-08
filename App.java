import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth=600;
        int boardHeigth=boardWidth;

        JFrame frame =new JFrame("snake");
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeigth);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SnakeGame snakeGame=new SnakeGame(boardWidth, boardHeigth);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();


    }
}
