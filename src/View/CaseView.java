package View;

import Model.Board;
import Model.Case;
import Model.Pawn;

import javax.swing.*;
import java.awt.*;

public class CaseView extends JPanel {

    private PawnView pawnView;

    public CaseView(Board board, Case currentCase, Pawn pawn) {

        setPreferredSize(new Dimension(getWidth()/board.getSize(), getHeight()/board.getSize()));

        if ((currentCase.getPosition().getRow() + currentCase.getPosition().getCol()) % 2 == 0) {
            setBackground(Color.decode("#1AA95F"));
        } else {
            setBackground(Color.decode("#078949"));
        }

        setLayout(new BorderLayout());

        if (pawn != null) {
            setPawnView(pawn);
        }

    }

    public void setPawnView(Pawn pawn) {
        if (pawn != null) {
            if (pawnView != null) {
                remove(pawnView);
            }
            pawnView = new PawnView(pawn);
            add(pawnView, BorderLayout.CENTER);
        }
        revalidate();
        repaint();
    }
}
