/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);

        System.out.print("Enter the price for item 1: ");
        String price1 = jb.nextLine();
        double p1 = Double.valueOf(price1);
        System.out.print("Enter the quantity of item 1: ");
        String quantity1 = jb.nextLine();
        int q1 = Integer.valueOf(quantity1);

        System.out.print("Enter the price for item 2: ");
        String price2 = jb.nextLine();
        double p2 = Double.valueOf(price2);
        System.out.print("Enter the quantity of item 2: ");
        String quantity2 = jb.nextLine();
        int q2 = Integer.valueOf(quantity2);

        System.out.print("Enter the price for item 3: ");
        String price3 = jb.nextLine();
        double p3 = Double.valueOf(price3);
        System.out.print("Enter the quantity of item 3: ");
        String quantity3 = jb.nextLine();
        int q3 = Integer.valueOf(quantity3);

        double subtotal = (p1 * q1) + (p2 * q2) + (p3 * q3);
        double tax = 0.055 * subtotal;
        double total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}