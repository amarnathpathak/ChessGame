package com.chess.piece;

import com.chess.board.Spot;

public abstract class ChessPiece {

    private String identifier;
    private boolean white;
    private Spot currentSpot;

    public ChessPiece(String identifier, boolean white, Spot currentSpot) {
        this.identifier = identifier;
        this.white = white;
        this.currentSpot = currentSpot;
    }

    public String getIdentifier() {
        return identifier;
    }

    public boolean isWhite() {
        return white;
    }

    public Spot getCurrentSpot() {
        return currentSpot;
    }

    protected boolean isAvailableToMove(Spot spot) {
        return spot.isAvailable() || isOppositeColorOnDestinationSpot(spot);
    }

    private boolean isOppositeColorOnDestinationSpot(Spot destination) {
        return !destination.isAvailable() && destination.getCurrentPiece().isWhite() != isWhite();
    }

    //return true if piece can move to given Spot else otherwise;
    public boolean canMove(Spot spot) {
        return isAvailableToMove(spot) && isValidMove(spot);
    }


    public abstract boolean isValidMove(Spot spot);

    //return true if capture opponent piece else otherwise;
    public boolean move(Spot spot) {
        if (canMove(spot)) {
            boolean capture = spot.getCurrentPiece().isWhite() != isWhite();
            spot.setCurrentPiece(this);
            this.currentSpot = spot;
            return capture;
        } else {
            throw new RuntimeException("Not allowed to move");
        }
    }


}
