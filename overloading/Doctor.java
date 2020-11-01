package com.overloading;

import java.util.Scanner;

public class Doctor {

    String name, designation;
    int age;
    double salary;


public void getdetails() {



    Scanner sc = new Scanner(System.in);

    System.out.println("enter the name of the employee");
    name = sc.nextLine();
    System.out.println("enter the designation");
    designation = sc.nextLine();
    System.out.println("enter the age of the employee");
    age = sc.nextInt();
    System.out.println("enter the salary of the employee");
    salary = sc.nextDouble();

}
     public void display(){


        System.out.println("employee name="+name);
        System.out.println("employee designation="+designation);
        System.out.println("employee age="+age);
        System.out.println("employee salary="+salary);




     }



}
