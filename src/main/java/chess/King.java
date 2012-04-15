package chess;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 3/31/12
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class King {
    private ChessBoardPoint point;

    public void setPoint(ChessBoardPoint point) {
        this.point = point;
    }

    public ChessBoardPoint getPosition() {
        return point;
    }
}
