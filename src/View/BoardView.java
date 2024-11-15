package View;

import Model.Board;
import Model.Case;
import Model.Pawn;

import javax.swing.*;
import java.awt.*;

public class BoardView extends JPanel {

    private CaseView[][] caseViews;

    public BoardView(Board board) {
        setLayout(new GridLayout(board.getSize(), board.getSize()));
        caseViews = new CaseView[board.getSize()][board.getSize()];

        initializeBoard(board);
    }

    private void initializeBoard(Board board) {
        for (Case[] rowCases : board.getCases()) {
            for (Case currentCase : rowCases) {
                Pawn pawn = currentCase.getPawn();

                int row = currentCase.getPosition().getRow();
                int col = currentCase.getPosition().getCol();

                caseViews[row][col] = new CaseView(board, currentCase, pawn);
                add(caseViews[row][col]);
            }
        }
    }
}
