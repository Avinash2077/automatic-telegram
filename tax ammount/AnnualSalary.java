package com.salary;

import java.util.Scanner;

public class AnnualSalary {

    String name;
    int date, month, year, salary,age, annual, tax;

    public void getdetails(){

        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("enter the name of the employee :");
        String name = sc.nextLine();
        System.out.println("enter the date of birth :");
        int date = sc.nextInt();
        System.out.println("enter birth month");
        int month =sc.nextInt();
        System.out.println("enter the birth year :");
        int year = sc.nextInt();


    }

    public void display(){

        int age = 2020-year;
        annual = salary*12;
        System.out.println("employee name :"+name);
        System.out.println("employee age :"+age);
        System.out.println("employee salary :"+annual);
        if(annual>500000)
            System.out.println("tax percentage is :"+annual*0.2);
        else if(annual<500000 && annual>400000)
            System.out.println("tax percentage is :"+annual*0.15);
        else if(annual<400000 && annual>300000)
            System.out.println("tax percentage is :"+annual*0.10);
        else if(annual<300000 && annual>200000)
            System.out.println("tax percentage is :"+annual*0.05);
        else
            System.out.println("no tax amount");
    }


}
