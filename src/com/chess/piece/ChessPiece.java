package com.chess.piece;

import com.chess.board.Spot;
import com.chess.enums.Color;

public abstract class ChessPiece {

    private String identifier;
    private final Color color;
    private Spot currentSpot;

    public ChessPiece(String identifier, Color color, Spot currentSpot) {
        this.identifier = identifier;
        this.color = color;
        this.currentSpot = currentSpot;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Color getColor() {
        return color;
    }

    public Spot getCurrentSpot() {
        return currentSpot;
    }

    //check if destination spot is free or destination spot has opposite color piece;
    protected boolean isAvailableToMove(Spot destination) {
        return destination.isVacant() || hasOppositeColor(destination);
    }

    private boolean hasOppositeColor(Spot destination) {
        return destination.isNotVacant() && destination.getPiece().getColor() != getColor();
    }


    //return true if piece can move to given Spot else otherwise;
    public abstract boolean canMove(Spot spot);

    //return true if capture opponent piece else otherwise;
    public boolean move(Spot spot) {
        if (canMove(spot)) {
            boolean capture = spot.isNotVacant() && spot.getPiece().getColor() != getColor();
            spot.setPiece(this);
            this.currentSpot = spot;
            return capture;
        } else {
            throw new RuntimeException("Not allowed to move");
        }
    }


}
