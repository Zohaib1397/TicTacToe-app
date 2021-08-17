package com.TicTacToe.io;

public class Utils {
    private int iterationCounter=0;
    private boolean turn=true;
    private int player1,player2;
    private String Person1,Person2;
    private static Utils instance;
    public static Utils getInstance(){
        if(null == instance){
            instance = new Utils();
            return instance;
        }else{
            return instance;
        }
    }

    public int getIterationCounter() {
        return iterationCounter;
    }

    public void setIterationCounter(int iterationCounter) {
        this.iterationCounter = iterationCounter;
    }

    public int getPlayer1() {
        return player1;
    }

    public void setPlayer1(int player1) {
        this.player1 = player1;
    }

    public int getPlayer2() {
        return player2;
    }

    public void setPlayer2(int player2) {
        this.player2 = player2;
    }

    public boolean getTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public Utils() {
        initData();
    }

    public String getPerson1() {
        return Person1;
    }

    public void setPerson1(String person1) {
        Person1 = person1;
    }

    public String getPerson2() {
        return Person2;
    }

    public void setPerson2(String person2) {
        Person2 = person2;
    }

    private void initData() {
        Person1="Unkown";
        Person2="Unkown";
    }
}
