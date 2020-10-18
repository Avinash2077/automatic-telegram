package com.array;

import java.util.Scanner;

public class MainClass{

    public static void main(String[] args) {
	// write your code here
        int sum=0,i;
        int arr[]=new int[100];
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the 5 numbers :\n");


        for(i=0;i<5;i++)
            arr[i]=sc.nextInt();
            sum+=arr[i];
        System.out.println("sum of 5 numbers is :"+sum);
    }
}
