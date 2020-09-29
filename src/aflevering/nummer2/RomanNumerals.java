package aflevering.nummer2;

import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {
        //this part inports a file called "Intro"
        Intro ob = new Intro();
        ob.introduction();

        //imports Scanner
        Scanner console = new Scanner(System.in);

        while (true) { //This maintains the converting process
            System.out.print("Enter positive integer to convert: ");
            getInt(console);
            IntTORoman(console.nextInt());
        }

    }

    //this method makes sure that the user enters an integer
    public static void getInt(Scanner console) {
        while (!console.hasNextInt()) {
            //this part clears Scanner
            console.next();
            System.out.print("Please enter an integer: ");
        }


    }

    //this method converts the integer to Roman numeral
    public static String IntTORoman(int console) {
        //we define x and hello, the hello part is encase the user enters 0
        StringBuilder x = new StringBuilder();
        int hello = console;
        // the part finds the closest number and subtracts that with the total value
        //We use StringBuilder.append() so that every String concatenation does not copy the whole String
        while (console >= 1000) {
            x.append("M");
            console -= 1000;
        }
        while (console >= 900) {
            x.append("CM");
            console -= 900;

        }
        while (console >= 500) {
            x.append("D");
            console -= 500;

        }
        while (console >= 400) {
            x.append("CD");
            console -= 400;

        }
        while (console >= 100) {
            x.append("C");
            console -= 100;

        }
        while (console >= 90) {
            x.append("XC");
            console -= 90;

        }
        while (console >= 50) {
            x.append("L");
            console -= 50;

        }
        while (console >= 40) {
            x.append("XL");
            console -= 40;

        }

        while (console >= 10) {
            x.append("X");
            console -= 10;

        }
        while (console >= 9) {
            x.append("IX");
            console -= 9;

        }
        while (console >= 5) {
            x.append("V");
            console -= 5;

        }
        while (console >= 4) {
            x.append("IV");
            console -= 4;

        }
        while (console >= 1) {
            x.append("I");
            console -= 1;

        }
        //There is no symbol for 0 so it returns "nulla" which means 0, we use the variable "hello" so it does not interfere
        if (hello == 0) {
            x = new StringBuilder("nulla");

        }
        //this asks for a positive integer encase the input value > 0, we use the variable "hello" so it does not interfere
        else if (hello < 0) {
            System.out.println("please enter a positive integer");
            return null;
        }

        System.out.println(hello + " " + "=" + " " + x);
        return x.toString();

    }
}



