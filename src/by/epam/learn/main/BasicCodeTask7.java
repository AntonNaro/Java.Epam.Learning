package by.epam.learn.main;

/*
1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.
 */

import java.util.Scanner;

public class BasicCodeTask7 {
    public static void main(String[] args) {

        double a;
        double b;
        boolean result;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение первого угла: ");

        a = in.nextDouble();

        System.out.println("Введите значение второго угла: ");

        b = in.nextDouble();

        result = math_6(a, b);

        System.out.println(result);
    }

    public static boolean math_6(double a, double b) {

        boolean z = true;

        double c;

        double triang = 180;

        c = triang - (a + b);

        double triSum = a + b + c;

        if (c > 0 && a > 0 && b > 0) {
            if (triSum != triang) {
                System.out.println("Не является треугольником");
                z = false;
            } if (triSum == triang) {
                if (c == 90 || a == 90 || b == 90) {
                    System.out.println("Треугольник является прямоугольным");
                } else {
                    System.out.println("Треугольник не является прямоугольным");
                    z = false;
                }
            }
        } else {
            System.out.println("Не является треугольником");
            z = false;
        }
        return z;
    }
}
