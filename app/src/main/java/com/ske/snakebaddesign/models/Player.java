package com.ske.snakebaddesign.models;

public class Player {
    private static int NUMBER = 1;
    private int number;
    private Piece piece;
    public Player(int color){
        this.number = NUMBER;
        piece = new Piece(color);
        NUMBER++;
    }

    public int getNumber() {
        return number;
    }

    public int getPosition(){
        return piece.getPosition();
    }

    public void setPosition(int position) {
        piece.setPosition(position);
    }

    public Piece getPiece() {
        return piece;
    }

    public void reset(){
        piece.reset();
    }
}
