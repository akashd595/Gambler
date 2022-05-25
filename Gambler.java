package com.bridgelabz.day07_gambling;

import java.util.Random;

public class Gambler {
    static int amount=100;
    final static int BET = 1;
    static int upper = 0;
    static int lower = 0;
    static int betting=0;

    public static void main(String[] args) {

        System.out.println("Welcome to the master of Gambler");
        uc1();
       // uc2();
        uc3();
        System.out.println("amount remaining " + amount);
    }

    static void uc1(){
        System.out.println("total amount "+amount);
        System.out.println("betting amount "+BET);
        //System.out.println("You remaining amount is " + amount);
        }

    public static void uc2() {
        Random random = new Random();
        betting = random.nextInt(2);
        if (betting == 0) {
            //System.out.println("You loose the bet");
            amount--;
            //System.out.println("amount remaining " + amount);
        } else {
            //System.out.println("You won the bet ");
            amount++;
            //System.out.println("You new amount is " + amount);
        }
    }
    public static void uc3(){
        upper = (int)(amount*1.5);
        lower = (int)(amount*0.5);

        while (amount < upper && amount > lower){
            Random random = new Random();
            betting = random.nextInt(2);
            if (betting == 0) {
                amount--;
            } else {
                amount++;
            }
        }
    }
}
