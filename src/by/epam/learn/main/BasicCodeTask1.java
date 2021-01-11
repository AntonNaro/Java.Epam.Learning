package by.epam.learn.main;

import java.util.Scanner;

/*
//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
*/

public class BasicCodeTask1 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double result;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите - a");

        a = in.nextInt();

        System.out.println("Введите - b");

        b = in.nextInt();

        System.out.println("Введите - c");

        c = in.nextInt();

        result = math(a, b, c);

        System.out.println("Результат вычисления = " + result);

    }

    public static double math(double a, double b, double c) {

        double z;

        z = ((a - 3) * b / 2) + c;

        return z;
    }
}