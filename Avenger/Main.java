package com.Avenger;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int b;
        Avenger[] a= new Avenger[10];
        for(b=0;b<3;b++) {
            a[b] = new Avenger();
        }
        for(b=0;b<3;b++) {
            a[b].getdetails();
        }
        for(b=0;b<3;b++) {
            a[b].displaydetails();
        }
    }
}
