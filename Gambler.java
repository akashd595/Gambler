package com.bridgelabz.day07_gambling;

import java.util.Random;

public class Gambler {
    static int amount=100;
    final static int BET = 1;
    public static void main(String[] args) {

        System.out.println("Welcome to the master of Gambler");
        System.out.println("total amount "+amount);
        System.out.println("betting amount "+BET);
        Random random = new Random();
        int betting = random.nextInt(2);
        if(betting == 0){
            System.out.println("You loose the bet");
            amount--;
            System.out.println("amount remaining "+amount);
        }else{
            System.out.println("You won the bet ");
            amount++;
            System.out.println("You new amount is "+amount);
        }
    }
}
