package com.bridgelabz.day07_gambling;

import java.util.Random;

public class Gambler {
    static int amount=100;
    static int revAmount = 100;
    final static int BET = 1;
    static int maxInDay= 0;
    static int maxDay=0;
    static int minInDay=0;
    static int minDay=0;
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
        System.out.println();
        System.out.println("on day "+maxDay+" I won the highest "+maxInDay);
        System.out.println("on day "+minDay+" I lost the most "+minInDay);

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
           uc2();
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
            uc6();
        }else{
            daysWin++;
            uc6();
        }
    }
    public static void uc6(){
        int testing = amount - checkAmount;
        int testLow = checkAmount - amount;
        if(maxInDay < testing){
            maxInDay = testing;
            maxDay = day;
        }

        if(minInDay < testLow ){
            minInDay = testLow;
            minDay = day;
        }

    }
}
