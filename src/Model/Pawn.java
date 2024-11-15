package Model;

import Utils.Color;
import Utils.Position;

public class Pawn {
    private Color color;
    private final Position position;

    public Pawn(Color color, Position position) {
        this.color = color;
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public Position getPosition() {
        return position;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
