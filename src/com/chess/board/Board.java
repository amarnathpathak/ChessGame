package com.chess.board;

import com.chess.piece.ChessPiece;

public class Board {

    private Spot[][] spots = new Spot[8][8];

    public ChessPiece whiteKing;
    public ChessPiece blackKing;

    public Board() {
        initialiseBoard();
    }

    public boolean isCheck(ChessPiece piece) {
        ChessPiece king = piece.isWhite() ? blackKing : whiteKing;
        return piece.canMove(king.getCurrentSpot());
    }


    private void initialiseBoard() {


    }


}
