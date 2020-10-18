package com.array;

public class Main{

    public static void main(String[] args) {
	// write your code here
        int arr[]={20,54,35,89,55};

        int i;

        for(i=0;i<5;i++)

            if(i%2==0)
                continue;
            else
                System.out.println(arr[i]+"\t");

    }
}
