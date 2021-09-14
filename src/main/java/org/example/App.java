package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App 
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String orderInput = in.nextLine();
        System.out.print("What state do you live in? ");
        String stateInput = in.nextLine();
        System.out.print("What county do you live in? ");
        String countyInput = in.nextLine();

        double order = Double.parseDouble(orderInput);
        String output = "The total is $" + order;

        if(stateInput.equals("Wisconsin")) {
            double tax = order * 0.05;
            double sTotal = tax + order;
            output = "The subtotal is $" + order + ".\nThe tax is $" + tax +".\nThe total is $" + sTotal;

            if(countyInput.equals("Eau Claire")) {
                tax = order * 0.055;
                sTotal = tax + order;
                output = "The subtotal is $" + order + ".\nThe tax is $" + tax +".\nThe total is $" + sTotal;
            }
            if(countyInput.equals("Dunn")) {
                tax = order * 0.054;
                sTotal = tax + order;
                output = "The subtotal is $" + order + ".\nThe tax is $" + tax +".\nThe total is $" + sTotal;
            }

        }
        if(stateInput.equals("Illinois")) {
            double tax = order * 0.08;
            double wTotal = tax + order;
            output = "The subtotal is $" + order + ".\nThe tax is $" + tax +".\nThe total is $" + wTotal;

        }

        System.out.print(output);


    }
}
