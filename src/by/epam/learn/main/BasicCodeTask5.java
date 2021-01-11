package by.epam.learn.main;

/*
Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.
 */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class BasicCodeTask5 {
    public static void main(String[] args) {

        int T;
        String result;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите целое число - T ");

        T = in.nextInt();

        result = math_4(T);

        System.out.println("Результат: " + result);
    }

    public static String math_4(int T) {

        double h;
        double m;
        double s;


        h = T / 3600;
        m = T % 3600 / 60;
        s = T % 3600 % 60;

        return ((int)h + " ч " +  (int)m + " мин " + (int)s + " с.");

    }
}
