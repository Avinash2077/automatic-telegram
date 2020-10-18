package com.Avenger;

import java.util.Scanner;

public class Avenger{

    String name,weapon,planet;
    int age,power;


    public void getdetails() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name :");
        String name = sc.next();
        System.out.println("enter the weapon :");
        String weapon = sc.next();
        System.out.println("enter the planet :");
        String planet = sc.next();
        System.out.println("enter the age :");
        int age = sc.nextInt();
        System.out.println("enter te power :");
        int power = sc.nextInt();
    }
        public void displaydetails(){

            System.out.println("Avenger name :"+name);
            System.out.println("Avenger weapon :"+weapon);
            System.out.println("Avenger planet :"+planet);
            System.out.println("Avenger age :"+age);
            System.out.println("Avenger power :"+power);

        }
    }

