package chess;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 3/31/12
 * Time: 6:00 PM
 */
public class ChessTest {
    @Test
    public void should_pawn_checkmates_king_when_king_at_ONE_step_top_left_of_pawn() {
        ChessBoard aChessBoard = new ChessBoard();
        King aKing = new King();
        Pawn aPawn = new Pawn();

        aChessBoard.put(aKing, new ChessBoardPoint(5, 5));
        aChessBoard.put(aPawn, new ChessBoardPoint(6, 6));

        assertThat(aPawn.isCheckMate(), is(true));
    }

    @Test
    public void should_not_pawn_checkmates_king_when_king_is_not_at_ONE_step_top_left_of_pawn() {
        ChessBoard aChessBoard = new ChessBoard();
        King aKing = new King();
        Pawn aPawn = new Pawn();

        aChessBoard.put(aKing, new ChessBoardPoint(3, 3));
        aChessBoard.put(aPawn, new ChessBoardPoint(6, 6));

        assertThat(aPawn.isCheckMate(), is(false));
    }

    @Test
    //注1：方法命名一定要清楚，代码即文档
    public void should_rook_checkmates_king_when_rook_and_king_in_the_same_line() {
        //注2：完全按照自己的想法来写，比方说这儿，我们需要一个rook和一个king，并且要放到一个棋盘上才能判断是否将军，是吧？
        ChessBoard chessboard = new ChessBoard();
        King king = new King();
        Rook rook = new Rook();

        chessboard.put(king, new ChessBoardPoint(3, 4));
        chessboard.put(rook, new ChessBoardPoint(4, 4));

        assertThat(rook.isCheckmate(), is(true));
    }

    @Test
    public void should_not_rook_checkmates_king_when_rook_and_king_is_not_in_the_same_line() {
        ChessBoard chessboard = new ChessBoard();
        King king = new King();
        Rook rook = new Rook();

        chessboard.put(king, new ChessBoardPoint(3, 3));
        chessboard.put(rook, new ChessBoardPoint(4, 4));

        assertThat(rook.isCheckmate(), is(false));
    }

    @Test
    public void should_not_rook_checkmates_king_when_rook_and_king_is_in_the_same_line_but_pawn_between_them() {
        ChessBoard chessboard = new ChessBoard();
        King king = new King();
        Rook rook = new Rook();
        Pawn pawn = new Pawn();

        chessboard.put(king, new ChessBoardPoint(3, 3));
        chessboard.put(rook, new ChessBoardPoint(3, 5));
        chessboard.put(pawn, new ChessBoardPoint(3, 4));

        assertThat(rook.isCheckmate(), is(false));
    }

    @Test
    public void should_not_rook_checkmates_king_when_rook_and_king_is_in_the_same_line_but_pawn_between_them_2() {
        ChessBoard chessboard = new ChessBoard();
        King king = new King();
        Rook rook = new Rook();
        Pawn pawn = new Pawn();

        chessboard.put(king, new ChessBoardPoint(3, 5));
        chessboard.put(rook, new ChessBoardPoint(3, 3));
        chessboard.put(pawn, new ChessBoardPoint(3, 4));

        assertThat(rook.isCheckmate(), is(false));
    }

}
