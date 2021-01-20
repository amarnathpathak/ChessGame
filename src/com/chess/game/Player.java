package com.chess.game;

public class Player {

    private String name;
    private boolean white;

    public Player(String name, boolean white) {
        this.name = name;
        this.white = white;
    }

    public boolean isWhite() {
        return white;
    }
}
