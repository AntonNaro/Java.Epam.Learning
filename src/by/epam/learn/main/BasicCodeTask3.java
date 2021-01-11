package by.epam.learn.main;

/*
 Вычислить значение выражения по формуле (все переменные принимают действительные значения).
 */

import java.util.Scanner;

public class BasicCodeTask3 {

    public static void main(String[] args) {

        double x;
        double y;
        double result;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите - x");

        x = in.nextInt();

        System.out.println("Введите - y");

        y = in.nextInt();

        result = math_2(x, y);

        System.out.println("Результат вычисления = " + result);
    }

    public static double math_2(double x, double y) {

        double z;

        z = (Math.sin(x) + Math.cos(y));

        z = z / (Math.cos(x) - Math.sin(y));

        z = z * (Math.tan(x * y));

        return z;
    }
}
