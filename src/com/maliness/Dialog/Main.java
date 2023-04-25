package com.maliness.Dialog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //day1();
        //day2();//run code from method (block) with name "day1", change name for other
        //day3();
        day3_1();
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
        System.out.printf("Name: %s Age: %d Height: %.2f", name, age, height);
        in.close();
    }

    public static void day2() {
        Scanner cool = new Scanner(System.in);
        System.out.print("Input name, please: ");
        String name = cool.nextLine();
        System.out.print("Input age: ");
        int age = cool.nextInt();
        System.out.print("Input height: ");
        double height = cool.nextDouble();
        System.out.print("Can he swim: ");
        boolean swim = cool.nextBoolean();
        System.out.printf("Name: %s Age: %d Height: %.2f Can he swim: %b", name, age, height, swim);
    }

    public static void day3() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        double height = in.nextDouble();
        System.out.print("Can he swim: ");
        boolean canHeSwim = in.nextBoolean();
        String answer;
        if (canHeSwim) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        System.out.printf("Name: %s Age: %d Height: %.2f Can he swim: %s", name, age, height, answer);
        in.close();
    }

    public static void day3_1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        double height = in.nextDouble();
        System.out.print("Can he swim: ");
        boolean canHeSwim = in.nextBoolean();
        String answer = canHeSwim ? "Yes" : "No"; //тернарный оператор
//        if (canHeSwim) {
//            answer = "Yes";
//        } else {
//            answer = "No";
//        }
        System.out.printf("Name: %s Age: %d Height: %.2f Can he swim: %s", name, age, height, answer);
        in.close();
    }
}
