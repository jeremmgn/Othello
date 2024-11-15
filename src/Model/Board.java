package Model;

import Utils.Color;
import Utils.Position;

public class Board {
    private final int size;
    private final Case[][] cases;

    public Board(int size) {
        this.size = size;
        this.cases = new Case[size][size];
        initializeBoard();
    }

    public void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                cases[i][j] = new Case(new Position(i, j), null);
            }
        }

        Pawn blackPawn = new Pawn(Color.BLACK, new Position(size/2 - 1, size/2 - 1));
        Pawn whitePawn = new Pawn(Color.WHITE, new Position(size/2 - 1, size/2));
        Pawn blackPawn2 = new Pawn(Color.BLACK, new Position(size/2, size/2 - 1));
        Pawn whitePawn2 = new Pawn(Color.WHITE, new Position(size/2, size/2));

        cases[size/2 - 1][size/2 - 1].setPawn(blackPawn);
        cases[size/2 - 1][size/2].setPawn(whitePawn);
        cases[size/2][size/2 - 1].setPawn(whitePawn2);
        cases[size/2][size/2].setPawn(blackPawn2);
    }

    public int getSize() {
        return size;
    }

    public Case[][] getCases() {
        return cases;
    }
}
