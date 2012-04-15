package chess;

class Rook extends ChessPiece {

    public boolean isCheckmate() {
        if (getPawn() != null) {
            ChessBoardPoint pawnPosition = getPawn().getPosition();
            if (pawnPosition.getX() == getPosition().getX() && ((getPosition().getY() < pawnPosition.getY()) && pawnPosition.getY() < getChessboard().getKingPosition().getY()) || (getPosition().getY() > pawnPosition.getY() && pawnPosition.getY() > getChessboard().getKingPosition().getY())) {
                return false;
            }
        }
        return getPosition().isOnSameLine(getChessboard().getKingPosition());
    }

    private Pawn getPawn() {
        return getChessboard().getPawn();
    }
}
