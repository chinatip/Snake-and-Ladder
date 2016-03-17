package com.ske.snakebaddesign.models;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Game extends Observable{
    private int face=0;
    private List<Player> players;
    private Player winner;
    private int boardSize;
    private int turn =0;
    private Die die;
    public Game(int boardSize){
        this.boardSize = boardSize;
        die = new Die();
        players = new ArrayList<>();
        players.add(new Player(Color.BLACK));
        players.add(new Player(Color.WHITE));
    }

    public void roll(){
        Player player = players.get(turn);
        turn++;
        turn %= players.size();
        int face = die.roll();
        this.face = face;
        player.setPosition(adjustPosition(player.getPosition(),face));
        setChanged();
        notifyObservers(player);
    }


    public void reset(){
        for(Player player : players)
            player.reset();
        turn = 0;
    }

    public List<Player> getPlayers() {
        return players;
    }

    private int adjustPosition(int current, int distance) {
        current = current + distance;
        int maxSquare = boardSize * boardSize - 1;
        if(current > maxSquare) {
            current = maxSquare - (current - maxSquare);
        }
        return current;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public boolean isEnd(){
        for(Player player : players)
            if(player.getPosition() == boardSize * boardSize - 1){
                winner = players.get(turn%2);
                return true;
            }
        return false;
    }

    public int getFace() {
        return face;
    }

    public Player getWinner(){
        return winner;
    }

    public int[] getPlayerColors(){
        int[] colors = new int[2];
        for(int i=0;i<2;i++){
            colors[i] = players.get(i).getPiece().getColor();
        }
        return colors;
    }
}
