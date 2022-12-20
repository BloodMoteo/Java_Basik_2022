package com.hillel.obertiukh.lessons.lesson6;

import java.util.Scanner;

public class GuesstheNoumber {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 11);
        System.out.println(randomNumber);

        Scanner scan = new Scanner(System.in);
        System.out.println("Вгадайте число, яке загадав компютер:");

        for (int i = 0; i < 3; i++) {
            if (scan.hasNextInt()){
                int inputNumber = scan.nextInt();
                if (randomNumber == inputNumber){
                    System.out.println("Поздравляю, вы выиграли!!!");
                    return;
                }else {
                    System.out.println("Вы не угадали");
                    }
            }else {
                System.out.println("Введите число от 0 до 10");
                scan.nextLine();
            }
            }

//        int randomDigit = (int) (Math.random() * 10);
//        System.out.println(randomDigit);
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 3; i++) {
//            if (scanner.hasNextInt()) {
//                int inputDigit = scanner.nextInt();
//                if (randomDigit == inputDigit) {
//                    System.out.println("Поздравляю, вы выиграли!!!");
//                    return;
//                } else if (i != 2)
//                    System.out.println("Вы не угадали");
//            } else if (i != 2) {
//                System.out.println("Введите число от 0 до 10");
//                scanner.next();
//            }
//        }
//        System.out.println("Вы проиграли");
        }
    }

