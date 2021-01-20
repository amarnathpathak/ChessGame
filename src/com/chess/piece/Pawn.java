package com.chess.piece;

import com.chess.board.Spot;
import com.chess.enums.Color;

public class Pawn extends ChessPiece {

    public Pawn(String identifier, Color color, Spot currentSpot) {
        super(identifier, color, currentSpot);
    }

    @Override
    protected boolean canMove(Spot spot) {
        int hDistance = Math.abs(spot.getX() - getCurrentSpot().getX());
        int vDistance = spot.getY() - getCurrentSpot().getY();
        return isAvailableToMove(spot)
                && ((hDistance == 0 && vDistance == 1)
                || (hDistance == 1 && vDistance == 1 && !getColor().equals(spot.getPiece().getColor())));
    }
}
