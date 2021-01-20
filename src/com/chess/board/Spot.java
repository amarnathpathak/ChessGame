package com.chess.board;

import com.chess.piece.ChessPiece;

public class Spot {

    private int x;
    private int y;

    private ChessPiece currentPiece;

    public Spot(int x, int y) {
        this.x = x;
        this.y = y;
        this.currentPiece = currentPiece;
    }

    public Spot(int x, int y, ChessPiece currentPiece) {
        this(x, y);
        this.currentPiece = currentPiece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ChessPiece getCurrentPiece() {
        return currentPiece;
    }

    public void setCurrentPiece(ChessPiece currentPiece) {
        this.currentPiece = currentPiece;
    }


    public boolean isAvailable() {
        return currentPiece == null;
    }

    public boolean isValid() {
        return this.x >= 0 && this.x < 8 && this.y >= 0 && this.y < 8;
    }
}
