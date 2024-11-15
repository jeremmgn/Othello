package View;

import Model.Board;

import javax.swing.*;
import java.awt.*;

public class OthelloView extends JFrame {

    private BoardView boardView;

    public OthelloView(Board board) {
        setTitle("Othello");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(board.getSize() * 100, board.getSize() * 100);
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(Color.decode("#078949"));

        boardView = new BoardView(board);
        add(boardView, BorderLayout.CENTER);

        setVisible(true);
    }
}
