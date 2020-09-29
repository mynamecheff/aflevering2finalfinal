package aflevering.nummer2;
//import random so we can use the command

import java.util.Random;
import java.util.Scanner;


public class BuffonsNeedle {
    public static void main(String[] args) {
        //imports the intro file
        Intro ob = new Intro();
        ob.introduction();
        Scanner console = new Scanner(System.in);
        //This while command maintains the converting process
        while (true) {
            System.out.print("Enter number of iterations: ");
            getInt(console);
            calculator(console.nextDouble());


        }

    }

    //same method as in previous code
    public static void getInt(Scanner console) {
        while (!console.hasNextInt() || !console.hasNextDouble()) {
            //clears console
            console.next();
            System.out.print("Please enter a number: ");
        }
    }
    //this method does the calculations
    public static void calculator(double console) {
        Random generator = new Random(42);
        int value = 0;
        for (int i = 0; i < console; i++) {
            double yLow = generator.nextDouble() * 2;
            double a = generator.nextDouble() * 180;
            double yHigh = yLow + Math.sin(Math.toRadians(a));

            if (yHigh >= 2) {
                value++;
            }
        }

        //here we divide our value with the user input
        double val = console / value;
        //the assignment states that you have to write the output like this
        System.out.println(console + " / " + value + " = " + val);
    }
}



