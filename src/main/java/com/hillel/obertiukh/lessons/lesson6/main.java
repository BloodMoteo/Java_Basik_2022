package com.hillel.obertiukh.lessons.lesson6;

import com.hillel.obertiukh.lessons.lesson3.HomeWork;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        System.out.println(0 + Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(9));
        System.out.println();
        System.out.println(5 | 9); //or
        System.out.println(5 & 9);//and
        System.out.println(5 ^ 9);//xor

        System.out.println();
        System.out.println(Integer.toBinaryString(13));
        System.out.println("000" + Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(12));
        System.out.println();
        System.out.println(5 << 5);// По бітовий зсув
        System.out.println(160 >> 5);// По бітовий зсув


         */
/*
        if (){
            System.out.println();
        }else {
            System.out.println();
        }

        if (){
            System.out.println();
        } else if () {
            System.out.println();
        }else {
            System.out.println();
        }

        int a = 32;
        int b= 22;

        System.out.println((a < b) ? "YES" : "NO");// Три нарний оператор можна замість if


        //switch

        switch (a){
            case 1:{
                System.out.println();
            }
            case 2:{
                System.out.println();
            }
            case n:{
                System.out.println();
                break;
            }
            //OR
            default:{
                System.out.println();
                break;
            }
        }

 */
        ///Scanner

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some integer:");
        if (scanner.hasNextInt()){
            int a = scanner.nextInt();
            System.out.println(a);
        }
        System.out.println("BAD VERSION");
        System.out.println(scanner.nextLine());


        */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some integer:");
        if (scanner.hasNextInt()){
            int a = scanner.nextInt();
            System.out.println(a);
            //break; stop ciklum
        }else {
            scanner.nextLine();
        }
        */
        /*
        int num1 = 0;
        int num2 = 1;
        int sum;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 0; i < 45; i++) {
            sum = num1 + num2;
            System.out.print(sum + " ");
            num1 = num2;
            num2 = sum;
        }
*/

//        timer
//
//        int timer = 10;
//        while (timer > -1){
//            System.out.println(timer);
//            if (timer == 0 ){
//                System.out.println("BOOM!");
//            }
//            timer--;
//        }

//      timer generation number 85 - 100
//
//        int timer = 10;
//        while (timer > -1){
//            if ((int) (Math.random() * 101) >= 85){
//                System.out.println("DEFUSE");
//                break;
//            }
//
//            System.out.println(timer);
//            if (timer == 0){
//                System.out.println("BOOM");
//            }
//            timer--;
//        }

//        Обчислити факторіал числа
//        Scanner scan = new Scanner(System.in);
//        int N = 0;
//        while (true) {
//            if (scan.hasNextInt()) {
//                N = scan.nextInt();
//                if (N < 0 || N > 30){
//                    System.out.println("Please enter number from 0 to 30");
//                }else {
//                    break;
//                }
//            } else {
//                System.out.println("Wrong data, try again!");
//                scan.nextLine();
//            }
//        }
//
//        int result = 1;
//        for (int i = 1; i <= N; i++) {
//            result *= i;
//        }
//        System.out.println(result);


//        HomeWork

        int counter = 0;
        for (int i = 1; i < 101; i++) {
            if ((i == 4) || (i == 9) || (i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9)){
                continue;
            }
            System.out.println("shutlle number:" + i);
            counter++;
        }
        System.out.println("count:" + counter);
    }

}
