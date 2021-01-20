package com.chess.game;

import com.chess.enums.Color;

public class Player {

    private String name;
    private final Color color;

    public Player(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
