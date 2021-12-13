package com.snakeAndLadders;

import java.util.HashMap;
import java.util.Map;
public class Board{
    private int end;
    private HashMap<Integer,Integer> snakePositions;
    private HashMap<Integer,Integer> ladderPositions;
    public board(int end){
        this.end=end;
        snakePositions = new HashMap<>();
        ladderPositions =new HashMap<>();

    }
    public void setSnakePositions(int startPosition,int endPosition){
        this.snakePositions.put(startPosition,endPosition);
    }
    public void setLadderPositions(int startPosition,int endPosition){
        this.ladderPositions.put(startPosition,endPosition);
    }
    public HashMap<Integer,Integer> getSnakes(){
        return snakePositions;
    }
    public HashMap<Integer,Integer> getSnakes(){
        return ladderPositions;
    }
    public int getEnd(){
        return end;
    }

}