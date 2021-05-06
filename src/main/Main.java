/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main; 
import java.util.Scanner;

/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String args[]){
    Scanner in  = new Scanner(System.in);
    int choice;
    //divider
    do {
    System.out.println("Welcome, user! Please input your numerical selection "
 + "based on the menu below");
   //menu
    System.out.println("===== M E N U ====="); //divider & title
    System.out.println("1. Perimeter of a rectangle");
    System.out.println("2. Area of a rectangle");
    System.out.println("3. Perimeter of a circle");
    System.out.println("4. Area of a circle ");
    System.out.println("5. Mysterious yet cool selection");
    choice = in.nextInt(); 
    //divder 
    if (choice == 1) {
        System.out.println("Choose the length...");
        double dLength = in.nextDouble();
        System.out.println("Choose the width...");
        double dWidth = in.nextDouble();
        double dTotal = dLength + dWidth; 
        System.out.println("Great answers! "
     + "The perimeter of your rectangle is " + dTotal * 2);
    //divider
    } else if (choice == 2) {
        System.out.println("Choose the length..."); 
        double dLength2 = in.nextDouble(); 
        System.out.println("Choose the width...");
        double dWidth2 = in.nextDouble();
        double dTotal2 = dLength2 * dWidth2;
        System.out.println("Great answers! "
     + "The area of your rectangle is " + dTotal2); 
    //divider
    } else if (choice == 3) {
        System.out.println("What is the radius?");
        double dRadius = in.nextDouble();
        double dTotal3 = dRadius * 2;
        System.out.println ("Great Answers! "
     + "The perimeter of your circle is " + dTotal3 * Math.PI);
    //divider
    } else if (choice == 4) {
        System.out.println("What is the radius?");
        double dRadius2 = in.nextDouble(); 
        double dTotal4 = Math.pow(dRadius2,2);
        System.out.println("Great answers! "
     + "The area of your circle is " + dTotal4 * Math.PI); 
    } else if (choice == 5) {
        System.out.println("Hahaha, you got tricked: Sorry not sorry!"); }

     //end of if statements
    } while (choice !=5); 
    in.close(); 
} 

} 
