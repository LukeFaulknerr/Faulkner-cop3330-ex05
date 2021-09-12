/*
    UCF COP3330 Fall 2021 Assignment 5 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        // Variables / Objects
        Scanner readInt = new Scanner(System.in);
        String num1Str, num2Str;
        int add, sub, mult, div;

        // Prompt
        System.out.print("What is the first number? ");
        num1Str = readInt.nextLine();
        System.out.print("What is the second number? ");
        num2Str = readInt.nextLine();

        // Calc output variables
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        add = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;

        // Output
        System.out.println(num1Str + " + " + num2Str + " = " + add);
        System.out.println(num1Str + " - " + num2Str + " = " + sub);
        System.out.println(num1Str + " * " + num2Str + " = " + mult);
        System.out.println(num1Str + " / " + num2Str + " = " + div);
    }
}
