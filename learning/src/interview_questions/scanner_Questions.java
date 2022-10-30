package interview_questions;

import java.util.Scanner;

public class scanner_Questions {

     public static void main(String[] args) {
        // Write a Java Program to print the input from the scanner?

            Scanner s = new Scanner(System.in);  // why we need to close this object reference
            System.out.println("Print your name:");
            String name = s.next();    // next() --> this method takes user input
            System.out.println("Enter your age:");
            int age = s.nextInt();
            System.out.println("Enter your gender: - M/F");
            char gender = s.next().charAt(0);
            System.out.println("Enter your answer as: true or false");
            boolean answer = s.nextBoolean();


         System.out.println("Your name is "+ name);
         System.out.println("Your name is "+ age);
         System.out.println("Your name is "+ gender);
         System.out.println("Your name is "+ answer);

         s.close(); // --> this is used to close the object reference


    }

}
