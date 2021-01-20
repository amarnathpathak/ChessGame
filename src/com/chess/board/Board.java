package com.chess.board;

import com.chess.enums.Color;
import com.chess.piece.ChessPiece;

public class Board {

    private Spot[][] spots = new Spot[8][8];

    public ChessPiece whiteKing;
    public ChessPiece blackKing;

    public Board() {
        initialiseBoard();
    }

    public boolean isCheck(ChessPiece piece) {
        ChessPiece king = piece.getColor().equals(Color.WHITE) ? blackKing : whiteKing;
        return piece.canMove(king.getCurrentSpot());
    }


    private void initialiseBoard() {


    }


}
