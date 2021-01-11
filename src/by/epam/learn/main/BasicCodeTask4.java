package by.epam.learn.main;

/*
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
 */

import java.util.Scanner;

public class BasicCodeTask4 {

    public static void main(String[] args) {

        double R;
        double result;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите дробное значение - R (через запятую)" + ";))");

        R = in.nextDouble();

        result = math_3(R);

        System.out.println("Результат : " + result);
    }

    public static double math_3(double R) {

        double z;

        z = (R * 1000) % 1000 + (int) R / 1000.0;

        return z;
    }
}
