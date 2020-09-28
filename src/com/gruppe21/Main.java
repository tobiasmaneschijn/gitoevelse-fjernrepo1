package com.gruppe21;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Indtast 2 tal skilt af et mellemrum");
        Scanner input = new Scanner(System.in);

        float a = input.nextFloat();
        float b = input.nextFloat();

        System.out.println("Indtast operation");
        Scanner op1 = new Scanner(System.in);

        String op = op1.next();


        if (op.equals("+"))
        {
            System.out.println("Dit svar er " + (a + b));


        }
        if(op.equals("-"))
        {
            System.out.println("Dit svar er " + (a-b));
        }
        if (op.equals("*")){
            System.out.println("Dit svar er " + (a*b));
        }
        if (op.equals("/")){
            System.out.println("Dit svar er " + (a/b));
        }
        System.out.println("Hildis ændring");
        System.out.println("Nej du kan ej");

    }
}