package com.chess.piece;

import com.chess.board.Spot;
import com.chess.enums.Color;

public class Bishop extends ChessPiece {
    //Vazir

    public Bishop(String identifier, Color color, Spot currentSpot) {
        super(identifier, color, currentSpot);
    }

    @Override
    protected boolean canMove(Spot spot) {
        int hDistance = Math.abs(spot.getX() - getCurrentSpot().getX());
        int vDistance = Math.abs(spot.getY() - getCurrentSpot().getY());
        return isAvailableToMove(spot) && hDistance == vDistance && noPieceInWay(spot);
    }

    private boolean noPieceInWay(Spot destination) {
        int hDistance = Math.abs(destination.getX() - getCurrentSpot().getX());
        int vDistance = Math.abs(destination.getY() - getCurrentSpot().getY());
        //Find no piece in Move

        return true;
    }
}
