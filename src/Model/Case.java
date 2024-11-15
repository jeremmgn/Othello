package Model;

import Utils.Position;

public class Case {
    private final Position position;
    private Pawn pawn;

    public Case(Position position, Pawn pawn) {
        this.position = position;
        this.pawn = null;
    }

    public Position getPosition() {
        return position;
    }

    public Pawn getPawn() {
        return pawn;
    }

    public void setPawn(Pawn pawn) {
        this.pawn = pawn;
    }
}
