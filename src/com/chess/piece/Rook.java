package com.chess.piece;

import com.chess.board.Spot;

public class Rook extends ChessPiece {

    //Hathi

    public Rook(String identifier, boolean white, Spot currentSpot) {
        super(identifier, white, currentSpot);
    }

    @Override
    public boolean isValidMove(Spot spot) {
        //check if spot is free or spot has same color piece;
        if (!isAvailableToMove(spot)) {
            return false;
        }
        int hDistance = Math.abs(spot.getX() - getCurrentSpot().getX());
        int vDistance = Math.abs(spot.getY() - getCurrentSpot().getY());

        return Math.abs(hDistance - vDistance) == 1 && noPieceInWay(spot);
    }

    private boolean noPieceInWay(Spot destination) {
        return true;
    }
}
