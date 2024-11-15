package View;

import Model.Pawn;

import javax.swing.*;
import java.awt.*;

public class PawnView extends JPanel {

    private final Pawn pawn;

    public PawnView(Pawn pawn) {
        this.pawn = pawn;
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int parentWidth = getParent().getWidth();
        int parentHeight = getParent().getHeight();

        System.out.print(getParent());

        int diameter = Math.min(parentWidth, parentHeight) * 60 / 100;

        int x = (parentWidth - diameter) / 2;
        int y = (parentHeight - diameter) / 2;

        if (pawn.getColor() == Utils.Color.BLACK) {
            g.setColor(Color.decode("#282828"));
        } else if (pawn.getColor() == Utils.Color.WHITE) {
            g.setColor(Color.decode("#DBDBDB"));
        }

        g.fillOval(x, y, diameter, diameter);
    }
}
