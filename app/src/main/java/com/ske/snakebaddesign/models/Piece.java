package com.ske.snakebaddesign.models;

public class Piece {
    private int color;
    private int position;
    public Piece(int color){
        this.color = color;
        this.position = 0;
    }

    public int getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void reset(){
        this.position = 0;
    }
}
