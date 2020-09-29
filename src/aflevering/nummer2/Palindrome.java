package aflevering.nummer2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        //this part imports a file called "Intro"
        Intro ob = new Intro();
        ob.introduction();
        Scanner console = new Scanner(System.in);

        //This while command maintains the converting process
        while (true) {
            System.out.print("Enter line to check: ");
            getString(console);
            stringIsGood(console);
        }
    }

    //this method makes sure that the user inputs a String
    public static void getString(Scanner console) {
        while (console.hasNextInt()) {
            console.nextLine();
            System.out.print("Please enter a string: ");


        }

    }

    //this method reverses the string and then checks if the reversed string is equal the original
    public static void stringIsGood(Scanner console) {
        StringBuilder rev = new StringBuilder();
        String original = console.nextLine();
        //this is a for loop that reverses the string
        for (int i = original.length() - 1; i >= 0; i--) {
           //We use append so that the program does not copy the whole String
            rev.append(original.charAt(i));
        }
        //the program checks if the reversed string is equal to the original and ignores case letters
        if (rev.toString().equalsIgnoreCase(original)) {
            System.out.println("\"" + original + "\"" + " is a palindrome!");
        } else {
            System.out.println("\"" + original + "\"" + " is not a palindrome");
        }

    }
}
