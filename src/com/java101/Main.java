package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Please type a number :");
        number = input.nextInt();

        int empty = number - 1;
        for (int i = 0; i < number; i++)
        {
            for (int j = 0; j < empty; j++)
                System.out.print(" ");
            
            for (int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.print("\n");
            empty--;
        }
        
        empty = 0;
        
        for (int i = number; i > 0; i--)
        {
            for (int j = 0; j < empty; j++)
                System.out.print(" ");
            
            for (int j = 0; j < i; j++)
                System.out.print("* ");

            System.out.print("\n");
            empty++;
        }
    }
}
