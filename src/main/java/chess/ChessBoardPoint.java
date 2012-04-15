package chess;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 4/1/12
 * Time: 1:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class ChessBoardPoint {
    private final int x;
    private final int y;

    public ChessBoardPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isOnSameLine(ChessBoardPoint point) {
        return getX() == point.getX() || getY() == point.getY();
    }

    public boolean isAtTopLeft(ChessBoardPoint point) {
        return getX() - 1 == point.getX() && getY() - 1 == point.getY();
    }
}
