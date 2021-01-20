package com.chess.piece;

import com.chess.board.Spot;
import com.chess.enums.Color;

public class Rook extends ChessPiece {

    //Hathi

    public Rook(String identifier, Color color, Spot currentSpot) {
        super(identifier, color, currentSpot);
    }

    @Override
    protected boolean canMove(Spot spot) {
        int hDistance = Math.abs(spot.getX() - getCurrentSpot().getX());
        int vDistance = Math.abs(spot.getY() - getCurrentSpot().getY());
        return Math.abs(hDistance - vDistance) == 1 && noPieceInWay(spot);
    }

    private boolean noPieceInWay(Spot destination) {
        return true;
    }
}
