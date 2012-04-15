package chess;

public abstract class ChessPiece {
    private ChessBoard chessboard;
    private ChessBoardPoint position;

    protected ChessBoardPoint getPosition() {
        return position;
    }

    protected void setPosition(ChessBoardPoint position) {
        this.position = position;
    }

    protected ChessBoard getChessboard() {
        return chessboard;
    }

    public void setChessboard(ChessBoard chessboard) {
        this.chessboard = chessboard;
    }


}
