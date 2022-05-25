package com.bridgelabz.day07_gambling;

import java.util.Random;

public class Gambler {
    static int amount=100;
    static int revAmount = 100;
    final static int BET = 1;
    static int upper = 0;
    static int lower = 0;
    static int betting=0;
    static int day =0;
    static int checkAmount = 0;
    static int daysWin = 0;
    static int daysLost = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to the master of Gambler");
        revAmount = amount;
        uc1();
        uc3();

        System.out.println("amount remaining " + amount);
        System.out.println();
        System.out.println("Number of days won"+daysWin);
        System.out.println("Number of days lose"+daysLost);
        if(amount<revAmount){
            System.out.println("player lost by "+(revAmount-amount));
        }else {
            System.out.println("Player won by "+(amount-revAmount));
        }

    }

    static void uc1(){
        System.out.println("total amount "+amount);
        System.out.println("betting amount "+BET);
        revAmount = amount;
    }
    public static void uc2() {
        Random random = new Random();
        betting = random.nextInt(2);
        if (betting == 0) {
            amount--;
        } else {
            amount++;
        }
    }
    public static void uc3(){
        upper = (int)(amount*1.5);
        lower = (int)(amount*0.5);
        day++;
        checkAmount = amount;
        while (amount < upper && amount > lower){
            Random random = new Random();
            betting = random.nextInt(2);
            if (betting == 0) {
                amount--;
            } else {
                amount++;
            }
        }
        if(day <= 20){

            uc4();
        }
    }
    public static void uc4(){
        while(day<=20){
            System.out.println("Day "+day);
            System.out.println("Amount "+amount);
            uc5();
            uc3();
        }
    }
    public static void uc5(){
        if(checkAmount > amount){
            daysLost++;
        }else{
            daysWin++;
        }
    }
}
