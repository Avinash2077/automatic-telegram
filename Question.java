package com.quizapplication;

import java.util.Scanner;

public class Question {

    Scanner sc=new Scanner(System.in);
    String question;
    String option1,option2,option3,option4;
    int correctanswer,useranswer;

    public boolean askquestion(){

        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        System.out.println("choose the correct answer ");
        useranswer=sc.nextInt();
        if(useranswer==correctanswer){
            return true;

        }
        return false;
    }
}
