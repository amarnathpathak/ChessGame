package com.chess.piece;

import com.chess.board.Spot;

public class Bishop extends ChessPiece {
    //Vazir

    public Bishop(String identifier, boolean white, Spot currentSpot) {
        super(identifier, white, currentSpot);
    }

    @Override
    public boolean isValidMove(Spot spot) {
        //check if spot is free or spot has same color piece;
        if (!spot.isAvailable() || spot.getCurrentPiece().isWhite() == isWhite()) {
            return false;
        }
        int hDistance = Math.abs(spot.getX() - getCurrentSpot().getX());
        int vDistance = Math.abs(spot.getY() - getCurrentSpot().getY());
        return hDistance == vDistance && noPieceInWay(spot);
    }

    private boolean noPieceInWay(Spot destination) {
        int hDistance = Math.abs(destination.getX() - getCurrentSpot().getX());
        int vDistance = Math.abs(destination.getY() - getCurrentSpot().getY());
        //Find no piece in Move

        return true;
    }
}
