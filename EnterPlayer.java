package com.quizapplication;


public class EnterPlayer {


    public String name;
    static int   score;

    public void setName(String name){
        this.name=name;
    }
    public void setScore(int score){
        this.score=score;
    }

    public String getName(){
        return this.name;
    }
    public int getScore() {
        return this.score;
    }
}
