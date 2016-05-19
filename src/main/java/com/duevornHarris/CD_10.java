package com.duevornHarris;

import java.util.Scanner;

/**
 * Created by duevornharris on 5/19/16.
 */
public class CD_10 {
    Scanner sc = new Scanner(System.in);
    public void sumNumbers(){
        System.out.println("Please enter a number.");
        int readInNumber = sc.nextInt();
        int x = 0;
        for (int i =0; i <= readInNumber; i++){
            x+=i;
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        CD_10 newObject = new CD_10();
        newObject.sumNumbers();
    }
}
