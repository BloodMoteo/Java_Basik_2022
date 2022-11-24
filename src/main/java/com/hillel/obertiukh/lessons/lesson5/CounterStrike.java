package com.hillel.obertiukh.lessons.lesson5;
import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        System.out.println("Імя першої команди: ");
        String teamName = one.nextLine();
        String firstName = teamName;
        System.out.println("Ввести кількість фрагів для першого гравця: ");
        int firstFrag = one.nextInt();
        System.out.println("Ввести кількість фрагів для другого гравця: ");
        int twoFrag = one.nextInt();
        System.out.println("Ввести кількість фрагів для третього гравця: ");
        int threeFrag = one.nextInt();
        System.out.println("Ввести кількість фрагів для четвертого гравця: ");
        int fourFrag = one.nextInt();
        System.out.println("Ввести кількість фрагів для пятого гравця: ");
        int fiveFrag = one.nextInt();
        int midKills = (firstFrag + twoFrag + threeFrag + fourFrag + fiveFrag)/5;

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

        double whoTop = midKills - midKills1;


        System.out.println("Середнє арифметичне команди "+ firstName + " = " + midKills + " очків");
        System.out.println("Середнє арифметичне команди "+ twoName + " = " + midKills1 + " очків");
        System.out.println("Різниця між командами = "+ whoTop);
        System.out.println("Перемогла команда " +  "набрала "   + "очків");

    }
}
/*teamName*//*result*/