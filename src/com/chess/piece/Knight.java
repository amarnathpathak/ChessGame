package com.chess.piece;

import com.chess.board.Spot;
import com.chess.enums.Color;

public class Knight extends ChessPiece {

    public Knight(String identifier, Color color, Spot currentSpot) {
        super(identifier, color, currentSpot);
    }

    @Override
    protected boolean canMove(Spot spot) {
        int hDistance = Math.abs(spot.getX() - getCurrentSpot().getX());
        int vDistance = Math.abs(spot.getY() - getCurrentSpot().getY());
        return isAvailableToMove(spot) && hDistance * vDistance == (2);
    }

}
