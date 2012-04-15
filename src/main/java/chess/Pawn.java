package chess;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 3/31/12
 * Time: 6:10 PM
 */
class Pawn extends ChessPiece {

    public boolean isCheckMate() {
        return getPosition().isAtTopLeft(getChessboard().getKingPosition());
    }
}
