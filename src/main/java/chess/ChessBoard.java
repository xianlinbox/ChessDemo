package chess;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 3/31/12
 * Time: 6:09 PM
 */
class ChessBoard {
    private King king;

    private void setPawn(Pawn pawn) {
        this.pawn = pawn;
    }

    private Pawn pawn;

    public void put(King king, ChessBoardPoint point) {
        this.king = king;
        king.setPoint(point);
    }

    public void put(ChessPiece chessPiece, ChessBoardPoint point) {
        if(chessPiece instanceof  Pawn){
            setPawn((Pawn) chessPiece);
        }
        chessPiece.setChessboard(this);
        chessPiece.setPosition(point);
    }

    public ChessBoardPoint getKingPosition(){
        return king.getPosition();
    }

    public Pawn getPawn() {
        return pawn;
    }
}
