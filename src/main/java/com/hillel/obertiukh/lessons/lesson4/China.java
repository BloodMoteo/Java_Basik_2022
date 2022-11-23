package com.hillel.obertiukh.lessons.lesson4;

public class China {
    public static void main(String[] args) {
       /* int livoin = 13;
        int liluk = 24;
        int liver = 46;
        int liallvoin = 860;

        int sumli = liallvoin * (livoin + liluk + liver);
        System.out.println(sumli);

        int minvoin = 9;
        int minluk = 35;
        int minver = 12;
        double minallvoin = 860 * 1.5;
        double minsum = minallvoin * (minvoin + minluk + minver);
        System.out.println(minsum);

        */
        String name = "Li";
        int a = 13;
        int b = 24;
        int c = 46;
        int summ_li = 860*(a+b+c);
        String name1 = "Min";
        int d = 9;
        int e = 35;
        int f = 12;
        double summ_min = 860*(d+e+f)*1.5;

        double summ_li_min = summ_li + summ_min;
        System.out.println("Общий урон династии " + (name) + " = " + (summ_li));
        System.out.println("Общий урон династии " + (name1) + " = " + (summ_min));
        System.out.println("Общий урон двух династий" + " = " + (summ_li_min));
    }
}
