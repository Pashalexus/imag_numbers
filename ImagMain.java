package com.company;

import java.util.Scanner;

public class ImagMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Imag a1 = new Imag();
        Imag a2 = new Imag();
        Imag a3 = new Imag();
        Imag a6 = new Imag();
        System.out.println();
        System.out.println("Введите первое комплексное число");
        a1.re = in.nextDouble();
        a1.im = in.nextDouble();
        Imag.print(a1);
        System.out.println();
        System.out.println("Введите второе комплексное число");
        a2.re = in.nextDouble();
        a2.im = in.nextDouble();
        Imag.print(a2);
        System.out.println();
        System.out.println();
        System.out.print("sum = ");
        Imag.sum(a1,a2,a3);
        Imag.print(a3);
        System.out.println();
        System.out.print("sub = ");
        Imag.sub(a1,a2,a3);
        Imag.print(a3);
        System.out.println();
        System.out.print("mul = ");
        Imag.mul(a1,a2,a3);
        Imag.print(a3);
        System.out.println();
        System.out.print("sopr = ");
        Imag.sopr(a1,a6);
        Imag.print(a6);
        System.out.println();
        System.out.print("div = ");
        Imag.div(a1,a2,a3);
        System.out.print(" = ");
        Imag.print(a3);
        System.out.println();
        Imag.mod(a1);
        Imag.arg(a1);
        Imag.print(a1);
        System.out.print(" = " + a1.mod + "*(cos " + a1.arg + " + i*sin " + a1.arg + ")");
        System.out.println(" = e^(" + a1.arg + "*i)");
    }
}
