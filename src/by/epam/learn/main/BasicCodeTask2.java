package by.epam.learn.main;

/*
//Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

import java.util.Scanner;

public class BasicCodeTask2 {

    public static void main(String[] args) {

        double a;
        double b;
        double c;
        double result;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите числовое значение равное - a");

        a = in.nextInt();

        System.out.println("Введите числовое значение равное - b");

        b = in.nextInt();

        System.out.println("Введите числовое значение равное - c");

        c = in.nextInt();

        result = math_1(a, b, c);

        System.out.println("Результат вычисления = " + result);
    }
    public static double math_1(double a, double b, double c) {

        double z;

        z = ((b + (Math.sqrt(Math.pow(b,2) + 4 * a * c))));

        z = z / (2 * a);

        z = z - ((Math.pow(a,3)) * c) + (Math.pow(b,-2));

        return z;
    }
}
