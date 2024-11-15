import Model.Board;
import View.OthelloView;

public class OthelloGame {

    private Board board;
    private OthelloView othelloView;

    public OthelloGame(int size) {
        this.board = new Board(size);
        this.othelloView = new OthelloView(board);
    }

    public static void main(String[] args) {
        System.out.println("Othello Game");
        new OthelloGame(6);
    }
}
