package com.chess;

import com.chess.board.Board;
import com.chess.board.Spot;
import com.chess.game.Player;
import com.chess.piece.ChessPiece;
import com.chess.piece.King;

public class ChessGame {


    private Board board;
    private Player player1;
    private Player player2;
    private Player lastPlayer;


    public ChessGame(String firstPlayName, String secondPlayerName) {
        player1 = new Player(firstPlayName, true);
        player2 = new Player(secondPlayerName, false);
        board = new Board();

    }

    public void makeAmove(Player p, ChessPiece piece, Spot spot) {
        if (isMoveAllowed(p, piece, spot)) {
            try {
                boolean isKing = (spot.getCurrentPiece() instanceof King);
                boolean capture = piece.move(spot);
                lastPlayer = p;
                System.out.println("capture " + capture);
                System.out.println("Is Check:" + board.isCheck(piece));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }

    }

    boolean isMoveAllowed(Player p, ChessPiece piece, Spot spot) {
        return isValidTurnForPlayer(p) && isPlayerOwnPiece(p, piece) && spot.isValid() && piece.canMove(spot);

    }

    boolean isValidTurnForPlayer(Player p) {
        return lastPlayer != p;
    }

    boolean isPlayerOwnPiece(Player p, ChessPiece piece) {
        return p.isWhite() == piece.isWhite();
    }

}
