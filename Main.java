package com.quizapplication;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();

        EnterPlayer obj=new EnterPlayer();

        obj.setName(name);
//        Game game=new Game(obj);
//        game.EnterPlayer();
        Game game=new Game();
        game.initGame();
        game.play(obj);
        System.out.println(obj.getName());




    }
}
