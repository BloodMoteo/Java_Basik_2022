package com.hillel.obertiukh.lessons.lesson5;
import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Імя першої команди: ");
        String teamName = scanner.nextLine();
        String firstName = teamName;
        System.out.println("Ввести кількість фрагів для першого гравця: ");
       /* if (scanner.hasNextInt()){
            int one = scanner.nextInt();
            System.out.println(one);
        }else if ()

        */
        int firstFrag = scanner.nextInt();
        System.out.println("Ввести кількість фрагів для другого гравця: ");
        int twoFrag = scanner.nextInt();
        System.out.println("Ввести кількість фрагів для третього гравця: ");
        int threeFrag = scanner.nextInt();
        System.out.println("Ввести кількість фрагів для четвертого гравця: ");
        int fourFrag = scanner.nextInt();
        System.out.println("Ввести кількість фрагів для пятого гравця: ");
        int fiveFrag = scanner.nextInt();
        int midKills = (firstFrag + twoFrag + threeFrag + fourFrag + fiveFrag)/5;
        int kills = (firstFrag + twoFrag + threeFrag + fourFrag + fiveFrag);

        System.out.println();

        Scanner two = new Scanner(System.in);
        System.out.println("Імя другої команди: ");
        String teamName2 = two.nextLine();
        String twoName = teamName2;
        System.out.println("Ввести кількість фрагів для першого гравця: ");
        int firstFrag1 = two.nextInt();
        System.out.println("Ввести кількість фрагів для другого гравця: ");
        int twoFrag1 = two.nextInt();
        System.out.println("Ввести кількість фрагів для третього гравця: ");
        int threeFrag1 = two.nextInt();
        System.out.println("Ввести кількість фрагів для четвертого гравця: ");
        int fourFrag1 = two.nextInt();
        System.out.println("Ввести кількість фрагів для пятого гравця: ");
        int fiveFrag1 = two.nextInt();
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

