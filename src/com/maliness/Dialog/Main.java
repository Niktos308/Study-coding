package com.maliness.Dialog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       day1(); //run code from method (block) with name "day1", change name for other
    }

    public static void day1() { //copy and change name "day1" and code in {}
        /*this is important thing*/
        Scanner in = new Scanner(System.in);

        System.out.print("Input name:");
        String name = in.nextLine();
        System.out.print("Input age:");
        int age = in.nextInt();
        System.out.print("Input height:");
        float height = in.nextFloat();
        System.out.printf("Name: %s Age: %d Height: %.2f \n", name , age, height);
        in.close();
    }
}

