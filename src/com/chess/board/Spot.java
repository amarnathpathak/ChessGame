package com.chess.board;

import com.chess.piece.ChessPiece;

public class Spot {

    private int x;
    private int y;

    private ChessPiece piece;

    public Spot(int x, int y) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    public Spot(int x, int y, ChessPiece piece) {
        this(x, y);
        this.piece = piece;
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

    public ChessPiece getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = piece;
    }


    public boolean isVacant() {
        return piece == null;
    }

    public boolean isNotVacant() {
        return !isVacant();
    }

    public boolean isValid() {
        return this.x >= 0 && this.x < 8 && this.y >= 0 && this.y < 8;
    }
}
