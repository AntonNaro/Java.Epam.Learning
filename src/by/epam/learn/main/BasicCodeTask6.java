package by.epam.learn.main;

/*
Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */

import java.util.Scanner;

public class BasicCodeTask6 {
    public static void main(String[] args) {

    double x;
    double y;
    boolean result;

    Scanner in = new Scanner(System.in);
    System.out.println("Введите x: ");

    x = in.nextDouble();

    System.out.println("Введите y: ");

    y = in.nextDouble();

    result = math_5(x, y);

    System.out.println("Результат : " + result);
}
    public static boolean math_5(double x, double y) {
        boolean z;

        if (x <= 2 && y <= 4 && x >= -2 && y >= 0) {
            z = true;
        } else if (x <= 4 && y >= -3 && x >= -4 && y <= 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
