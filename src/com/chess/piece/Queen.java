package com.chess.piece;

import com.chess.board.Spot;
import com.chess.enums.Color;

public class Queen extends ChessPiece {
    //Mantri

    public Queen(String identifier, Color color, Spot currentSpot) {
        super(identifier, color, currentSpot);
    }

    @Override
    protected boolean canMove(Spot spot) {
        int hDistance = Math.abs(spot.getX() - getCurrentSpot().getX());
        int vDistance = Math.abs(spot.getY() - getCurrentSpot().getY());
        return isAvailableToMove(spot) && ((Math.abs(hDistance - vDistance) == 1 || hDistance == vDistance) && noPieceInWay(spot));
    }

    private boolean noPieceInWay(Spot destination) {
        return true;
    }
}
