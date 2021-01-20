package com.chess.piece;

import com.chess.board.Spot;

public class Pawn extends ChessPiece {

    public Pawn(String identifier, boolean white, Spot currentSpot) {
        super(identifier, white, currentSpot);
    }

    @Override
    public boolean isValidMove(Spot spot) {
        //check if spot is free or spot has same color piece;
        if (!spot.isAvailable() || spot.getCurrentPiece().isWhite() == isWhite()) {
            return false;
        }
        int hDistance = Math.abs(spot.getX() - getCurrentSpot().getX());
        int vDistance = spot.getY() - getCurrentSpot().getY();

        return (hDistance == 0 && vDistance == 1) || (hDistance == 1 && vDistance == 1 && spot.getCurrentPiece().isWhite() != isWhite());
    }
}
