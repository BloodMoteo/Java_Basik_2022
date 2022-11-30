package com.hillel.obertiukh.lessons.lesson5;

import java.util.Scanner;

public class CounterStrikeWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Імя першої команди: ");
        String teamName = scanner.nextLine();
        String firstName = teamName;
        System.out.println("Ввести кількість фрагів для першого гравця: ");
        int firstFrag = 0;
        while (true){
            if (scanner.hasNextInt()){
                firstFrag = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please tray again");
                scanner.nextLine();
            }
        }
        System.out.println("Ввести кількість фрагів для другого гравця: ");
        int twoFrag = 0;
        while (true){
            if (scanner.hasNextInt()){
                twoFrag = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please tray again");
                scanner.nextLine();
            }
        }
        System.out.println("Ввести кількість фрагів для третього гравця: ");
        int threeFrag = 0;
        while (true){
            if (scanner.hasNextInt()){
                threeFrag = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please tray again");
                scanner.nextLine();
            }
        }
        System.out.println("Ввести кількість фрагів для четвертого гравця: ");
        int fourFrag = 0;
        while (true){
            if (scanner.hasNextInt()){
                fourFrag = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please tray again");
                scanner.nextLine();
            }
        }
        System.out.println("Ввести кількість фрагів для пятого гравця: ");
        int fiveFrag = 0;
        while (true){
            if (scanner.hasNextInt()){
                fiveFrag = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please tray again");
                scanner.nextLine();
            }
        }
        int midKills = (firstFrag + twoFrag + threeFrag + fourFrag + fiveFrag)/5;
        int kills = (firstFrag + twoFrag + threeFrag + fourFrag + fiveFrag);

        scanner.nextLine();
        System.out.println("Імя другої команди: ");
        String teamName2 = scanner.nextLine();
        String twoName = teamName2;
        System.out.println("Ввести кількість фрагів для першого гравця: ");
        int firstFrag1 = 0;
        while (true){
            if (scanner.hasNextInt()){
                firstFrag1 = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please tray again");
                scanner.nextLine();
            }
        }
        System.out.println("Ввести кількість фрагів для другого гравця: ");
        int twoFrag1 = 0;
        while (true){
            if (scanner.hasNextInt()){
                twoFrag1 = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please tray again");
                scanner.nextLine();
            }
        }
        System.out.println("Ввести кількість фрагів для третього гравця: ");
        int threeFrag1 = 0;
        while (true){
            if (scanner.hasNextInt()){
                threeFrag1 = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please tray again");
                scanner.nextLine();
            }
        }
        System.out.println("Ввести кількість фрагів для четвертого гравця: ");
        int fourFrag1 = 0;
        while (true){
            if (scanner.hasNextInt()){
                fourFrag1 = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please tray again");
                scanner.nextLine();
            }
        }
        System.out.println("Ввести кількість фрагів для пятого гравця: ");
        int fiveFrag1 = 0;
        while (true){
            if (scanner.hasNextInt()){
                fiveFrag1 = scanner.nextInt();
                break;
            }else {
                System.out.println("Wrong data! Please tray again");
                scanner.nextLine();
            }
        }
        int midKills1 = (fiveFrag1 + twoFrag1 + threeFrag1 + fourFrag1 + firstFrag1)/5;
        int kills1 = (fiveFrag1 + twoFrag1 + threeFrag1 + fourFrag1 + firstFrag1);

        double whoTop = midKills - midKills1;

        boolean victory = midKills > midKills1;
        String victoryName = victory ? teamName : teamName2;

        boolean res = kills > kills1;
        double result = res ? kills : kills1;

        System.out.println("Середнє арифметичне команди "+ firstName + " = " + midKills + " очків");
        System.out.println("Середнє арифметичне команди "+ twoName + " = " + midKills1 + " очків");
        System.out.println("Різниця між командами = "+ whoTop);
        System.out.println("Перемогла команда " + victoryName + " набрала " + result + " очків");
    }
}
